package parkinglot;

import java.util.logging.Level;

public class parkingSpot {

	private int row;
	private int numberOfSpots;
	private VehicleType sizeOfSpot;
	private Level lv;
	private Vehicle veh;
	
	public parkingSpot(){
		
	}
	
	
	
	public parkingSpot(int row2, int count, VehicleType siz) {
		
		row=row2;
		numberOfSpots=count;
		sizeOfSpot= siz;
	}

	

	public int getSptNum(){
		return numberOfSpots;
	}
	
	public int getRow(){
		return row;
	}
	
	
	

	public VehicleType getSize() {
		
		return sizeOfSpot;
	}
	
	public boolean isAvailable(){
		return (veh ==null);
	}
	
	public boolean fitVehicle(Vehicle veh){
		return veh.canFitSpot(this)&& isAvailable();
	}
 public boolean parkVehicle(Vehicle ve){
	 if(!fitVehicle(ve)){
		 return false;
	 }
	 veh =ve;
	 veh.parkSpots(this);
	 return true;
 }
 
 public void rvVehicle(){
 }
 
 public String toString(){
	 StringBuilder sb= new StringBuilder();
	 
	 if(!isAvailable()){
		 if(veh.getSize()==VehicleType.motocycle){
			 sb.append('M');
		 }
		 else if(veh.getSize()==VehicleType.car){
			 sb.append('C');
		 } else if(veh.getSize()==VehicleType.bus){
			 sb.append('B');
		 } else if(veh.getSize()==VehicleType.lorry){
			 sb.append('L');
		 }
                 else {
			 sb.append('_');
		 }
	 }
		 else{
			 if(sizeOfSpot==VehicleType.motocycle){
				 sb.append('m');
				 
			 }
			 else if(sizeOfSpot==VehicleType.car){
				 sb.append('c');
				 
			 }else if(sizeOfSpot==VehicleType.bus){
				 sb.append('b');
				 
			 }else if(sizeOfSpot==VehicleType.lorry){
				 sb.append('l');
				 
			 }
			 else{
				 sb.append('_');
			 }
		 }
		 
	 return sb.toString();
	 }
}
	


