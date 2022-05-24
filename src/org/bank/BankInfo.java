package org.bank;

public class BankInfo extends AxisBank{
	private void savings() {
		System.out.println("my ac is savinges ac");

	}
	private void fixed() {
		System.out.println("i deposit fixed");
	}
	public static void main(String[] args) {
		BankInfo bi = new BankInfo();
		bi.deposit();
		bi.savings();
		bi.fixed();
		
	}

}
