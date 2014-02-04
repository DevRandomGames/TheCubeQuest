package com.me.TCQ.Actors;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectMap;

public abstract class ActorTemplate extends Actor {
	
	/////
	
	//Actions MyActions; ACTOR JA CONTE UN
	Array<AnimationTemplate> MyAnimations;
	
	

	public ActorTemplate() {
		// TODO Auto-generated constructor stub
	}
	
	public void onCollision(ActorTemplate act) {
		throw new NotImplementedException();
	}

}
