package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuashixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuashixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuashixinxiView;


/**
 * 挂失信息
 *
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
public interface GuashixinxiService extends IService<GuashixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuashixinxiVO> selectListVO(Wrapper<GuashixinxiEntity> wrapper);
   	
   	GuashixinxiVO selectVO(@Param("ew") Wrapper<GuashixinxiEntity> wrapper);
   	
   	List<GuashixinxiView> selectListView(Wrapper<GuashixinxiEntity> wrapper);
   	
   	GuashixinxiView selectView(@Param("ew") Wrapper<GuashixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuashixinxiEntity> wrapper);
   	

}

