package com.rioh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Feedback
{
	@Id
	@GeneratedValue
	private int feedbackId;
	private String feedback;
	private String customerClarification;
	boolean accepted;
	@OneToOne
	private Employee employee;

	public Feedback()
	{
		super();
	}

	public Feedback(int feedbackId, String feedback,
		String customerClarification, boolean accepted, Employee employee)
	{
		super();
		this.feedbackId = feedbackId;
		this.feedback = feedback;
		this.customerClarification = customerClarification;
		this.accepted = accepted;
		this.employee = employee;
	}

	public int getFeedbackId()
	{
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId)
	{
		this.feedbackId = feedbackId;
	}

	public String getFeedback()
	{
		return feedback;
	}

	public void setFeedback(String feedback)
	{
		this.feedback = feedback;
	}

	public String getCustomerClarification()
	{
		return customerClarification;
	}

	public void setCustomerClarification(String customerClarification)
	{
		this.customerClarification = customerClarification;
	}

	public boolean isAccepted()
	{
		return accepted;
	}

	public void setAccepted(boolean accepted)
	{
		this.accepted = accepted;
	}

	public Employee getEmployee()
	{
		return employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (accepted ? 1231 : 1237);
		result = prime * result + ((customerClarification == null) ? 0
			: customerClarification.hashCode());
		result = prime * result
			+ ((employee == null) ? 0 : employee.hashCode());
		result = prime * result
			+ ((feedback == null) ? 0 : feedback.hashCode());
		result = prime * result + feedbackId;
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
		Feedback other = (Feedback) obj;
		if (accepted != other.accepted)
			return false;
		if (customerClarification == null)
		{
			if (other.customerClarification != null)
				return false;
		}
		else if (!customerClarification.equals(other.customerClarification))
			return false;
		if (employee == null)
		{
			if (other.employee != null)
				return false;
		}
		else if (!employee.equals(other.employee))
			return false;
		if (feedback == null)
		{
			if (other.feedback != null)
				return false;
		}
		else if (!feedback.equals(other.feedback))
			return false;
		if (feedbackId != other.feedbackId)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Feedback [feedbackId=" + feedbackId + ", feedback=" + feedback
			+ ", customerClarification=" + customerClarification + ", accepted="
			+ accepted + ", employee=" + employee + "]";
	}

}
