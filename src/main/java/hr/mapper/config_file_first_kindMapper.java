package hr.mapper;

import hr.entity.config_file_first_kind;

public interface config_file_first_kindMapper {
    int deleteByPrimaryKey(Integer firstKindId);

    int insert(config_file_first_kind record);

    int insertSelective(config_file_first_kind record);

    config_file_first_kind selectByPrimaryKey(Integer firstKindId);

    int updateByPrimaryKeySelective(config_file_first_kind record);

    int updateByPrimaryKey(config_file_first_kind record);
}