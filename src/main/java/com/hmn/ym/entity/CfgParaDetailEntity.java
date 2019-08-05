package com.hmn.ym.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * @author ouyangmw
 * @date [Thu Mar 07 11:30:17 CST 2019]
 * @desc 功能:本类cfg_para_detail数据DataBean类
 */
public class CfgParaDetailEntity extends BaseEntity  implements Serializable{

	private static final long serialVersionUID = 1L;
	
			  
	/** 
	* 主键ID
	*/
	protected String pkId;
	  
	/** 
	* 参数键
	*/
	protected String paraKey;
	  
	/** 
	* 参数值
	*/
	protected String paraValue;
	  
	/** 
	* 参数代码
	*/
	protected String paraCode;
	  
	/** 
	* 参数名称
	*/
	protected String paraName;
	  
	/** 
	* 参数描述
	*/
	protected String paraDesc;
	  
	/** 
	* 状态 0无效;1有效
	*/
	protected int state;
	  
	/** 
	* 创建时间
	*/
	protected Date createTime;
	  
	/** 
	* 修改时间
	*/
	protected Date upTime;
	  
	/** 
	* 备注
	*/
	protected String remarks;
    
    /**
    * CfgParaDetail构造函数
    */
	public CfgParaDetailEntity() {
        super();
    }


    
    /**
    * 属性 主键ID 字段：PK_ID 的get方法
    * @return String
    */
    public String getPkId() {
        return pkId;
    }

    /**
    * 属性 主键ID 字段：PK_ID 的set方法
    */
    public void setPkId(String pkId) {
        this.pkId = pkId;
    }    
        
    
    /**
    * 属性 参数键 字段：PARA_KEY 的get方法
    * @return String
    */
    public String getParaKey() {
        return paraKey;
    }

    /**
    * 属性 参数键 字段：PARA_KEY 的set方法
    */
    public void setParaKey(String paraKey) {
        this.paraKey = paraKey;
    }    
        
    
    /**
    * 属性 参数值 字段：PARA_VALUE 的get方法
    * @return String
    */
    public String getParaValue() {
        return paraValue;
    }

    /**
    * 属性 参数值 字段：PARA_VALUE 的set方法
    */
    public void setParaValue(String paraValue) {
        this.paraValue = paraValue;
    }    
        
    
    /**
    * 属性 参数代码 字段：PARA_CODE 的get方法
    * @return String
    */
    public String getParaCode() {
        return paraCode;
    }

    /**
    * 属性 参数代码 字段：PARA_CODE 的set方法
    */
    public void setParaCode(String paraCode) {
        this.paraCode = paraCode;
    }    
        
    
    /**
    * 属性 参数名称 字段：PARA_NAME 的get方法
    * @return String
    */
    public String getParaName() {
        return paraName;
    }

    /**
    * 属性 参数名称 字段：PARA_NAME 的set方法
    */
    public void setParaName(String paraName) {
        this.paraName = paraName;
    }    
        
    
    /**
    * 属性 参数描述 字段：PARA_DESC 的get方法
    * @return String
    */
    public String getParaDesc() {
        return paraDesc;
    }

    /**
    * 属性 参数描述 字段：PARA_DESC 的set方法
    */
    public void setParaDesc(String paraDesc) {
        this.paraDesc = paraDesc;
    }    
        
    
    /**
    * 属性 状态 0无效;1有效 字段：STATE 的get方法
    * @return int
    */
    public int getState() {
        return state;
    }

    /**
    * 属性 状态 0无效;1有效 字段：STATE 的set方法
    */
    public void setState(int state) {
        this.state = state;
    }    
        
    
    /**
    * 属性 创建时间 字段：CREATE_TIME 的get方法
    * @return Date
    */
    public Date getCreateTime() {
        return createTime;
    }

    /**
    * 属性 创建时间 字段：CREATE_TIME 的set方法
    */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }    
        
    
    /**
    * 属性 修改时间 字段：UP_TIME 的get方法
    * @return Date
    */
    public Date getUpTime() {
        return upTime;
    }

    /**
    * 属性 修改时间 字段：UP_TIME 的set方法
    */
    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }    
        
    
    /**
    * 属性 备注 字段：REMARKS 的get方法
    * @return String
    */
    public String getRemarks() {
        return remarks;
    }

    /**
    * 属性 备注 字段：REMARKS 的set方法
    */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }    
        

  	//以JSON 的模式输出
   	public String toString() {
   	    StringBuffer sb = new StringBuffer();
		sb.append(" { \"pkId\":\"").append( pkId);
		sb.append("\", \"paraKey\":\"").append( paraKey);
		sb.append("\", \"paraValue\":\"").append( paraValue);
		sb.append("\", \"paraCode\":\"").append( paraCode);
		sb.append("\", \"paraName\":\"").append( paraName);
		sb.append("\", \"paraDesc\":\"").append( paraDesc);
		sb.append("\", \"state\":\"").append( state);
		sb.append("\", \"createTime\":\"").append( createTime);
		sb.append("\", \"upTime\":\"").append( upTime);
		sb.append("\", \"remarks\":\"").append( remarks);
        sb.append("\"}");
        return sb.toString();
   	}
   	
}