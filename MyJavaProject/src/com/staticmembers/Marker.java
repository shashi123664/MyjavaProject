package com.staticmembers;

class Marker {
	static int price;
	static String colour;
	static void Stationary()
	{
	System.out.println("marker colous is" + colour + "is writing");
	}

	public static void main(String[] args) {
		System.out.println(Marker.price);
		System.out.println(Marker.colour);
		Marker.price=100;
		Marker.colour="black";
		Marker.price=80;
		Marker.colour="blue";
		System.out.println("Marker colour" + Marker.colour + "Marker price" + Marker.price);
		Marker.Stationary();
		
		
	}

}
