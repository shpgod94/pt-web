package com.pt.manage.ptweb.service.packaze;

import com.pt.manage.ptweb.repository.packaze.PackageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PackageModelMapper {
    PackageModelMapper INSTANCE = Mappers.getMapper(PackageModelMapper.class);

    List<Package> map(List<PackageEntity> packageEntities);

}
