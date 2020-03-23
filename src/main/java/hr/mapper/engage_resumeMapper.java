package hr.mapper;

import hr.entity.engage_resume;
import hr.entity.engage_resumeWithBLOBs;

public interface engage_resumeMapper {
    int deleteByPrimaryKey(Short resId);

    int insert(engage_resumeWithBLOBs record);

    int insertSelective(engage_resumeWithBLOBs record);

    engage_resumeWithBLOBs selectByPrimaryKey(Short resId);

    int updateByPrimaryKeySelective(engage_resumeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(engage_resumeWithBLOBs record);

    int updateByPrimaryKey(engage_resume record);
}