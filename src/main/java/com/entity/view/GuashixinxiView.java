package com.entity.view;

import com.entity.GuashixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 挂失信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
@TableName("guashixinxi")
public class GuashixinxiView  extends GuashixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuashixinxiView(){
	}
 
 	public GuashixinxiView(GuashixinxiEntity guashixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, guashixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
