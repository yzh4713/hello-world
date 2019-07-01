package com.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maven.bean.Item;
import com.maven.service.ItemService;

/**
 * TODO:方法描述
 * @version 2019年6月29日下午12:30:51
 * @author yangzaihua
 */
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/{id}")
	@ResponseBody
	public Item queryItemById(@PathVariable("id") int id) {
		
		return itemService.queryItemById(id);

	}

}
