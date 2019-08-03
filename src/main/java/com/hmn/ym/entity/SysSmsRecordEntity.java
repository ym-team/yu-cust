package com.hmn.ym.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ouyangmw
 * @date [Thu Apr 26 11:13:48 CST 2018]
 * @desc 功能:本类sys_sms_record数据DataBean类
 */
public class SysSmsRecordEntity extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
			  
	/** 
	* 主键
	*/
	protected int pkId;
	  
	/** 
	* 发送人设备ID
	*/
	protected String sendUserDeviceId;
	  
	/** 
	* 发送人
	*/
	protected int sendUserId;
	  
	/** 
	* 短信内容
	*/
	protected String smsContent;
	  
	/** 
	* 接收号码
	*/
	protected String recievePhoneNum;
	  
	/** 
	* 业务类型 1:注册(验证码) 2登录(验证码)
	*/
	protected String busiType;
	  
	/** 
	* 短信平台返回类型
	*/
	protected String returnCode;
	  
	/** 
	* 短信平台返回报文
	*/
	protected String returnMsg;
	  
	/** 
	* 发送批次号
	*/
	protected String batchId;
	  
	/** 
	* 发送时间
	*/
	protected Date createDate;
	  
	/** 
	* 操作时间
	*/
	protected Date opTime;
	  
	/** 
	* 备注
	*/
	protected String remark;
    
    /**
    * SysSmsRecord构造函数
    */
	public SysSmsRecordEntity() {
        super();
    }


    
    /**
    * 属性 主键 字段：PK_ID 的get方法
    * @return int
    */
    public int getPkId() {
        return pkId;
    }

    /**
    * 属性 主键 字段：PK_ID 的set方法
    */
    public void setPkId(int pkId) {
        this.pkId = pkId;
    }    
        
    
    /**
    * 属性 发送人设备ID 字段：SEND_USER_DEVICE_ID 的get方法
    * @return String
    */
    public String getSendUserDeviceId() {
        return sendUserDeviceId;
    }

    /**
    * 属性 发送人设备ID 字段：SEND_USER_DEVICE_ID 的set方法
    */
    public void setSendUserDeviceId(String sendUserDeviceId) {
        this.sendUserDeviceId = sendUserDeviceId;
    }    
        
    
    /**
    * 属性 发送人 字段：SEND_USER_ID 的get方法
    * @return int
    */
    public int getSendUserId() {
        return sendUserId;
    }

    /**
    * 属性 发送人 字段：SEND_USER_ID 的set方法
    */
    public void setSendUserId(int sendUserId) {
        this.sendUserId = sendUserId;
    }    
        
    
    /**
    * 属性 短信内容 字段：SMS_CONTENT 的get方法
    * @return String
    */
    public String getSmsContent() {
        return smsContent;
    }

    /**
    * 属性 短信内容 字段：SMS_CONTENT 的set方法
    */
    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }    
        
    
    /**
    * 属性 接收号码 字段：RECIEVE_PHONE_NUM 的get方法
    * @return String
    */
    public String getRecievePhoneNum() {
        return recievePhoneNum;
    }

    /**
    * 属性 接收号码 字段：RECIEVE_PHONE_NUM 的set方法
    */
    public void setRecievePhoneNum(String recievePhoneNum) {
        this.recievePhoneNum = recievePhoneNum;
    }    
        
    
    /**
    * 属性 业务类型 1:注册(验证码) 2登录(验证码) 字段：BUSI_TYPE 的get方法
    * @return int
    */
    public String getBusiType() {
        return busiType;
    }

    /**
    * 属性 业务类型 1:注册(验证码) 2登录(验证码) 字段：BUSI_TYPE 的set方法
    */
    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }    
        
    
    /**
    * 属性 短信平台返回类型 字段：RETURN_CODE 的get方法
    * @return String
    */
    public String getReturnCode() {
        return returnCode;
    }

    /**
    * 属性 短信平台返回类型 字段：RETURN_CODE 的set方法
    */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }    
        
    
    /**
    * 属性 短信平台返回报文 字段：RETURN_MSG 的get方法
    * @return String
    */
    public String getReturnMsg() {
        return returnMsg;
    }

    /**
    * 属性 短信平台返回报文 字段：RETURN_MSG 的set方法
    */
    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }    
        
    
    /**
    * 属性 发送批次号 字段：BATCH_ID 的get方法
    * @return int
    */
    public String getBatchId() {
        return batchId;
    }

    /**
    * 属性 发送批次号 字段：BATCH_ID 的set方法
    */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }    
        
    
    /**
    * 属性 发送时间 字段：CREATE_DATE 的get方法
    * @return String
    */
    public Date getCreateDate() {
        return createDate;
    }

    /**
    * 属性 发送时间 字段：CREATE_DATE 的set方法
    */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }    
        
    
    /**
    * 属性 操作时间 字段：OP_TIME 的get方法
    * @return Date
    */
    public Date getOpTime() {
        return opTime;
    }

    /**
    * 属性 操作时间 字段：OP_TIME 的set方法
    */
    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }    
        
    
    /**
    * 属性 备注 字段：REMARK 的get方法
    * @return String
    */
    public String getRemark() {
        return remark;
    }

    /**
    * 属性 备注 字段：REMARK 的set方法
    */
    public void setRemark(String remark) {
        this.remark = remark;
    }    
        

  	//以JSON 的模式输出
   	public String toString() {
   	    StringBuffer sb = new StringBuffer();
		sb.append(" { \"pkId\":\"").append( pkId);
		sb.append("\", \"sendUserDeviceId\":\"").append( sendUserDeviceId);
		sb.append("\", \"sendUserId\":\"").append( sendUserId);
		sb.append("\", \"smsContent\":\"").append( smsContent);
		sb.append("\", \"recievePhoneNum\":\"").append( recievePhoneNum);
		sb.append("\", \"busiType\":\"").append( busiType);
		sb.append("\", \"returnCode\":\"").append( returnCode);
		sb.append("\", \"returnMsg\":\"").append( returnMsg);
		sb.append("\", \"batchId\":\"").append( batchId);
		sb.append("\", \"createDate\":\"").append( createDate);
		sb.append("\", \"opTime\":\"").append( opTime);
		sb.append("\", \"remark\":\"").append( remark);
        sb.append("\"}");
        return sb.toString();
   	}
   	
}