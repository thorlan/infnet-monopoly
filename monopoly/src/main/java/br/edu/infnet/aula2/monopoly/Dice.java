package br.edu.infnet.aula2.monopoly;

import java.util.Random;

public class Dice {

	private int faceNumber;
	
	public Dice(){
		
	}

	public void roll() {
		faceNumber = 3;
	}

	public int getFaceNumber() {
		return faceNumber;
	}
}
