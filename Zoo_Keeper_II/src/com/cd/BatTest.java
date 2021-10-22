package com.cd;

public class BatTest {
	public static void main( String args[] ) {
		Bat b = new Bat(300);
		b.displayEnergy();
		b.fly();
		b.eatHumans();
		b.attackTown();
		b.displayEnergy();
	}
}
