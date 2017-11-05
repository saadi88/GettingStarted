package com.scratchpad.beginner;
import com.scratchpad.vegetable.IVegetable;
import com.scratchpad.vegetable.Tomato;

public class Main {

    public static void main(String[] args) {
	System.out.println("First Checkin");

	IFruit f = new Pear();
	System.out.println("name of Fruit is " + f.getName());
	System.out.println("Second Checkin");

  System.out.println("4th  Checkin");
  System.out.println("John's  Checkin");
  System.out.println("Mary's Checkin");

		IVegetable v = new Tomato();

		System.out.println("Veggie here: " + v.getName());

    }
}
