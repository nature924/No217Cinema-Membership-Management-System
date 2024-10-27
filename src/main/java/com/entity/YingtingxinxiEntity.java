package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 影厅信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
@TableName("yingtingxinxi")
public class YingtingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YingtingxinxiEntity() {
		
	}
	
	public YingtingxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 影厅编号
	 */
					
	private String yingtingbianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：影厅编号
	 */
	public void setYingtingbianhao(String yingtingbianhao) {
		this.yingtingbianhao = yingtingbianhao;
	}
	/**
	 * 获取：影厅编号
	 */
	public String getYingtingbianhao() {
		return yingtingbianhao;
	}
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
