package _04_Intro_to_Polymorphism;

import java.awt.Color;
import java.awt.Graphics;

import _05_Polymorphs.BluePolymorph;
import _05_Polymorphs.Polymorph;

public class RedPolymorph extends Polymorph {

		public RedPolymorph(int x, int y) {
		super(x, y, y, y);
		// TODO Auto-generated constructor stub
	}

		@Override
		public void draw(Graphics g) {
			g.setColor(Color.red);
			g.fillRect(x, y, getWidth(), getHeight());
		}

	    @Override
	    public void update() {
	        
	    }
		
	}


