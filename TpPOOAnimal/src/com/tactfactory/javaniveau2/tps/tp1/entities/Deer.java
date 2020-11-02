package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Deer extends Animal implements Terrestrial, Herbivorus {

  public Deer() {
    super();
  }

  public Deer(Long id, String name, Float weight, Float height) {
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
			 System.out.println("Your "+this.getClass().getSimpleName()+" named "+getName()+" Cannot eat Meat");
			 
		 }
		
	}

  @Override
  public void walk() {
  	System.out.println("walking");
  	
  }
  
}
