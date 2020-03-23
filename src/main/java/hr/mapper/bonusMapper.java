package hr.mapper;

import hr.entity.bonus;

public interface bonusMapper {
    int deleteByPrimaryKey(Short bonId);

    int insert(bonus record);

    int insertSelective(bonus record);

    bonus selectByPrimaryKey(Short bonId);

    int updateByPrimaryKeySelective(bonus record);

    int updateByPrimaryKeyWithBLOBs(bonus record);

    int updateByPrimaryKey(bonus record);
}