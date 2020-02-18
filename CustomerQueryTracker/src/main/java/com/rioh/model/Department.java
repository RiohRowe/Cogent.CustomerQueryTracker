package com.rioh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department
{
	@Id
	@GeneratedValue
	private int depId;
	private String depName;

	public Department()
	{
		super();
	}

	public Department(int depId, String depName)
	{
		super();
		this.depId = depId;
		this.depName = depName;
	}

	public int getDepId()
	{
		return depId;
	}

	public void setDepId(int depId)
	{
		this.depId = depId;
	}

	public String getDepName()
	{
		return depName;
	}

	public void setDepName(String depName)
	{
		this.depName = depName;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + depId;
		result = prime * result + ((depName == null) ? 0 : depName.hashCode());
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
		Department other = (Department) obj;
		if (depId != other.depId)
			return false;
		if (depName == null)
		{
			if (other.depName != null)
				return false;
		}
		else if (!depName.equals(other.depName))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Department [depId=" + depId + ", depName=" + depName + "]";
	}

}
