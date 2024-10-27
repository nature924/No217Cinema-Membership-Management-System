package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingtingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingtingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingtingxinxiView;


/**
 * 影厅信息
 *
 * @author 
 * @email 
 * @date 2023-03-13 18:19:24
 */
public interface YingtingxinxiService extends IService<YingtingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingtingxinxiVO> selectListVO(Wrapper<YingtingxinxiEntity> wrapper);
   	
   	YingtingxinxiVO selectVO(@Param("ew") Wrapper<YingtingxinxiEntity> wrapper);
   	
   	List<YingtingxinxiView> selectListView(Wrapper<YingtingxinxiEntity> wrapper);
   	
   	YingtingxinxiView selectView(@Param("ew") Wrapper<YingtingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingtingxinxiEntity> wrapper);
   	

}

