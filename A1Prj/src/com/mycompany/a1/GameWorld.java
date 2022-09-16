package com.mycompany.a1;

import java.util.ArrayList;
import java.util.Random;

public class GameWorld {
	
	private int life;
	final private int gameWorldWidth = 1000;
	final private int gameWorldHeight = 1000;
	private int timer;
	private ArrayList<GameObject> gameObjects;
	private int flagCount;
	private int foodStationCount;
	private int spiderCount;
	private int antCount;
	private boolean gameOver;
	Random random = new Random();
	
	public void init() {
		//code here to create the
		//initial game objects/setup
		this.timer = 0;
		gameObjects = new ArrayList<GameObject>();
		this.flagCount = 0;
		this.foodStationCount = 0;
		this.spiderCount = 0;
		this.antCount = 0;
		this.gameOver = false;
		addGameObjects();
	}
	// additional methods here to
	// manipulate world objects and
	// related game state data
	private void addGameObjects() {
		int flagObject = 4 + random.nextInt(5);
		int foodAndSpiderObjectLimit = 2+ random.nextInt(5);
		
		for (int i = 1; i < flagObject; i++) {
			gameObjects.add(new Flag(i));
			 flagCount++;
		}
		for (int i = 0; i < foodAndSpiderObjectLimit; i++) {
			gameObjects.add(new FoodStation());
			foodStationCount++;
		}
		for (int i = 0; i < foodAndSpiderObjectLimit; i++) {
			gameObjects.add(new Spider());
			spiderCount++;
		}
		gameObjects.add(new Ant());
		antCount++;
	}
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}
}

//Stopping here today
//
//I was attempting to test if all the permissions are set right.
//Tomorrow I will have to test the rest of the objects then review
//the requirements.
//
//Questions
//
//Timer how does the timer work. 
//What is supposed to go into ISteerable.
//UML diagram help. How are the arrows supposed to go. 