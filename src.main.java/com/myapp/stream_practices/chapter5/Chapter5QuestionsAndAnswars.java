package com.myapp.stream_practices.chapter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.myapp.model.Currency;
import com.myapp.model.Trader;
import com.myapp.model.Transaction;

/**
 * 
 * @author SUBHASHIS
 */
public class Chapter5QuestionsAndAnswars {

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
		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		List<Transaction> transaction2011 = transactions.stream().filter(y -> y.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		// 2. What are all the unique cities where the traders work?
		List<String> uniqueCities = transactions.stream().map(c -> c.getTrader().getCity()).distinct()
				.collect(Collectors.toList());
		// 3. Find all traders from Cambridge and sort them by name.
		Set<String> cities = transactions.stream().map(transaction -> transaction.getTrader().getCity())
				.collect(Collectors.toSet());
		// 4. Return a string of all traders’ names sorted alphabetically.
		Optional<String> allTradersNames = transactions.stream().map(t -> t.getTrader().getName()).sorted().distinct()
				.reduce((a, b) -> a + b);
		// System.out.println(allTradersNames.get());

		// 5. Are any traders based in Milan?
		boolean isFromMilan = transactions.stream().anyMatch(p -> p.getTrader().getCity().equalsIgnoreCase("Milan"));

		// 6. Print all transactions’ values from the traders living in Cambridge.
		List<Integer> tradersOfCambridge = transactions.stream()
				.filter(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge")).map(Transaction::getValue)
				.collect(Collectors.toList());

		// 7. What’s the highest value of all the transactions?
		Optional<Integer> highestTransaction = transactions.stream().map(Transaction::getValue).reduce(Integer::max);

		// 8. Find the transaction with the smallest value.
		Optional<Transaction> transactionSmallestValue = transactions.stream()
				.reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);

		Optional<Transaction> smallestTransaction = transactions.stream()
				.min(Comparator.comparing(Transaction::getValue));

		System.out.println(smallestTransaction.get());
	}

}
