package com.company;

public class Main {

    public static void main(String[] args) {
	Customer customer = new Customer("Marcin", 12.45);
	Customer anotherCustomer;
	anotherCustomer = customer;
	anotherCustomer.setBalance(34.56);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
    }
}
