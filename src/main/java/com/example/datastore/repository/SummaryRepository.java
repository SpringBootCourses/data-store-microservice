package com.example.datastore.repository;

import com.example.datastore.model.Data;
import com.example.datastore.model.MeasurementType;
import com.example.datastore.model.Summary;
import com.example.datastore.model.SummaryType;

import java.util.Optional;
import java.util.Set;

public interface SummaryRepository {

    Optional<Summary> findBySensorId(
            long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    );

    void handle(
            Data data
    );

}
