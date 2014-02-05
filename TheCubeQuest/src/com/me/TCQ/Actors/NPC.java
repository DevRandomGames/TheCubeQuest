package com.me.TCQ.Actors;

public abstract class NPC extends Entity {
	
	public enum State {
		IDLE,ALERT,
		HOSTILE,ALIES
	}
	
	private State MyState;


	public NPC() {
		// TODO Auto-generated constructor stub
	}


	public State getMyState() {
		return MyState;
	}


	public void setMyState(State myState) {
		MyState = myState;
	}

}
