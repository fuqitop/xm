package hr.mapper;

import hr.entity.salary_grant;

public interface salary_grantMapper {
    int deleteByPrimaryKey(String salaryGrantId);

    int insert(salary_grant record);

    int insertSelective(salary_grant record);

    salary_grant selectByPrimaryKey(String salaryGrantId);

    int updateByPrimaryKeySelective(salary_grant record);

    int updateByPrimaryKey(salary_grant record);
}