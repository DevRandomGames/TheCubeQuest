package com.me.TCQ.Managers;

public class CombatManager {

	private static CombatManager instance = null;
	
	/*
	 * Implementation of a Singleton
	 */
	
	public synchronized static CombatManager Instance(){
		if(instance == null){
			instance = new CombatManager();
		}
		return instance;
	}
	
	public CombatManager() {
		// TODO Auto-generated constructor stub
	}

}
