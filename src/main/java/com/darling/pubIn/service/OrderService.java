package com.darling.pubIn.service;

import java.util.List;

import com.darling.pubIn.bean.User;
import org.springframework.stereotype.Service;

/**
 * 订单服务相关接口
 */
public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	List<User> initOrder(String userId);

}
