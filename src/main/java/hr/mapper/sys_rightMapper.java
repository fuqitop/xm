package hr.mapper;

import hr.entity.sys_right;

public interface sys_rightMapper {
    int deleteByPrimaryKey(Integer rightCode);

    int insert(sys_right record);

    int insertSelective(sys_right record);

    sys_right selectByPrimaryKey(Integer rightCode);

    int updateByPrimaryKeySelective(sys_right record);

    int updateByPrimaryKey(sys_right record);
}