package com.hmn.ym.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hmn.ym.entity.SysSmsRecordEntity;
import com.hmn.ym.mapper.SysSmsRecordMapper;
import com.hmn.ym.utils.PageModel;
import com.hmn.ym.utils.RowBoundsUtil;
 
 
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
public class SysSmsRecordService {

	@Autowired
	private SysSmsRecordMapper sysSmsRecordMapper;
	
	/**
	 * 新增
	 * @param entity
	 * @return
	 */
	public boolean saveSysSmsRecordEntity(SysSmsRecordEntity entity) {
		return sysSmsRecordMapper.saveSysSmsRecordEntity(entity);
	}
    
 	/**
	  * 根据主键查询
	  * @param pkId
	  * @return
	  */
	 public SysSmsRecordEntity selectSysSmsRecordById(String pkId){
		return sysSmsRecordMapper.selectSysSmsRecordById(pkId);
	}
	
	 
	 public void queryList() {
		int pageNum = 0;
		int numPerPage = 10;
		PageHelper.startPage(pageNum, (numPerPage));
		Map<String,String>paramsMap = new HashMap<String,String>();
		
		Page<SysSmsRecordEntity> page = (Page<SysSmsRecordEntity>) sysSmsRecordMapper.selectSysSmsRecordEntityPageList(paramsMap,RowBoundsUtil.of(pageNum, numPerPage));
		 System.out.println(page.getResult()+"总共有:"+page.getTotal()+"条数据,实际返回:"+page.size()+"条数据!");
		 PageModel pageModel = new PageModel(pageNum);
			pageModel.setList(page.getResult());
			pageModel.setTotalRecord((int) page.getTotal());
			System.out.println(pageModel.getList());
			System.out.println(pageModel.getTotalRecord());
			
	 }
	  
	
}