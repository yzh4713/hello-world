package com.maven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.bean.Item;
import com.maven.mapper.ItemMapper;

/**
 * 
 * TODO:类功能介绍
 * @version 2019年6月29日下午3:01:20
 * @author yangzaihua
 */

@Service // ��service��ӵ�spring����
public class ItemService {

	@Autowired
	private ItemMapper itemMapper;

	public Item queryItemById(int id) {
		return itemMapper.queryItemById(id);
	}

}
