package hr.mapper;

import hr.entity.engage_answer_details;

public interface engage_answer_detailsMapper {
    int deleteByPrimaryKey(Short andId);

    int insert(engage_answer_details record);

    int insertSelective(engage_answer_details record);

    engage_answer_details selectByPrimaryKey(Short andId);

    int updateByPrimaryKeySelective(engage_answer_details record);

    int updateByPrimaryKey(engage_answer_details record);
}