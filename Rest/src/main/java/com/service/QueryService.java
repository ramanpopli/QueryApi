package com.service;

import com.entity.QueryEntity;

public interface QueryService {
	public boolean QueryRequest(QueryEntity query);

	public QueryEntity sendMail(String from, QueryEntity query,String to, String subject, String msg);

	public QueryEntity SupportsendMail(QueryEntity query);
}
