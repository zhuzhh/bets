package com.simple.bets.modular.sys.dao;


import com.simple.bets.core.base.mapper.BaseMapper;
import com.simple.bets.modular.sys.model.RoleModel;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @Author wangdingfeng
 * @Description //角色信息
 * @Date 9:58 2019/1/17
 **/
@Repository
public interface RoleMapper extends BaseMapper<RoleModel> {
	
	List<RoleModel> findUserRole(String userName);
}