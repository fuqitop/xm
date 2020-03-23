package hr.mapper;

import hr.entity.config_major_kind;

public interface config_major_kindMapper {
    int deleteByPrimaryKey(Integer majorKindId);

    int insert(config_major_kind record);

    int insertSelective(config_major_kind record);

    config_major_kind selectByPrimaryKey(Integer majorKindId);

    int updateByPrimaryKeySelective(config_major_kind record);

    int updateByPrimaryKey(config_major_kind record);
}