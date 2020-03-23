package hr.mapper;

import hr.entity.human_file;
import hr.entity.human_fileWithBLOBs;

public interface human_fileMapper {
    int deleteByPrimaryKey(String humanId);

    int insert(human_fileWithBLOBs record);

    int insertSelective(human_fileWithBLOBs record);

    human_fileWithBLOBs selectByPrimaryKey(String humanId);

    int updateByPrimaryKeySelective(human_fileWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(human_fileWithBLOBs record);

    int updateByPrimaryKey(human_file record);
}