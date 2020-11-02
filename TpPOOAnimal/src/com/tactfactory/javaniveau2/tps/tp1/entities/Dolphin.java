package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Aquatic;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;

public class Dolphin extends Animal implements Aquatic, Carnivorus {

  public Dolphin() {
    super();
  }

  public Dolphin(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }


@Override
public void swim() {
 	System.out.println("swiming");
	
}

@Override
public void move() {
  	System.out.print("Your "+this.getClass().getSimpleName()+" named "+getName()+" Just move ");
  	swim();
  	
  }

@Override
public void eat(Eatable eatable) {
	 boolean result = true;
	 if (eatable instanceof Animal) {
	      result = false;
	    }
	 
	 
	 if (result) {
		 System.out.println("Your "+this.getClass().getSimpleName()+" named "+getName()+" Cannot eat Grass");
		 
	 }
	
	 if (!result) {
		 System.out.println("Your "+this.getClass().getSimpleName()+" named "+getName()+" Just eat Meat");
		 
	 }
}
}
