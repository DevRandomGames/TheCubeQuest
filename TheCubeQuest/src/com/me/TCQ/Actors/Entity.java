package com.me.TCQ.Actors;


import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectMap;
import com.me.TCQ.Controls.ControlTemplate;
import com.me.TCQ.Skills.*;

public abstract class Entity extends ActorTemplate {
	
	/////STATS/////
	private int Life;
	private int Armor;
	private int Strong;
	private int Mana;
	private int Speed;
	private int Jump;
	
	///////////////
	
	
	private ControlTemplate MyControl;
	private ObjectMap<String,GameObject> MyObject;
	private Array<Skill> MySkills;
	

	public Entity() {
		// TODO Auto-generated constructor stub
		
	}


	public int getLife() {
		return Life;
	}


	public void setLife(int life) {
		Life = life;
	}


	public int getArmor() {
		return Armor;
	}


	public void setArmor(int armor) {
		Armor = armor;
	}


	public int getStrong() {
		return Strong;
	}


	public void setStrong(int strong) {
		Strong = strong;
	}


	public int getMana() {
		return Mana;
	}


	public void setMana(int mana) {
		Mana = mana;
	}


	public int getSpeed() {
		return Speed;
	}


	public void setSpeed(int speed) {
		Speed = speed;
	}


	public int getJump() {
		return Jump;
	}


	public void setJump(int jump) {
		Jump = jump;
	}

}
