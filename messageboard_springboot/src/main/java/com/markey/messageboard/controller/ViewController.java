package com.markey.messageboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/"})
public class ViewController {

/*
 * 如果value的值和return的值一样，会导致循环bug，所以一般增加views前缀
 */
	@RequestMapping(value={"home"}, method=RequestMethod.GET)
	public String home() {
		return "views/home";
	}
	@RequestMapping(value={"index"}, method=RequestMethod.GET)
	public String index() {
		return "index";
	}
}
