package com.test.classtoabstract;

public class DGBCard extends Card{
	String company="대구은행";
	String cardStaff;
	public DGBCard(String cardNo, int validDate, int CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.cardStaff = cardStaff;
	}//company 초기화 x<<생성자에서 빼요
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 (Card NO : "+cardNo+", 유효기간 : "+validDate+", CVC : "+CVC+" )");
		System.out.println("담당직원 - "+cardStaff+", "+company);
	}
	
	
}
