package com.cd;

public class Bat extends Mammal{
	
	public Bat( int energyLevel ){
	        super( energyLevel);
	    }

    public void fly(){
    	this.energyLevel = this.energyLevel -50;
        System.out.println( "Zaaaaazzz, the bats taking off and decrease its energy by 50");
    }
    
    public void eatHumans(){
    	this.energyLevel = this.energyLevel+ 25;
        System.out.println( "Oh god... never mind, just eats Tommy and increase its energy by 25");
    }
    
    public void attackTown(){
    	this.energyLevel = this.energyLevel - 100;
        System.out.println( "OMG the town is on fire, but the bat decrease its energy by 100");
    }    
    
}