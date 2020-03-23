package hr.mapper;

import hr.entity.major_change;
import hr.entity.major_changeWithBLOBs;

public interface major_changeMapper {
    int deleteByPrimaryKey(Short mchId);

    int insert(major_changeWithBLOBs record);

    int insertSelective(major_changeWithBLOBs record);

    major_changeWithBLOBs selectByPrimaryKey(Short mchId);

    int updateByPrimaryKeySelective(major_changeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(major_changeWithBLOBs record);

    int updateByPrimaryKey(major_change record);
}