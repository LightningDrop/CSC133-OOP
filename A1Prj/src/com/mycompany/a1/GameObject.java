package com.mycompany.a1;

import java.util.Random;

import com.codename1.charts.models.Point;
import com.codename1.charts.util.ColorUtil;

public abstract class GameObject {
	private int size;
	private Point location;
	private int color;
	
	public GameObject(int color) {
		this.color = color;
		Random rnd = new Random();
		float x = (float)rnd.nextDouble() *  1000;
		float y = (float)rnd.nextDouble() * 1000;
		this.location  = new Point(x,y);
	}
	
	public GameObject(int color, int size) {
		this.color = color;
		this.size = size;
		Random rnd = new Random();
		float x = (float)rnd.nextDouble() *  1000;
		float y = (float)rnd.nextDouble() * 1000;
		this.location  = new Point(x,y);
		
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public Point getLocation() {
		Point currentLocation = location;
		return currentLocation;
	}
	
	public void setLocation(Point location) {
		this.location=location;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor() {
		
	}
	
	public String getColortoString(){
		return "["+ ColorUtil.red(this.color) + "," + ColorUtil.green(this.color) + "," + ColorUtil.blue(this.color)+"]";
	}
}
