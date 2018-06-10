package com.dao;

import com.entity.QueryEntity;

public interface QueryDao {
	public boolean saveorupdate(QueryEntity query);
	public QueryEntity SupportsendMail(QueryEntity query);


}
