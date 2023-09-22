package com.example.datastore.model;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Getter
@Builder
public class SummaryCriteria {

    private MeasurementType measurementType;
    private SummaryType summaryType;

    public static class SummaryCriteriaBuilder {

        public SummaryCriteriaBuilder measurementType(
                MeasurementType measurementType
        ) {
            this.measurementType = Objects.requireNonNullElse(
                    measurementType,
                    MeasurementType.POWER
            );
            return this;
        }

        public SummaryCriteriaBuilder summaryType(
                SummaryType summaryType
        ) {
            this.summaryType = Objects.requireNonNullElse(
                    summaryType,
                    SummaryType.AVG
            );
            return this;
        }

    }

}
