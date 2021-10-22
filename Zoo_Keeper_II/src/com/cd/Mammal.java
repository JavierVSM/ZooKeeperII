package com.cd;

public class Mammal {
    // Attributes
    public int energyLevel;   
    
    // Constructor
    public Mammal ( int energyLevel ){
        this.energyLevel = energyLevel;
    }
    
    public void displayEnergy(){
        System.out.println( "Energy Level:"+ this.energyLevel);
    }

    public int getEnergy(){
        return this.energyLevel;
    }
    
    public void setEnergy( int energyLevel ){
        this.energyLevel = energyLevel;
    }
    
}

