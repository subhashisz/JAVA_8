package com.myapp.model;

import java.util.Objects;

public class Student {

	private int id;
	private String name;
	private Address homeAddr;
	private Address residentialAddr;

	public Student() {
		super();
	}

	public Student(int id, String name, Address homeAddr, Address residentialAddr) {
		super();
		this.id = id;
		this.name = name;
		this.homeAddr = homeAddr;
		this.residentialAddr = residentialAddr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddr() {
		return homeAddr;
	}

	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}

	public Address getResidentialAddr() {
		return residentialAddr;
	}

	public void setResidentialAddr(Address residentialAddr) {
		this.residentialAddr = residentialAddr;
	}

	@Override
	public int hashCode() {
		return Objects.hash(homeAddr, id, name, residentialAddr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(homeAddr, other.homeAddr) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(residentialAddr, other.residentialAddr);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", homeAddr=" + homeAddr + ", residentialAddr="
				+ residentialAddr + "]";
	}

}
