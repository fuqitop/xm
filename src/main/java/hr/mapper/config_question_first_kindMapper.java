package hr.mapper;

import hr.entity.config_question_first_kind;

public interface config_question_first_kindMapper {
    int deleteByPrimaryKey(Short firstKindId);

    int insert(config_question_first_kind record);

    int insertSelective(config_question_first_kind record);

    config_question_first_kind selectByPrimaryKey(Short firstKindId);

    int updateByPrimaryKeySelective(config_question_first_kind record);

    int updateByPrimaryKey(config_question_first_kind record);
}