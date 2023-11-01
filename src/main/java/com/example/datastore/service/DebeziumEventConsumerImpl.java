package com.example.datastore.service;

import com.example.datastore.model.Data;
import com.example.datastore.model.MeasurementType;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

@Service
@RequiredArgsConstructor
public class DebeziumEventConsumerImpl implements CDCEventConsumer {

    private final SummaryService summaryService;

    @KafkaListener(topics = "data")
    public void handle(String message) {
        try {
            JsonObject payload = JsonParser.parseString(message)
                    .getAsJsonObject()
                    .get("payload")
                    .getAsJsonObject();
            Data data = new Data();
            data.setId(
                    payload.get("id")
                            .getAsLong()
            );
            data.setSensorId(
                    payload.get("sensor_id")
                            .getAsLong()
            );
            data.setMeasurement(
                    payload.get("measurement")
                            .getAsDouble()
            );
            data.setMeasurementType(
                    MeasurementType.valueOf(
                            payload.get("type")
                                    .getAsString()
                    )
            );
            data.setTimestamp(
                    LocalDateTime.ofInstant(
                            Instant.ofEpochMilli(
                                    payload.get("timestamp")
                                            .getAsLong() / 1000
                            ),
                            TimeZone.getDefault()
                                    .toZoneId()
                    )
            );
            summaryService.handle(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
