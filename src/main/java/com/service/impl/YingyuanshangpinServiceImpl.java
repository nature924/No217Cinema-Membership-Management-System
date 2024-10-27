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


import com.dao.YingyuanshangpinDao;
import com.entity.YingyuanshangpinEntity;
import com.service.YingyuanshangpinService;
import com.entity.vo.YingyuanshangpinVO;
import com.entity.view.YingyuanshangpinView;

@Service("yingyuanshangpinService")
public class YingyuanshangpinServiceImpl extends ServiceImpl<YingyuanshangpinDao, YingyuanshangpinEntity> implements YingyuanshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingyuanshangpinEntity> page = this.selectPage(
                new Query<YingyuanshangpinEntity>(params).getPage(),
                new EntityWrapper<YingyuanshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingyuanshangpinEntity> wrapper) {
		  Page<YingyuanshangpinView> page =new Query<YingyuanshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingyuanshangpinVO> selectListVO(Wrapper<YingyuanshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingyuanshangpinVO selectVO(Wrapper<YingyuanshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingyuanshangpinView> selectListView(Wrapper<YingyuanshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingyuanshangpinView selectView(Wrapper<YingyuanshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
