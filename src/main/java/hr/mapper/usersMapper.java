package hr.mapper;

import hr.entity.users;

public interface usersMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(users record);

    int insertSelective(users record);

    users selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(users record);

    int updateByPrimaryKey(users record);
}