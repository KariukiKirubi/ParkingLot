/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parkinglot;

import java.util.ArrayList;
import static parkinglot.Vehicle.numberOfSpots;


public abstract class Vehicle {
        protected static int numberOfSpots;
	protected VehicleType size;
	protected String licenseNumber;
	protected static ArrayList<parkingSpot> parkingSpots = new ArrayList<parkingSpot>();
	public VehicleType getSize(){
		return size;
	}
	public int getSpotsNeeded(){
		return numberOfSpots;
	}
	public void parkSpots(parkingSpot s){
		parkingSpots.add(s);
	}
        
	public abstract boolean canFitSpot(parkingSpot spt);
		
	
}
//Subclass Motocycle
class Motocycle extends Vehicle{
      public Motocycle(){
    	  numberOfSpots=5; //------------------------------
    	  size= VehicleType.motocycle;
      }
	public boolean canFitSpot(parkingSpot spt) {
		
		return spt.getSize()== VehicleType.motocycle;
	}
        
}

//sub class for Car
class Car extends Vehicle{
      public Car(){
    	  numberOfSpots=5; //------------------------------
    	  size= VehicleType.car;
      }
	public boolean canFitSpot(parkingSpot spt) {
		
		return spt.getSize()== VehicleType.car;
	}
        
}

//Subclass Bus
class Bus extends Vehicle{
      public Bus(){
    	  numberOfSpots=5; //------------------------------
    	  size= VehicleType.bus;
      }
	public boolean canFitSpot(parkingSpot spt) {
		
		return spt.getSize()== VehicleType.bus;
	}
        
}

//Sub class Lorry
class Lorry extends Vehicle{
      public Lorry(){
    	  numberOfSpots=5; //------------------------------
    	  size= VehicleType.lorry;
      }
	public boolean canFitSpot(parkingSpot spt) {
		
		return spt.getSize()== VehicleType.lorry;
	}
        
}




