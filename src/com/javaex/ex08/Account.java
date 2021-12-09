package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String account) {
    	System.out.println(account+" 계좌가 개설되었습니다.");
    	accountNo = account;
    }
    //필요한 메소드 작성
    public void deposit(int m) {
    	balance += m;
    }
    
    public void withdraw(int m) {
    	balance -= m;
    }
    
    public void showBalance() {
    	System.out.println(balance);
    }
}
