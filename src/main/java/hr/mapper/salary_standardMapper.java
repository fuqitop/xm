package hr.mapper;

import hr.entity.salary_standard;
import hr.entity.salary_standardWithBLOBs;

public interface salary_standardMapper {
    int deleteByPrimaryKey(String standardId);

    int insert(salary_standardWithBLOBs record);

    int insertSelective(salary_standardWithBLOBs record);

    salary_standardWithBLOBs selectByPrimaryKey(String standardId);

    int updateByPrimaryKeySelective(salary_standardWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(salary_standardWithBLOBs record);

    int updateByPrimaryKey(salary_standard record);
}