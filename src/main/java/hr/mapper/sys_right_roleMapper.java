package hr.mapper;

import hr.entity.sys_right_roleKey;

public interface sys_right_roleMapper {
    int deleteByPrimaryKey(sys_right_roleKey key);

    int insert(sys_right_roleKey record);

    int insertSelective(sys_right_roleKey record);
}