package org.june.w_apps;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// Get, Post 방식 둘다 사용할때 
	
	@Autowired
	SqlSession session;
	
	@RequestMapping("/select")
	public String select() {
		logger.info("Welcome home! The client locale is " + 1 + ".");
		List<HashMap<String, Object>> resultList = session.selectList("test.select");
		logger.info("Count : {}", resultList.size());
		return "home";
	}

	
	@RequestMapping("/insert")
	public String insert() {
		logger.info("Welcome home! The client locale is {}.", 1);
		return "home";
	}
	
	@RequestMapping("/update")
	public String update() {
		logger.info("Welcome home! The client locale is {}.", 1);
		return "home";
	}
	@RequestMapping("/delete")
	public String delete() {
		logger.info("Welcome home! The client locale is {}.", 1);
		return "home";
	}
}
