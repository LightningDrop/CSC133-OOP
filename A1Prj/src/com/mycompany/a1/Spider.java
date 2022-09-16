package com.mycompany.a1;

import java.util.Random;

import com.codename1.charts.util.ColorUtil;

public class Spider extends Movable{

	Random random = new Random();
	
	public Spider() {
		super(ColorUtil.CYAN);
		final int MIN_SIZE = 10;
    	final int MAX_SIZE = 50;
		super.setSize(new Random().nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE); 
		super.setHeading(random.nextInt(360));
		super.setSpeed(random.nextInt(10));
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return ("Drone: loc= " + Math.round(this.getLocation().getX()* 10.0)/ 10.0  +","+ Math.round(this.getLocation().getY()*10.0)/10.0 +
    			"  color= " + this.getColortoString() + 
    			"  size= " + this.getSize()+
    			"  heading="+ this.getHeading()+
    			"  speed= " + this.getSpeed()
    			);
	}
	
	@Override
	public void setSize(int size) {}

	public void setColor(int color){}
	public void move() {
		this.setHeading(super.getHeading()+random.nextInt(5));
	}
	
	public void boundaryDrone() {
		if ((this.getSize() + this.getLocation().getX()) > 1000 || (this.getLocation().getX() + this.getSize() > 0)) {
			this.setHeading(random.nextInt(180));
			
		}
		if ((this.getSize() + this.getLocation().getY()) > 1000 || (this.getSize() + this.getLocation().getY()) < 0 ) {
			this.setHeading(random.nextInt(180));
		}
	}
	

}

