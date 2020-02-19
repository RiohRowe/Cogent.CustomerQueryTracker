package com.rioh.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rioh.dao.FeedbackRepository;
import com.rioh.dao.QueryRepository;
import com.rioh.model.Feedback;
import com.rioh.model.Query;

@Service
public class QueryService
{
	@Autowired
	private QueryRepository queR;
	
	@Autowired
	private FeedbackRepository feeR;
	
	//Create
		public Query CreateNewQuery(Query q)
		{
			return queR.save(q);
		}
	//Read
		public ArrayList<Query> getQueries()
		{
			return (ArrayList<Query>) queR.findAll();
		}
	//Update
		public Query updateQuery(Query q)
		{
			feeR.saveAll(q.getResponses());
			queR.save(q);
			return q;
		}
	//Delete
		public void deleteQuery(Query q)
		{
			feeR.deleteAll(q.getResponses());
			queR.delete(q);
		}
}
