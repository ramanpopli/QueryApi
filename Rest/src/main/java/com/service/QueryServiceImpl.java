package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.mail.MailSender;
import com.dao.QueryDao;
import com.entity.QueryEntity;
@Service
@Transactional
public class QueryServiceImpl implements QueryService {
	@Autowired 
	 private QueryDao Querydao;
	@Autowired
	private MailSender mailSender;

	public boolean QueryRequest(QueryEntity query) {
		// TODO Auto-generated method stub
		return Querydao.saveorupdate(query);
	}
//mail configuration for customer
	public QueryEntity sendMail(String from, QueryEntity query,String to, String subject, String msg) {
		// TODO Auto-generated method stub
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom(from);
		message.setTo(query.getEmail());
		message.setCc(to);
		message.setSubject(subject);
		message.setText(msg);
		mailSender.send(message);
		return null;		}
//mail configuration for support
public QueryEntity SupportsendMail(QueryEntity query) {
		// TODO Auto-generated method stub
		if(query.getEmail()!=null){
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(query.getEmail());
		message.setTo("abc@gmail.com");
		message.setSubject(query.getSubject());
		message.setText(query.getQueryMessage());
		mailSender.send(message);
		}
		return null;
		
	}

/*	public QueryEntity SupportsendMail(String email, String name, String subject, String queryMessage) {
		// TODO Auto-generated method stub
		if(query.getEmail()!=null){
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(query.getEmail());
			message.setTo("ramanpopli19@gmail.com");
			message.setSubject(query.getSubject());
			message.setText(query.getQueryMessage());
			}
			return null;
		
	}

	public QueryEntity SupportsendMail(QueryEntity email, QueryEntity name, QueryEntity subject,
			QueryEntity queryMessage) {
		QueryEntity query = null;
		
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(query.getEmail());
			message.setTo("ramanpopli19@gmail.com");
			message.setSubject(query.getSubject());
			message.setText(query.getQueryMessage());
			mailSender.send(message);
			
			return null;
	}

	public QueryEntity SupportsendMail(String from, String to, String subject, String msg) {
		// TODO Auto-generated method stub
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(msg);
		return null;
	}

*/

	

	

}
