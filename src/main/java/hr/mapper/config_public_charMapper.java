package hr.mapper;

import hr.entity.config_public_char;

public interface config_public_charMapper {
    int deleteByPrimaryKey(Integer pbcId);

    int insert(config_public_char record);

    int insertSelective(config_public_char record);

    config_public_char selectByPrimaryKey(Integer pbcId);

    int updateByPrimaryKeySelective(config_public_char record);

    int updateByPrimaryKey(config_public_char record);
}