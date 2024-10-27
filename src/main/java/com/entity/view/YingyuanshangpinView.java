package com.entity.view;

import com.entity.YingyuanshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 影院商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
@TableName("yingyuanshangpin")
public class YingyuanshangpinView  extends YingyuanshangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingyuanshangpinView(){
	}
 
 	public YingyuanshangpinView(YingyuanshangpinEntity yingyuanshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, yingyuanshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
