package entity;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCar extends Car {
	
	public MyCar(Color color,String name){
		super();
		this.y = ??;
		this.z = ??;
		this.color = color;
		this.name = name;
	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDisappeared() {
		// TODO Auto-generated method stub
		return false;
	}

}
