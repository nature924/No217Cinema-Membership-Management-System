package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyingyuanshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyingyuanshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyingyuanshangpinView;


/**
 * 影院商品评论表
 *
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
public interface DiscussyingyuanshangpinService extends IService<DiscussyingyuanshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyingyuanshangpinVO> selectListVO(Wrapper<DiscussyingyuanshangpinEntity> wrapper);
   	
   	DiscussyingyuanshangpinVO selectVO(@Param("ew") Wrapper<DiscussyingyuanshangpinEntity> wrapper);
   	
   	List<DiscussyingyuanshangpinView> selectListView(Wrapper<DiscussyingyuanshangpinEntity> wrapper);
   	
   	DiscussyingyuanshangpinView selectView(@Param("ew") Wrapper<DiscussyingyuanshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyingyuanshangpinEntity> wrapper);
   	

}

