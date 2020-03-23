package hr.mapper;

import hr.entity.engage_subjects;
import hr.entity.engage_subjectsWithBLOBs;

public interface engage_subjectsMapper {
    int deleteByPrimaryKey(Short subId);

    int insert(engage_subjectsWithBLOBs record);

    int insertSelective(engage_subjectsWithBLOBs record);

    engage_subjectsWithBLOBs selectByPrimaryKey(Short subId);

    int updateByPrimaryKeySelective(engage_subjectsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(engage_subjectsWithBLOBs record);

    int updateByPrimaryKey(engage_subjects record);
}