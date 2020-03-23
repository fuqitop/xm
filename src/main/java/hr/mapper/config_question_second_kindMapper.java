package hr.mapper;

import hr.entity.config_question_second_kind;

public interface config_question_second_kindMapper {
    int deleteByPrimaryKey(Short secondKindId);

    int insert(config_question_second_kind record);

    int insertSelective(config_question_second_kind record);

    config_question_second_kind selectByPrimaryKey(Short secondKindId);

    int updateByPrimaryKeySelective(config_question_second_kind record);

    int updateByPrimaryKey(config_question_second_kind record);
}