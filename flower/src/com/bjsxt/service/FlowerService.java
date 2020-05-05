package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.Flower;

public interface FlowerService {
	/**
	 * 显示所有花卉信息
	 * @return
	 */
	List<Flower> show();
	
	/**
	 * 新增
	 * @param flower
	 * @return
	 */
	int add(Flower flower);
}
