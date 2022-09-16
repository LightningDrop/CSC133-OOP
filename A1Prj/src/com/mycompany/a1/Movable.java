package com.mycompany.a1;

import com.codename1.charts.models.Point;

public abstract class Movable extends GameObject{
	
	public int heading;
	public int speed;

	public Movable(int color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public Movable (int color, int size) {
		super(color, size);
	}

	public void move() {
		float radian = (90 - this.getHeading()) * (float)Math.PI / 180 ;
		float newX = this.getLocation().getX() + (float)Math.cos(radian) * this.getSpeed();
		float newY = this.getLocation().getY() + (float)Math.sin(radian) * this.getSpeed();
		this.setLocation(new Point(newX, newY));
	} 
	public void setHeading(int heading) {
		this.heading = heading;
	}
	public int getHeading() {
		return heading;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
}
