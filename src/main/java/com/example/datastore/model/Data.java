package com.example.datastore.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Data {

    private Long id;
    private Long sensorId;
    private LocalDateTime timestamp;
    private double measurement;
    private MeasurementType measurementType;

}
