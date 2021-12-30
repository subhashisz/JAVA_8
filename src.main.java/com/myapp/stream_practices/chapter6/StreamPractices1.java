package com.myapp.stream_practices.chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.groupingBy;

import com.myapp.model.Currency;
import com.myapp.model.Trader;
import com.myapp.model.Transaction;

public class StreamPractices1 {
	static Trader raoul = new Trader("Raoul", "Cambridge");
	static Trader mario = new Trader("Mario", "Milan");
	static Trader alan = new Trader("Alan", "Cambridge");
	static Trader brian = new Trader("Brian", "Cambridge");

	static List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300, new Currency("USD")),
			new Transaction(raoul, 2012, 1000, new Currency("USD")),
			new Transaction(raoul, 2011, 400, new Currency("USD")),
			new Transaction(mario, 2012, 710, new Currency("USD")),
			new Transaction(mario, 2012, 700, new Currency("USD")),
			new Transaction(alan, 2012, 950, new Currency("USD")));

	public static void main(String[] args) {
		Map<Currency, List<Transaction>> transactionsByCurrencies = transactions.stream()
				.collect(groupingBy(Transaction::getCurrency));
	}

}
