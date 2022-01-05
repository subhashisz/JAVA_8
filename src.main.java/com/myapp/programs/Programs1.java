package com.myapp.programs;

public class Programs1 {
	public long fact(int n) {
		return n == 0 ? 1 : n == 1 ? 1 : n * fact(n - 1);
	}
}
