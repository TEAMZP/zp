package com.web.member.dao;

import java.util.Map;

public interface MemberInfoDao {
	
	public int queryMemberCount(Map<String,String> queryMap);
	
}
