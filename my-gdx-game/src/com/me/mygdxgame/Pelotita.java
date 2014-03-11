package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Pelotita extends Image{
	public Pelotita(int X,int Y) {
		super(new Texture("data/pelotita.png"));
		this.addListener(new MiInput());
		setX(X);
		setY(Y);
	}
	public void act(float delta){
		setX(getX()+1);
	}

}
