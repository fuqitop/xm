package hr.mapper;

import hr.entity.engage_major_release;
import hr.entity.engage_major_releaseWithBLOBs;

public interface engage_major_releaseMapper {
    int deleteByPrimaryKey(Short mreId);

    int insert(engage_major_releaseWithBLOBs record);

    int insertSelective(engage_major_releaseWithBLOBs record);

    engage_major_releaseWithBLOBs selectByPrimaryKey(Short mreId);

    int updateByPrimaryKeySelective(engage_major_releaseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(engage_major_releaseWithBLOBs record);

    int updateByPrimaryKey(engage_major_release record);
}