package hr.mapper;

import hr.entity.engage_exam;

public interface engage_examMapper {
    int deleteByPrimaryKey(String examNumber);

    int insert(engage_exam record);

    int insertSelective(engage_exam record);

    engage_exam selectByPrimaryKey(String examNumber);

    int updateByPrimaryKeySelective(engage_exam record);

    int updateByPrimaryKey(engage_exam record);
}