package hr.mapper;

import hr.entity.engage_interview;
import hr.entity.engage_interviewWithBLOBs;

public interface engage_interviewMapper {
    int deleteByPrimaryKey(Short einId);

    int insert(engage_interviewWithBLOBs record);

    int insertSelective(engage_interviewWithBLOBs record);

    engage_interviewWithBLOBs selectByPrimaryKey(Short einId);

    int updateByPrimaryKeySelective(engage_interviewWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(engage_interviewWithBLOBs record);

    int updateByPrimaryKey(engage_interview record);
}