package com.myapp.model;

import java.util.Objects;

public class ZipList {

	private int zip;

	public ZipList() {
		super();
	}

	public ZipList(int zip) {
		super();
		this.zip = zip;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public int hashCode() {
		return Objects.hash(zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZipList other = (ZipList) obj;
		return zip == other.zip;
	}

	@Override
	public String toString() {
		return "ZipList [zip=" + zip + "]";
	}
}
