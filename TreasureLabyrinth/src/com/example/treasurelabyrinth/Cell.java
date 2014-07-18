package com.example.treasurelabyrinth;

public class Cell {
	private Boolean leftDoor;
	private Boolean rightDoor;
	private Boolean topDoor;
	private Boolean bottomDoor;
	
	public Cell(Boolean l, Boolean r, Boolean t, Boolean b) {
		leftDoor = l;
		rightDoor = r;
		topDoor = t;
		bottomDoor = b;
	}
	
	public Boolean isLeftDoorOpen() {
		return leftDoor;
	}
	
	public Boolean isRightDoorOpen() {
		return rightDoor;
	}
	
	public Boolean isTopDoorOpen() {
		return topDoor;
	}
	
	public Boolean isBottomDoorOpen() {
		return bottomDoor;
	}
	
	public void rotateLeft() {
		// to do
	}
	
	public void rotateRight() {
		// to do
	}
}
 