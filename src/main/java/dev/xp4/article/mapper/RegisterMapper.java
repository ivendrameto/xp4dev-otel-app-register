package dev.xp4.article.mapper;

import dev.xp4.article.dto.RegisterDTO;

import dev.xp4.article.persistence.entity.Register;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface RegisterMapper {

    RegisterDTO toDTO(Register entity);
    List<RegisterDTO> toListDTO(List<Register> entity);

}
