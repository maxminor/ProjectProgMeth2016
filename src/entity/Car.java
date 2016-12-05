package entity;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import logic.Gear;
import logic.Nitrous;

public abstract class Car implements IRenderable {
	
	public int x,y;
	protected int z;
	public int speed;
	public int acceleration;
	protected Color color;
	protected String name;
	protected Gear gear;
	protected Nitrous nitrous;
	protected boolean disappear;
	
	public Car() {
		super();
		this.x = ???;
		//this.y = ???;
		//this.z = ???;
		this.speed = 0;
		this.acceleration = 0;
		this.gear = ???;
		this.nitrous = ???;
		this.disappear = false;
	}
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getAcceleration() {
		return acceleration;
	}


	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public void increaseSpeed(){
		this.speed += acceleration;
	}

	

	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return z;
	}

	/*@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public boolean isDisappeared() {
		// TODO Auto-generated method stub
		return disappear;
	}

}
