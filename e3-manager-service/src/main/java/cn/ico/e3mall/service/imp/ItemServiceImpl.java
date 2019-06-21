package cn.ico.e3mall.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ico.e3mall.mapper.TbItemMapper;
import cn.ico.e3mall.pojo.TbItem;
import cn.ico.e3mall.pojo.TbItemExample;
import cn.ico.e3mall.pojo.TbItemExample.Criteria;
import cn.ico.e3mall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(long itemID) {
		
		//TbItem tbItem=	itemMapper.selectByPrimaryKey(itemID);
		
		TbItemExample example=new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemID);
	    List<TbItem> list=	itemMapper.selectByExample(example);
	    if(list!=null && list.size()>0)
	    	return list.get(0);
	    
	    return null;
	}

}
