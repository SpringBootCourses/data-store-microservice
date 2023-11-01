package com.example.datastore.service;

import com.example.datastore.model.Data;
import com.example.datastore.model.MeasurementType;
import com.example.datastore.model.Summary;
import com.example.datastore.model.SummaryType;

import java.util.Set;

public interface SummaryService {

    Summary get(
            Long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    );

    void handle(
            Data data
    );

}
