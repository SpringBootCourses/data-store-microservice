package com.example.datastore.service;

import com.example.datastore.model.Summary;
import com.example.datastore.model.SummaryCriteria;
import com.example.datastore.model.exception.SensorNotFoundException;
import com.example.datastore.repository.SummaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SummaryServiceImpl implements SummaryService {

    private final SummaryRepository summaryRepository;

    @Override
    public Summary get(Long sensorId, SummaryCriteria criteria) {
        return summaryRepository.findBySensorId(
                        sensorId,
                        criteria.getMeasurementType(),
                        criteria.getSummaryType()
                )
                .orElseThrow(SensorNotFoundException::new);
    }

}
