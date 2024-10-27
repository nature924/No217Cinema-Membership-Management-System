package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingyuanshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingyuanshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingyuanshangpinView;


/**
 * 影院商品
 *
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
public interface YingyuanshangpinService extends IService<YingyuanshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingyuanshangpinVO> selectListVO(Wrapper<YingyuanshangpinEntity> wrapper);
   	
   	YingyuanshangpinVO selectVO(@Param("ew") Wrapper<YingyuanshangpinEntity> wrapper);
   	
   	List<YingyuanshangpinView> selectListView(Wrapper<YingyuanshangpinEntity> wrapper);
   	
   	YingyuanshangpinView selectView(@Param("ew") Wrapper<YingyuanshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingyuanshangpinEntity> wrapper);
   	

}

