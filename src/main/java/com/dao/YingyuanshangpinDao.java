package com.dao;

import com.entity.YingyuanshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingyuanshangpinVO;
import com.entity.view.YingyuanshangpinView;


/**
 * 影院商品
 * 
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
public interface YingyuanshangpinDao extends BaseMapper<YingyuanshangpinEntity> {
	
	List<YingyuanshangpinVO> selectListVO(@Param("ew") Wrapper<YingyuanshangpinEntity> wrapper);
	
	YingyuanshangpinVO selectVO(@Param("ew") Wrapper<YingyuanshangpinEntity> wrapper);
	
	List<YingyuanshangpinView> selectListView(@Param("ew") Wrapper<YingyuanshangpinEntity> wrapper);

	List<YingyuanshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<YingyuanshangpinEntity> wrapper);
	
	YingyuanshangpinView selectView(@Param("ew") Wrapper<YingyuanshangpinEntity> wrapper);
	

}
