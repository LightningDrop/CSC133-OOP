package com.mycompany.a1;

import com.codename1.charts.models.Point;

public abstract class Fixed extends GameObject{

	public Fixed(int color) {
		super(color);
	}
	public Fixed(int color, int size) {
		super(color, size);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setLocation(Point location) {}
	
	@Override
	public void setSize(int size) {}
}
