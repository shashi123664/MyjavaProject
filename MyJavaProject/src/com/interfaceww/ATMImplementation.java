package com.interfaceww;

 class ATMImplementation implements ATM {
	 long balance;
	 ATMImplementation()
	 {
		 
	 }
	 ATMImplementation(long balance)
	 {
		 this.balance=balance;
	 }
	 public void deposite(long depositeAmount)
	 {
		 if(depositeAmount>0)
			 balance=depositeAmount+balance;
		 else
			 System.out.println("error");
	 }
	 public long checkBalance()
	 {
		 return balance;
	 }
	 

}
