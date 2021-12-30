package com.myapp.model;

public class Transaction {

	private final Trader trader;
	private final int year;
	private final int value;
	private final Currency currency;

	
	public Transaction(Trader trader, int year, int value, Currency currency) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
		this.currency = currency;
	}

	public Trader getTrader() {
		return this.trader;
	}

	public int getYear() {
		return this.year;
	}

	public int getValue() {
		return this.value;
	}

	public Currency getCurrency() {
		return currency;
	}

	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + ", currency=" + currency + "]";
	}

	

}
