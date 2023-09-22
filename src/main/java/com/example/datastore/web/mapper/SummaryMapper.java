package com.example.datastore.web.mapper;

import com.example.datastore.model.Summary;
import com.example.datastore.web.dto.SummaryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SummaryMapper extends Mappable<Summary, SummaryDto> {
}
