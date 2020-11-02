package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Tetrapoda;

public class Turtle extends Animal implements Tetrapoda, Omnivorus {

  public Turtle() {
    super();
  }

  public Turtle(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
  
  @Override
  public void move() {
	  
	  System.out.print("Your "+this.getClass().getSimpleName()+" named "+getName()+" Just move ");
	  if(0 == (int)(Math.random() * ((1 - 0) + 1)) + 0) {walk();}
	  else {swim();}
	  
  	
  }

  @Override
  public void eat(Eatable eatable) {
		 boolean result = true;
		 if (eatable instanceof Animal) {
		      result = false;
		    }
		 
		 
		 if (result) {
			 System.out.println("Your "+this.getClass().getSimpleName()+" named "+getName()+" Just eat Grass");
			 
		 }
		
		 if (!result) {
			 System.out.println("Your "+this.getClass().getSimpleName()+" named "+getName()+" Just eat Meat");
			 
		 }
	}

  @Override
  public void walk() {
  	System.out.println("walking");
  	
  }

  @Override
  public void swim() {
   	System.out.println("swiming");
  	
  }
  
  
}
