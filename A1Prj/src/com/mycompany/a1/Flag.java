package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;

public class Flag extends Fixed{
	
	private int sequenceNumber;

	public Flag(int sequenceNumber) {
		super(ColorUtil.GREEN, 10);
		this.sequenceNumber = sequenceNumber;
		// TODO Auto-generated constructor stub
	}
    @Override
    public String toString() {
    	return ("Flag: loc= " + Math.round(this.getLocation().getX()* 10.0)/ 10.0  +","+ Math.round(this.getLocation().getY()*10.0)/10.0 +
    			"  color= " + this.getColortoString() + 
    			"  size= " + this.getSize()+
    			"  seqNumber= " + this.getSequenceNumber()
    			);
    }
	
    public int getSequenceNumber() {
    	return sequenceNumber;
    }
    
    public void setSequenceNumber(int sequenceNumber) {
    	this.sequenceNumber = sequenceNumber;
    }

	@Override
	public void setColor() { } //Flags cannot change colors
	
	@Override
	public void setSize(int size) {}
}
