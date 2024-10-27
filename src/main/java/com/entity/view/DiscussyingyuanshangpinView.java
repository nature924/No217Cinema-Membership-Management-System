package com.entity.view;

import com.entity.DiscussyingyuanshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 影院商品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
@TableName("discussyingyuanshangpin")
public class DiscussyingyuanshangpinView  extends DiscussyingyuanshangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyingyuanshangpinView(){
	}
 
 	public DiscussyingyuanshangpinView(DiscussyingyuanshangpinEntity discussyingyuanshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussyingyuanshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
