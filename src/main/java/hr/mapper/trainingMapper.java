package hr.mapper;

import hr.entity.training;

public interface trainingMapper {
    int deleteByPrimaryKey(Short traId);

    int insert(training record);

    int insertSelective(training record);

    training selectByPrimaryKey(Short traId);

    int updateByPrimaryKeySelective(training record);

    int updateByPrimaryKeyWithBLOBs(training record);

    int updateByPrimaryKey(training record);
}