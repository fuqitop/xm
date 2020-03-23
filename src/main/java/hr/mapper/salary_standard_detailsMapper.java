package hr.mapper;

import hr.entity.salary_standard_details;

public interface salary_standard_detailsMapper {
    int deleteByPrimaryKey(Short itemId);

    int insert(salary_standard_details record);

    int insertSelective(salary_standard_details record);

    salary_standard_details selectByPrimaryKey(Short itemId);

    int updateByPrimaryKeySelective(salary_standard_details record);

    int updateByPrimaryKey(salary_standard_details record);
}