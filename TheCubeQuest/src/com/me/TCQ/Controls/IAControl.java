package com.me.TCQ.Controls;

import com.badlogic.gdx.math.Vector2;
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
	private float StateTime;

	public IAControl() {
		// TODO Auto-generated constructor stub
		StateTime = 0;
		state = lastState = IAControl.State.IDLE;
	}
	
	public IAControl(Entity en) {
		StateTime=0;
		entity = en;
		state = lastState = IAControl.State.IDLE;
		Idle();
	}
	
	
	public void Idle(){
		MoveByAction left,right;
		state = IAControl.State.IDLE;
		//Movimiento de algunos metros a la izquierda
		left = new MoveByAction();
		left.setAmountX(-5); // 5 metros?? 5 pixeles?? no lo tengo claro
		left.setDuration(3f);
		//Movimiento de algunos metros a la derecha
		right = new MoveByAction();
		right.setAmountX(5);
		right.setDuration(3f);
		
		//Mandamos las ordenes
		entity.clearActions();
		entity.addAction(new SequenceAction(right,left));
	}
	
	public void Alert(Vector2 playerposition){
		state = IAControl.State.ALERT;
		// Se mueve hacia la posicion donde le ha parecido detectar movimiento
		MoveToAction patrol = new MoveToAction();
		patrol.setPosition(playerposition.x, playerposition.y);
		patrol.setDuration(6f);
		//Mandamos las ordenes
		entity.clearActions();
		entity.addAction(patrol);
	}
	
	public void Hostile(){
		
		
		
	}
	
	public void Alies(){
		
	}
	
	public boolean StateChange(){
		return lastState == state;
	}
	
	public void setEntity(Entity en){
		entity = en;
		Idle();
	}

}
