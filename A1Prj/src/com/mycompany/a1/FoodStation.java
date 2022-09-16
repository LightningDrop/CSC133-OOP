package com.mycompany.a1;

import java.util.Random;

import com.codename1.charts.util.ColorUtil;

public class FoodStation extends Fixed{

	Random random = new Random();
	private int capacity;
	public FoodStation() {
		super(ColorUtil.YELLOW);
    	final int MIN_SIZE = 10;
    	final int MAX_SIZE = 50;
		super.setSize(new Random().nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE); 
    	this.capacity = this.getSize();
		// TODO Auto-generated constructor stub
	}
	
    public String toString() {
    	return ("FoodStation: loc= " + Math.round(this.getLocation().getX()* 10.0)/ 10.0  +","+ Math.round(this.getLocation().getY()*10.0)/10.0 +
    			"  color= " + this.getColortoString() + 
    			"  size= " + this.getSize()+
    			"  capacity="+ this.getCapacity()
    			);
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setSize(int size){}
    
    public void setColor(int color){}
   
    public boolean checkFoodStation()
    {
        if (capacity == 0)
            return false;
        else
            return true;
    }

}
