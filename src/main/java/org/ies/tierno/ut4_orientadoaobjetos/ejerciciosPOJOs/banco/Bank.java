package org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.banco;

public class Bank {
    private String bankName;
    private Account[] accounts;

    public Bank(String bankName, Account[] accounts) {
        this.bankName = bankName;
        this.accounts = accounts;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
