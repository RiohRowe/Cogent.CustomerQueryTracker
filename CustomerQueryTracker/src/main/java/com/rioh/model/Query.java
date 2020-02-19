package com.rioh.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Query
{
	@Id
	@GeneratedValue
	private int queryId;
	private boolean resolved;
	private String question;
	private int rating;
	@ManyToOne
	private Customer customer;
	@OneToMany
	private ArrayList<Feedback> responses;

	public Query()
	{
		super();
	}

	public Query(int queryId, boolean resolved, String question, int rating,
		Customer customer, ArrayList<Feedback> responses)
	{
		super();
		this.queryId = queryId;
		this.resolved = resolved;
		this.question = question;
		this.rating = rating;
		this.customer = customer;
		this.responses = responses;
	}

	public int getQueryId()
	{
		return queryId;
	}

	public void setQueryId(int queryId)
	{
		this.queryId = queryId;
	}

	public boolean isResolved()
	{
		return resolved;
	}

	public void setResolved(boolean resolved)
	{
		this.resolved = resolved;
	}

	public String getQuestion()
	{
		return question;
	}

	public void setQuestion(String question)
	{
		this.question = question;
	}

	public int getRating()
	{
		return rating;
	}

	public void setRating(int rating)
	{
		this.rating = rating;
	}

	public Customer getCustomer()
	{
		return customer;
	}

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	public ArrayList<Feedback> getResponses()
	{
		return responses;
	}

	public void setResponses(ArrayList<Feedback> responses)
	{
		this.responses = responses;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
			+ ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + queryId;
		result = prime * result
			+ ((question == null) ? 0 : question.hashCode());
		result = prime * result + rating;
		result = prime * result + (resolved ? 1231 : 1237);
		result = prime * result
			+ ((responses == null) ? 0 : responses.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Query other = (Query) obj;
		if (customer == null)
		{
			if (other.customer != null)
				return false;
		}
		else if (!customer.equals(other.customer))
			return false;
		if (queryId != other.queryId)
			return false;
		if (question == null)
		{
			if (other.question != null)
				return false;
		}
		else if (!question.equals(other.question))
			return false;
		if (rating != other.rating)
			return false;
		if (resolved != other.resolved)
			return false;
		if (responses == null)
		{
			if (other.responses != null)
				return false;
		}
		else if (!responses.equals(other.responses))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Query [queryId=" + queryId + ", resolved=" + resolved
			+ ", question=" + question + ", rating=" + rating + ", customer="
			+ customer + ", responses=" + responses + "]";
	}

}
