package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickPolymorph extends Polymorph {

	public ClickPolymorph(int x, int y) {
		super(x, y,50,50);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, getWidth(), getHeight());
	}

    @Override
    public void update() {
       
    }
    
    public boolean checkClick(int x, int y) {
    	if(x > this.x && x < this.x -50) {
    		if(y > this.y && y < this.y -50) {
    			return true;
    		}
    	}
    	return false;
    }


	
}
