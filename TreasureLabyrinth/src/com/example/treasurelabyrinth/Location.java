package com.example.treasurelabyrinth;

public class Location {
	private int x;
	private int y;
	
	public Location(int x_, int y_) {
		x = x_;
		y = y_;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x_) {
		x = x_;
	}
	
	public void setY(int y_) {
		y = y_;
	}
}
