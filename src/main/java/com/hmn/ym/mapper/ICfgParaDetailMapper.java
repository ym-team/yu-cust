package com.hmn.ym.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hmn.ym.entity.CfgParaDetailEntity;

/**
 * @author oymw
 * @date [Thu Mar 07 10:38:50 CST 2019]
 * @desc 本类为cfg_para_detail的Dao接口
 */
 
@Repository
public interface ICfgParaDetailMapper {
	 
	 /**
	  * 服务启动时查询
	  */
	 public List<CfgParaDetailEntity> selectCfgParaDetailEntityList();
	 
}