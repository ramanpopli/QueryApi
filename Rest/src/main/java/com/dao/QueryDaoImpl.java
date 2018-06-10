package com.dao;





import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.entity.QueryEntity;


@Repository
@Transactional
@EnableTransactionManagement

public class QueryDaoImpl implements QueryDao {
	@Autowired SessionFactory sessionFactory;
	public boolean saveorupdate(QueryEntity query) {
		sessionFactory.getCurrentSession().saveOrUpdate(query);
		return false;
	}
	
	
	
	//for sending mail to query to support we need to fetch the query of customer from database
	public QueryEntity SupportsendMail(QueryEntity query){
		// TODO Auto-generated method stub
		
		
		return (QueryEntity) sessionFactory.getCurrentSession().createQuery("SELECT * FROM queryEntity " );
		
  
		
	}
	
}


