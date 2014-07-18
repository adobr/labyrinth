package com.example.treasurelabyrinth;

import java.util.ArrayList;
import java.util.List;

public class Grid {
	private List<List<Cell>> cells;
	private int size;
	
	public Grid(int n) {
		size = n;
		cells = new ArrayList<List<Cell>>();
		for (int i = 0; i < n; ++i) {
			cells.add(new ArrayList<Cell>());
			for (int j = 0; j < n; ++j) {
				cells.get(i).add(new Cell(false, false, false, false));
			}			
		}
	}
	
	public Cell getCell(int x, int y) {
		return cells.get(x).get(y);
	}
	
	public Cell slideLeft(int row, Cell newCell) {
		Cell free = cells.get(0).get(row);
		for (int i = 0; i < size - 1; ++i) {
			cells.get(i).set(row, cells.get(i + 1).get(row));
		}
		cells.get(size - 1).set(row, newCell);
		return free;
	}
	
	public Cell slideRight(int row, Cell newCell) {
		// to do
		return newCell;
	}
	
	public Cell slideUp(int column, Cell newCell) {
		// to do
		return newCell;
	}
	
	public Cell slideDown(int column, Cell newCell) {
		// to do
		return newCell;
	}
	
	public Boolean isConnected(int x1, int y1, int x2, int y2) {
		// to do
		return false;
	}
}
