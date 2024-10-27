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


import com.dao.DiscussyingyuanshangpinDao;
import com.entity.DiscussyingyuanshangpinEntity;
import com.service.DiscussyingyuanshangpinService;
import com.entity.vo.DiscussyingyuanshangpinVO;
import com.entity.view.DiscussyingyuanshangpinView;

@Service("discussyingyuanshangpinService")
public class DiscussyingyuanshangpinServiceImpl extends ServiceImpl<DiscussyingyuanshangpinDao, DiscussyingyuanshangpinEntity> implements DiscussyingyuanshangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyingyuanshangpinEntity> page = this.selectPage(
                new Query<DiscussyingyuanshangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussyingyuanshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyingyuanshangpinEntity> wrapper) {
		  Page<DiscussyingyuanshangpinView> page =new Query<DiscussyingyuanshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyingyuanshangpinVO> selectListVO(Wrapper<DiscussyingyuanshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyingyuanshangpinVO selectVO(Wrapper<DiscussyingyuanshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyingyuanshangpinView> selectListView(Wrapper<DiscussyingyuanshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyingyuanshangpinView selectView(Wrapper<DiscussyingyuanshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
