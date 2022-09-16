package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;

public class Ant extends Movable implements ISteerable{
	
	private int maximumSpeed;
	private int foodLevel;
	private int foodConsumptionRate;
	private int healthLevel;
	private int lastFlagReached;
	private int maxDamageLevel;
	
	public Ant() {
		super(ColorUtil.BLACK, 30);
		super.setSpeed(0);
		super.setHeading(0);
		this.maximumSpeed = 30;
		this.foodLevel = 30;
		this.healthLevel = 10;
		this.lastFlagReached = 0;
		this.maxDamageLevel = 30;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return ("Cyborg: loc=" + Math.round(this.getLocation().getX()* 10.0)/ 10.0  +","+ Math.round(this.getLocation().getY()*10.0)/10.0+
				"  color= " + this.getColortoString()+
				"  speed= " + this.getSpeed()+
				"  heading= " + this.getHeading()+
				"  size= " + this.getSize()+
				"  maxSpeed=" + this.getMaximumSpeed()+
				"  steeringDirection=" + super.getHeading()+
				"  energyLevel=" + this.getFoodLevel()+
				"  damageLevel=" + this.getDamageLevel()
				);
	}
	
	private int getFoodLevel() {
		// TODO Auto-generated method stub
		return foodLevel;
	}

	private int getMaximumSpeed() {
		// TODO Auto-generated method stub
		return maximumSpeed;
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		
	}
	
	public void decreaseSpeed() {
		int currSpeed = getSpeed();
		if (currSpeed > 0)
		{
			this.setSpeed(--currSpeed);
		}
	}
	
	public void increaseSpeed() {
		int currentSpeed = getSpeed();
		if (this.getSpeed() >= maximumSpeed) {
			System.out.println("You cannot cross maximum speed");
		} else {
			this.setSpeed(++currentSpeed);
		}	
	}
	
	public boolean isMaxDamageLevel() {
		if (this.getDamageLevel() == maxDamageLevel)
		{
			return true;
		}
		return false;
	}
	private int getDamageLevel() {
		// TODO Auto-generated method stub
		return maxDamageLevel;
	}
	
	@Override
	public void setSize(int size) {}
	

}
