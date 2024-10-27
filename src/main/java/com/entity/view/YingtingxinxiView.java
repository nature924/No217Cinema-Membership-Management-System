package com.entity.view;

import com.entity.YingtingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 影厅信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
@TableName("yingtingxinxi")
public class YingtingxinxiView  extends YingtingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingtingxinxiView(){
	}
 
 	public YingtingxinxiView(YingtingxinxiEntity yingtingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yingtingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
