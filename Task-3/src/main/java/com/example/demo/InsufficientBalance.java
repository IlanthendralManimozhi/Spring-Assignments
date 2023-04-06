package com.example.demo;

public class InsufficientBalance extends Exception {
	InsufficientBalance(String str) {
		super(str);
	}
}
