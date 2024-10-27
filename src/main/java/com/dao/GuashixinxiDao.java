package com.dao;

import com.entity.GuashixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuashixinxiVO;
import com.entity.view.GuashixinxiView;


/**
 * 挂失信息
 * 
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
public interface GuashixinxiDao extends BaseMapper<GuashixinxiEntity> {
	
	List<GuashixinxiVO> selectListVO(@Param("ew") Wrapper<GuashixinxiEntity> wrapper);
	
	GuashixinxiVO selectVO(@Param("ew") Wrapper<GuashixinxiEntity> wrapper);
	
	List<GuashixinxiView> selectListView(@Param("ew") Wrapper<GuashixinxiEntity> wrapper);

	List<GuashixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GuashixinxiEntity> wrapper);
	
	GuashixinxiView selectView(@Param("ew") Wrapper<GuashixinxiEntity> wrapper);
	

}
