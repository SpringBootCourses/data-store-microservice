package com.example.datastore.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Summary {

    private long sensorId;
    private MeasurementType measurementType;
    private SummaryType summaryType;
    private double value;

}
