package com.myapp.model;

public class Currency {
	private final String currency;

	public Currency(String currency) {
		super();
		this.currency = currency;
	}

	public String getCurrency() {
		return currency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Currency [currency=" + currency + "]";
	}

}
