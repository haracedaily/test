package com.test.cardpayment;

public class SimplePayment implements Payment{
	double simplePaymentRatio;

	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio=simplePaymentRatio;
	}
	
	@Override
	public int online(int price) {
		int charge=price-(int)(price*(this.simplePaymentRatio+ONLINE_PAYMENT_RATIO));
		return charge;
	}

	@Override
	public int offline(int price) {
		int charge=price-(int)(price*(this.simplePaymentRatio+OFFLINE_PAYMENT_RATIO));
		return charge;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : "+(this.simplePaymentRatio+ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제시 총 할인율 : "+(this.simplePaymentRatio+OFFLINE_PAYMENT_RATIO));
		
		
	}
	
}
