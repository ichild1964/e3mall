package cn.ico.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ico.e3mall.pojo.TbItem;
import cn.ico.e3mall.service.ItemService;

@Controller
public class ItemControlller {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("item/{itemId}")
	@ResponseBody
	public TbItem getByItem(@PathVariable Long itemId) {
		return itemService.getItemById(itemId);
	}
}
