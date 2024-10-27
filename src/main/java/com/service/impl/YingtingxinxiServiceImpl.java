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


import com.dao.YingtingxinxiDao;
import com.entity.YingtingxinxiEntity;
import com.service.YingtingxinxiService;
import com.entity.vo.YingtingxinxiVO;
import com.entity.view.YingtingxinxiView;

@Service("yingtingxinxiService")
public class YingtingxinxiServiceImpl extends ServiceImpl<YingtingxinxiDao, YingtingxinxiEntity> implements YingtingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingtingxinxiEntity> page = this.selectPage(
                new Query<YingtingxinxiEntity>(params).getPage(),
                new EntityWrapper<YingtingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingtingxinxiEntity> wrapper) {
		  Page<YingtingxinxiView> page =new Query<YingtingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingtingxinxiVO> selectListVO(Wrapper<YingtingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingtingxinxiVO selectVO(Wrapper<YingtingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingtingxinxiView> selectListView(Wrapper<YingtingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingtingxinxiView selectView(Wrapper<YingtingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
