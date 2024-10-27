package com.entity.model;

import com.entity.YingtingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 影厅信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
public class YingtingxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 影厅名称
	 */
	
	private String yingtingmingcheng;
		
	/**
	 * 影厅位置
	 */
	
	private String yingtingweizhi;
		
	/**
	 * 准备上映
	 */
	
	private String zhunbeishangying;
		
	/**
	 * 巡查人员
	 */
	
	private String xuncharenyuan;
		
	/**
	 * 影厅设备
	 */
	
	private String yingtingshebei;
		
	/**
	 * 影厅容量
	 */
	
	private String yingtingrongliang;
		
	/**
	 * 影厅介绍
	 */
	
	private String yingtingjieshao;
				
	
	/**
	 * 设置：影厅名称
	 */
	 
	public void setYingtingmingcheng(String yingtingmingcheng) {
		this.yingtingmingcheng = yingtingmingcheng;
	}
	
	/**
	 * 获取：影厅名称
	 */
	public String getYingtingmingcheng() {
		return yingtingmingcheng;
	}
				
	
	/**
	 * 设置：影厅位置
	 */
	 
	public void setYingtingweizhi(String yingtingweizhi) {
		this.yingtingweizhi = yingtingweizhi;
	}
	
	/**
	 * 获取：影厅位置
	 */
	public String getYingtingweizhi() {
		return yingtingweizhi;
	}
				
	
	/**
	 * 设置：准备上映
	 */
	 
	public void setZhunbeishangying(String zhunbeishangying) {
		this.zhunbeishangying = zhunbeishangying;
	}
	
	/**
	 * 获取：准备上映
	 */
	public String getZhunbeishangying() {
		return zhunbeishangying;
	}
				
	
	/**
	 * 设置：巡查人员
	 */
	 
	public void setXuncharenyuan(String xuncharenyuan) {
		this.xuncharenyuan = xuncharenyuan;
	}
	
	/**
	 * 获取：巡查人员
	 */
	public String getXuncharenyuan() {
		return xuncharenyuan;
	}
				
	
	/**
	 * 设置：影厅设备
	 */
	 
	public void setYingtingshebei(String yingtingshebei) {
		this.yingtingshebei = yingtingshebei;
	}
	
	/**
	 * 获取：影厅设备
	 */
	public String getYingtingshebei() {
		return yingtingshebei;
	}
				
	
	/**
	 * 设置：影厅容量
	 */
	 
	public void setYingtingrongliang(String yingtingrongliang) {
		this.yingtingrongliang = yingtingrongliang;
	}
	
	/**
	 * 获取：影厅容量
	 */
	public String getYingtingrongliang() {
		return yingtingrongliang;
	}
				
	
	/**
	 * 设置：影厅介绍
	 */
	 
	public void setYingtingjieshao(String yingtingjieshao) {
		this.yingtingjieshao = yingtingjieshao;
	}
	
	/**
	 * 获取：影厅介绍
	 */
	public String getYingtingjieshao() {
		return yingtingjieshao;
	}
			
}
