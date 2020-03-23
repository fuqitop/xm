package hr.mapper;

import hr.entity.salary_grant_details;

public interface salary_grant_detailsMapper {
    int deleteByPrimaryKey(Short grdId);

    int insert(salary_grant_details record);

    int insertSelective(salary_grant_details record);

    salary_grant_details selectByPrimaryKey(Short grdId);

    int updateByPrimaryKeySelective(salary_grant_details record);

    int updateByPrimaryKey(salary_grant_details record);
}