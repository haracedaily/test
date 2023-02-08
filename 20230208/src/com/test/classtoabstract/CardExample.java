package com.test.classtoabstract;

public class CardExample {

	public static void main(String[] args) {
		Card card=new Card("5432-4567-9534-3657",20251203,253);
		Card tCard=new TossCard("5432-4567-9534-3657",20251203,253,"신빛용");
		Card dCard=new DGBCard("5432-4567-9534-3657",20251203,253,"신빛용");
		
		System.out.println("Card 출력문");
		card.showCardInfo();
		System.out.println("\nToss 출력문");
		tCard.showCardInfo();
		System.out.println("\nDGB 출력문");
		dCard.showCardInfo();
	}

}
