package com.me.TCQ.Controls;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.MoveByAction;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import com.me.TCQ.Actors.Entity;
import com.me.TCQ.Actors.NPC;

public class IAControl extends ControlTemplate {
		
	
	private NPC entity;
	private float StateTime;

	public IAControl() {
		// TODO Auto-generated constructor stub
		StateTime = 0;
	}
	
	public IAControl(NPC en) {
		StateTime=0;
		entity = en;
		Idle();
	}
	
	public void WhatIDo(){
		switch(entity.getMyState()){
		
			case IDLE: Idle();
				break;
			case ALERT: Idle();
				break;
			case HOSTILE: Idle();
				break;
			case ALIES: Idle();
				break;	
		}
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
		
		//Mandamos las ordenes
		entity.clearActions();
		entity.addAction(new SequenceAction(right,left));
	}
	
	public void Alert(Vector2 playerposition){
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
	
	
	public void setEntity(NPC en){
		entity = en;
		Idle();
	}
	

	
}
