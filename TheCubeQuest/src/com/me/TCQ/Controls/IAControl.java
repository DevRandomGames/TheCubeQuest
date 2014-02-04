package com.me.TCQ.Controls;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.MoveByAction;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import com.me.TCQ.Actors.Entity;

public class IAControl extends ControlTemplate {
	
	public enum State {
		IDLE,ALERT,
		HOSTILE,ALIES
	}
	
	private Entity entity;
	private State state;
	private State lastState;

	public IAControl() {
		// TODO Auto-generated constructor stub
	}
	
	public IAControl(Entity en) {
		entity = en;
		state = lastState = IAControl.State.IDLE;
		Idle();
	}
	
	public void Idle(){
		MoveByAction left,right;
		
		//Movimiento de algunos metros a la izquierda
		left = new MoveByAction();
		left.setAmountX(-5); // 5 metros?? 5 pixeles?? no lo tengo claro
		left.setDuration(3f);
		//Movimiento de algunos metros a la derecha
		right = new MoveByAction();
		right.setAmountX(5);
		right.setDuration(3f);
		entity.addAction(new SequenceAction(right,left));
	}
	
	public void Alert(){
		
	}
	
	public void Hostile(){
		
	}
	
	public void Alies(){
		
	}
	
	public boolean StateChange(){
		return lastState == state;
	}

}
