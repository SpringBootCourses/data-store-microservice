package com.example.datastore.service;

import com.example.datastore.model.Data;
import com.example.datastore.model.MeasurementType;
import com.example.datastore.model.Summary;
import com.example.datastore.model.SummaryType;
import com.example.datastore.model.exception.SensorNotFoundException;
import com.example.datastore.repository.SummaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class SummaryServiceImpl implements SummaryService {

    private final SummaryRepository summaryRepository;

    @Override
    public Summary get(
            Long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    ) {
        return summaryRepository.findBySensorId(
                        sensorId,
                        measurementTypes == null ? Set.of(MeasurementType.values()) : measurementTypes,
                        summaryTypes == null ? Set.of(SummaryType.values()) : summaryTypes
                )
                .orElseThrow(SensorNotFoundException::new);
    }

    @Override
    public void handle(
            Data data
    ) {
        summaryRepository.handle(data);
    }

}
