package com.example.datastore.web.dto;

import com.example.datastore.model.MeasurementType;
import com.example.datastore.model.SummaryType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class SummaryDto {

    private long sensorId;
    private MeasurementType measurementType;
    private SummaryType summaryType;
    private double value;

}
