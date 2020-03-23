package hr.mapper;

import hr.entity.config_primary_key;

public interface config_primary_keyMapper {
    int deleteByPrimaryKey(Short prkId);

    int insert(config_primary_key record);

    int insertSelective(config_primary_key record);

    config_primary_key selectByPrimaryKey(Short prkId);

    int updateByPrimaryKeySelective(config_primary_key record);

    int updateByPrimaryKey(config_primary_key record);
}