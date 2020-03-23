package hr.mapper;

import hr.entity.engage_exam_details;

public interface engage_exam_detailsMapper {
    int deleteByPrimaryKey(Short exdId);

    int insert(engage_exam_details record);

    int insertSelective(engage_exam_details record);

    engage_exam_details selectByPrimaryKey(Short exdId);

    int updateByPrimaryKeySelective(engage_exam_details record);

    int updateByPrimaryKey(engage_exam_details record);
}