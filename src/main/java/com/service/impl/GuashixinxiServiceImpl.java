package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GuashixinxiDao;
import com.entity.GuashixinxiEntity;
import com.service.GuashixinxiService;
import com.entity.vo.GuashixinxiVO;
import com.entity.view.GuashixinxiView;

@Service("guashixinxiService")
public class GuashixinxiServiceImpl extends ServiceImpl<GuashixinxiDao, GuashixinxiEntity> implements GuashixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuashixinxiEntity> page = this.selectPage(
                new Query<GuashixinxiEntity>(params).getPage(),
                new EntityWrapper<GuashixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuashixinxiEntity> wrapper) {
		  Page<GuashixinxiView> page =new Query<GuashixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuashixinxiVO> selectListVO(Wrapper<GuashixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuashixinxiVO selectVO(Wrapper<GuashixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuashixinxiView> selectListView(Wrapper<GuashixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuashixinxiView selectView(Wrapper<GuashixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
