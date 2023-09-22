package com.example.datastore.repository;

import com.example.datastore.model.MeasurementType;
import com.example.datastore.model.Summary;
import com.example.datastore.model.SummaryType;

import java.util.Optional;

public interface SummaryRepository {

    Optional<Summary> findBySensorId(
            long sensorId,
            MeasurementType measurementType,
            SummaryType summaryType
    );

}
