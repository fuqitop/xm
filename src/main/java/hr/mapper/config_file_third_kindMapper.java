package hr.mapper;

import hr.entity.config_file_third_kind;

public interface config_file_third_kindMapper {
    int deleteByPrimaryKey(Integer thirdKindId);

    int insert(config_file_third_kind record);

    int insertSelective(config_file_third_kind record);

    config_file_third_kind selectByPrimaryKey(Integer thirdKindId);

    int updateByPrimaryKeySelective(config_file_third_kind record);

    int updateByPrimaryKey(config_file_third_kind record);
}