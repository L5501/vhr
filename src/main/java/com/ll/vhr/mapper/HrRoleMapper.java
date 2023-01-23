package com.ll.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import com.ll.vhr.model.HrRole;

public interface HrRoleMapper {

    HrRole selectByHrId(Integer hrId);

    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);

    void deleteByHrid(Integer hrid);

    Integer addRole(@Param("hrid") Integer hrid, @Param("rids") Integer[] rids);
}