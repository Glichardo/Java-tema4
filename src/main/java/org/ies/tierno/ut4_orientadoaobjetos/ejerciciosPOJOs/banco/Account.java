package org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.banco;

public class Account {
    private String iban;
    private double balance;
    private Customer[] customers;

    public Account(String iban, double balance, Customer[] customers) {
        this.iban = iban;
        this.balance = balance;
        this.customers = customers;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
}
