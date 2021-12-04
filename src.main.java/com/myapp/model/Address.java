package com.myapp.model;

import java.util.Objects;

public class Address {

	private String city;
	private String State;
	private String country;
	private int zip;

	public Address() {
		super();
	}

	public Address(String city, String state, String country, int zip) {
		super();
		this.city = city;
		State = state;
		this.country = country;
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public int hashCode() {
		return Objects.hash(State, city, country, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(State, other.State) && Objects.equals(city, other.city)
				&& Objects.equals(country, other.country) && zip == other.zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", country=" + country + ", zip=" + zip + "]";
	}

}
