package com.web.member.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.member.dao.MemberInfoDao;
import com.web.member.service.MemberInfoService;

@Service("memberInfoService")
public class MemberInfoServiceImpl implements MemberInfoService{
	
	@Autowired
	private MemberInfoDao memberInfoDao;
	
	@Override
	public int queryMemberCount(String user, String pwd) {
		Map<String,String> queryMap = new HashMap<String, String>();
		queryMap.put("user", user);
		queryMap.put("pwd", pwd);
		return memberInfoDao.queryMemberCount(queryMap);
	}
	
}
