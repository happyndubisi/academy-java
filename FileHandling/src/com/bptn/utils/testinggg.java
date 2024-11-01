package com.bptn.utils;

class Booking {
	private String customerName;
	private String service;
	private String date;
	private String time;

	public Booking(String customerName, String service, String date, String time) {
		this.customerName = customerName;
		this.service = service;
		this.date = date;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Booking Details: [Customer: " + customerName + ", Service: " + service + ", Date: " + date + ", Time: "
				+ time + "]";
	}
}