package com.ty.beans;

public class Address {
	private String Location;
	private int PinCode;
	private String State;
	
	public void setLocation(String location) {
		Location = location;
	}
	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}
	public void setState(String state) {
		State = state;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+Location+", "+PinCode+" - "+State;
	}
	

}
