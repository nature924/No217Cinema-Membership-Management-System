package com.dao;

import com.entity.DiscussyingyuanshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyingyuanshangpinVO;
import com.entity.view.DiscussyingyuanshangpinView;


/**
 * 影院商品评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
public interface DiscussyingyuanshangpinDao extends BaseMapper<DiscussyingyuanshangpinEntity> {
	
	List<DiscussyingyuanshangpinVO> selectListVO(@Param("ew") Wrapper<DiscussyingyuanshangpinEntity> wrapper);
	
	DiscussyingyuanshangpinVO selectVO(@Param("ew") Wrapper<DiscussyingyuanshangpinEntity> wrapper);
	
	List<DiscussyingyuanshangpinView> selectListView(@Param("ew") Wrapper<DiscussyingyuanshangpinEntity> wrapper);

	List<DiscussyingyuanshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyingyuanshangpinEntity> wrapper);
	
	DiscussyingyuanshangpinView selectView(@Param("ew") Wrapper<DiscussyingyuanshangpinEntity> wrapper);
	

}
