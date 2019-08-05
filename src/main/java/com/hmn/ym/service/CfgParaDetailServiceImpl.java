package com.hmn.ym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmn.ym.entity.CfgParaDetailEntity;
import com.hmn.ym.mapper.ICfgParaDetailMapper;
import com.hmn.ym.utils.CachCfgParaUtil;

 /**
 * @author oymw
 * @date 
 * @desc 
 */
@Service
@Transactional
public class CfgParaDetailServiceImpl implements ICfgParaDetailService{

	@Autowired
	private ICfgParaDetailMapper cfgParaDetailMapper;
 
	
	/**
	 * 服务启动加载
	 */
	@Override
	public void getAllCfgParaToCach(){
		for(CfgParaDetailEntity cfg : selectCfgParaDetailEntityList()){
			CachCfgParaUtil.putCfgCache(cfg.getParaKey(), cfg.getParaValue());
		}
		 
	}
	
	private List<CfgParaDetailEntity> selectCfgParaDetailEntityList(){
		return cfgParaDetailMapper.selectCfgParaDetailEntityList();
	}
	
	
}