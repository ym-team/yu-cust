package com.hmn.ym.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import com.hmn.ym.entity.SysSmsRecordEntity;

/**
 * @author oymw
 * @date [Thu Apr 26 11:13:48 CST 2018]
 * @desc 本类为sys_sms_record的Dao接口
 */
@Repository
public interface SysSmsRecordMapper{

	/**
	 * 新增
	 * @param entity
	 * @return
	 */
	public boolean saveSysSmsRecordEntity(SysSmsRecordEntity entity);
	
	 
	/**
	  * 根据主键查询
	  * @param pkId
	  * @return
	  */
	 public SysSmsRecordEntity selectSysSmsRecordById(String pkId);
	 
	 
	 /**
	 * 列表分页查询
	 * @param paramsMap
	 * @param rowBounds
	 * @return
	 */
	 public List<SysSmsRecordEntity> selectSysSmsRecordEntityPageList(Map<String, String> paramsMap,RowBounds rowBounds);
	
	 
}