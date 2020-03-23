package hr.mapper;

import hr.entity.human_file_dig;
import hr.entity.human_file_digWithBLOBs;

public interface human_file_digMapper {
    int deleteByPrimaryKey(Short hfdId);

    int insert(human_file_digWithBLOBs record);

    int insertSelective(human_file_digWithBLOBs record);

    human_file_digWithBLOBs selectByPrimaryKey(Short hfdId);

    int updateByPrimaryKeySelective(human_file_digWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(human_file_digWithBLOBs record);

    int updateByPrimaryKey(human_file_dig record);
}