package hr.mapper;

import hr.entity.config_major;

public interface config_majorMapper {
    int deleteByPrimaryKey(Integer majorId);

    int insert(config_major record);

    int insertSelective(config_major record);

    config_major selectByPrimaryKey(Integer majorId);

    int updateByPrimaryKeySelective(config_major record);

    int updateByPrimaryKey(config_major record);
}