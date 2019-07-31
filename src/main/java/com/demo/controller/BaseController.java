package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.service.IBaseService;

/**
 * 基础Controller
 * 
 * @author chenjian
 * @createDate 2018-12-28
 */
public class BaseController {

	@Autowired
	protected IBaseService baseService;
}