package com.myapp.model;

import java.util.Objects;

public class CountryList {
	private String countries;

	public CountryList() {
		super();
	}

	public CountryList(String countries) {
		super();
		this.countries = countries;
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}

	@Override
	public int hashCode() {
		return Objects.hash(countries);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryList other = (CountryList) obj;
		return Objects.equals(countries, other.countries);
	}

	@Override
	public String toString() {
		return "CountryList [countries=" + countries + "]";
	}
}
