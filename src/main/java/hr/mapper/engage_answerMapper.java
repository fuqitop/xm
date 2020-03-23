package hr.mapper;

import hr.entity.engage_answer;

public interface engage_answerMapper {
    int deleteByPrimaryKey(Short ansId);

    int insert(engage_answer record);

    int insertSelective(engage_answer record);

    engage_answer selectByPrimaryKey(Short ansId);

    int updateByPrimaryKeySelective(engage_answer record);

    int updateByPrimaryKey(engage_answer record);
}