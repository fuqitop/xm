package hr.mapper;

import hr.entity.config_file_second_kind;

public interface config_file_second_kindMapper {
    int deleteByPrimaryKey(Integer secondKindId);

    int insert(config_file_second_kind record);

    int insertSelective(config_file_second_kind record);

    config_file_second_kind selectByPrimaryKey(Integer secondKindId);

    int updateByPrimaryKeySelective(config_file_second_kind record);

    int updateByPrimaryKey(config_file_second_kind record);
}