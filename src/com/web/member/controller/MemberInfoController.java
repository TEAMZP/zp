package com.web.member.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.member.service.MemberInfoService;

@Controller
public class MemberInfoController {
	
	@Autowired
	private MemberInfoService memberInfoService;
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public ModelAndView memberManage(HttpServletRequest request) {
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		
		int count = memberInfoService.queryMemberCount(userName, passWord);
		
		Map<String, String> model = new HashMap<String, String>();
		model.put("count", count+"");
		
		return new ModelAndView("login",model);
	}
	
	@RequestMapping(value = "/toLogin.do", method = RequestMethod.GET)
	public ModelAndView toLogin(HttpServletRequest request) {
		return new ModelAndView("login");
	}
}
