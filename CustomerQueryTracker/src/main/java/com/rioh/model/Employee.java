package com.rioh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee
{

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String eMailId;
	private String contact; // PhoneNumber/Skype/etc
	@OneToOne
	private Department dep;

	public Employee()
	{
		super();
	}

	public Employee(Department d)
	{
		super();
		this.dep = d;
	}

	public Employee(int id, String name, String eMailId, String contact,
		Department dep)
	{
		super();
		this.id = id;
		name = name;
		this.eMailId = eMailId;
		contact = contact;
		this.dep = dep;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String geteMailId()
	{
		return eMailId;
	}

	public void seteMailId(String eMailId)
	{
		this.eMailId = eMailId;
	}

	public String getContact()
	{
		return this.contact;
	}

	public void setContact(String contact)
	{
		this.contact = contact;
	}

	public Department getDep()
	{
		return dep;
	}

	public void setDep(Department dep)
	{
		this.dep = dep;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((dep == null) ? 0 : dep.hashCode());
		result = prime * result + ((eMailId == null) ? 0 : eMailId.hashCode());
		result = prime * result + id;
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
		Employee other = (Employee) obj;
		if (contact == null)
		{
			if (other.contact != null)
				return false;
		}
		else if (!contact.equals(other.contact))
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;
		if (dep == null)
		{
			if (other.dep != null)
				return false;
		}
		else if (!dep.equals(other.dep))
			return false;
		if (eMailId == null)
		{
			if (other.eMailId != null)
				return false;
		}
		else if (!eMailId.equals(other.eMailId))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", Name=" + name + ", eMailId=" + eMailId
			+ ", Contact=" + contact + ", dep=" + dep + "]";
	}
}