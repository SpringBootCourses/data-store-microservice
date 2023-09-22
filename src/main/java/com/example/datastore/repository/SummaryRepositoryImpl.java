package com.example.datastore.repository;

import com.example.datastore.model.MeasurementType;
import com.example.datastore.model.Summary;
import com.example.datastore.model.SummaryType;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SummaryRepositoryImpl implements SummaryRepository {

    @Override
    public Optional<Summary> findBySensorId(
            long sensorId,
            MeasurementType measurementType,
            SummaryType summaryType
    ) {
        return Optional.empty();
    }

}
