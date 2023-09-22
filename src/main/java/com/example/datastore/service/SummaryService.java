package com.example.datastore.service;

import com.example.datastore.model.Summary;
import com.example.datastore.model.SummaryCriteria;

public interface SummaryService {

    Summary get(Long sensorId, SummaryCriteria criteria);

}
