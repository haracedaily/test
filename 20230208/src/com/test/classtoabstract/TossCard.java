package com.test.classtoabstract;

public class TossCard extends Card{
	String company="Toss";
	String cardStaff;
	
	public TossCard(String cardNo, int validDate, int CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO, "+cardNo);
		System.out.println("담당직원 - "+cardStaff+", "+company);
	}
	
	
	
	
}
