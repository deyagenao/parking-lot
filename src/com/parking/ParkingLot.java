package com.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	private String parkingLotId;
	private List<List<Slot>> slots;
	
	public ParkingLot(String parkingLotId, int nfloors, int nSlotsPerFloor) {
		this.parkingLotId = parkingLotId;
		this.slots = new ArrayList<>();
		for(int i = 0; i < nfloors; i++) {
			List<Slot> floor = new ArrayList<>();
			floor.add(new Slot("truck"));
			floor.add(new Slot("bike"));
			floor.add(new Slot("bike"));
			for(int j = 3; j < nSlotsPerFloor; j++) {
				floor.add(new Slot("car"));
			}
			this.slots.add(floor);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//takes all the parameters of a vehicle, assigns a slot, and returns the ticket
	// The ticket should be a string of the form <parking lot id>_<floor no>_<slot no>. 
	public String parkVehicle(String type, String registration, String color) {
		Vehicle vehicle = new Vehicle(type, registration, color);
		
		
		String ticket = "";
		return ticket;
	}
	
	//takes the ticket id and removes the vehicle from the slot
	public void unPark(String ticketId) {
		
	}
	//returns the number of slots for vehicle type
	public int getNoOfOpenSlots(String type) {
		return 0;
	}
	
//	displays all open slots for vehicle type
//	public List<Slot> displayOpenSlots(String type){
//		
//	}
	
	//displays all occupied slots for vehicle type
//	public List<Slot> displayOccupiedSlots(String type){
//		
//	}
	
	

}
