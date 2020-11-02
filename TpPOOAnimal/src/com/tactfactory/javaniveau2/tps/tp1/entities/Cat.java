package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Cat extends Animal implements Terrestrial, Omnivorus {

  public Cat() {
    super();
  }

  public Cat(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
  
  
  @Override
  public void move() {
  	System.out.print("Your "+this.getClass().getSimpleName()+" named "+getName()+" Just move ");
  	walk();
  	
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
}
