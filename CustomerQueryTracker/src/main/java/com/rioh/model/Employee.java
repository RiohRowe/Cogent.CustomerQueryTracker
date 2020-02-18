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
	private String Name;
	private String eMailid;
	private String Contact; // PhoneNumber/Skype/etc
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

	public Employee(int id, String name, String eMailid, String contact,
		Department dep)
	{
		super();
		this.id = id;
		Name = name;
		this.eMailid = eMailid;
		Contact = contact;
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
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

	public String geteMailid()
	{
		return eMailid;
	}

	public void seteMailid(String eMailid)
	{
		this.eMailid = eMailid;
	}

	public String getContact()
	{
		return Contact;
	}

	public void setContact(String contact)
	{
		Contact = contact;
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
		result = prime * result + ((Contact == null) ? 0 : Contact.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((dep == null) ? 0 : dep.hashCode());
		result = prime * result + ((eMailid == null) ? 0 : eMailid.hashCode());
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
		if (Contact == null)
		{
			if (other.Contact != null)
				return false;
		}
		else if (!Contact.equals(other.Contact))
			return false;
		if (Name == null)
		{
			if (other.Name != null)
				return false;
		}
		else if (!Name.equals(other.Name))
			return false;
		if (dep == null)
		{
			if (other.dep != null)
				return false;
		}
		else if (!dep.equals(other.dep))
			return false;
		if (eMailid == null)
		{
			if (other.eMailid != null)
				return false;
		}
		else if (!eMailid.equals(other.eMailid))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", Name=" + Name + ", eMailid=" + eMailid
			+ ", Contact=" + Contact + ", dep=" + dep + "]";
	}
}