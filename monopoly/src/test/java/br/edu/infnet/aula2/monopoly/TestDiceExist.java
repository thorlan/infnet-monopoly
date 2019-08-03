package br.edu.infnet.aula2.monopoly;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDiceExist {

	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void testDiceExist(){
		Dice dice = new Dice();
		assertNotNull(dice);
	}
	
	@Test
	public void testDiceRoll(){
		Dice dice = new Dice();
		int MAX_ROLL_NUMBER = 100;
		int faceNumber = 0;
		
		for (int i = 0; i < MAX_ROLL_NUMBER ; i ++){
			dice.roll();
			faceNumber = dice.getFaceNumber();
			assert((faceNumber > 0) && (faceNumber < 7));
		}
	}
}
