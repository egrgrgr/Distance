package com.ericsson;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//Tests Distance Class
public class DistanceTest {

	@Test
	public void equate1YardAnd3Feet() {
		Distance oneYard = new Distance(1,Unit.YARD);
		Distance threeFeet = new Distance(3,Unit.FEET);
		
		assertTrue(oneYard.equals(threeFeet));
	}
	
	@Test
	public void UnEquate2YardAnd3Feet() {
		Distance twoYard = new Distance(2,Unit.YARD);
		Distance threeFeet = new Distance(3,Unit.FEET);
		
		assertFalse(twoYard.equals(threeFeet));
	}
	
	@Test
	public void equate6FeetAnd2Yard() {
		Distance twoYard = new Distance(2,Unit.YARD);
		Distance sixFeet = new Distance(6,Unit.FEET);
		
		assertTrue(sixFeet.equals(twoYard));
	}
	
	@Test
	public void InEquate5FeetAnd2Yard() {
		Distance twoYard = new Distance(2,Unit.YARD);
		Distance fiveFeet = new Distance(5,Unit.FEET);
		
		assertFalse(fiveFeet.equals(twoYard));
	}

	@Test
	public void equate5FeetAnd2Yard() {
		Distance twoYard = new Distance(2,Unit.YARD);
		Distance fiveFeet = new Distance(5,Unit.FEET);
		
		assertFalse(fiveFeet.equals(twoYard));
	}

	@Test
	public void equate1MetreAnd6Feet() {
		Distance oneMetre = new Distance(1,Unit.METRE);
		Distance sixFeet = new Distance(6,Unit.FEET);
		
		assertTrue(oneMetre.equals(sixFeet));
	}
	
	@Test
	public void UnEquate2MetreAnd6Feet() {
		Distance twoMetre = new Distance(2,Unit.METRE);
		Distance sixFeet = new Distance(6,Unit.FEET);
		
		assertFalse(twoMetre.equals(sixFeet));
	}
	
	@Test
	public void equate1MetreAnd2Yard() {
		Distance oneMetre = new Distance(1,Unit.METRE);
		Distance twoYard = new Distance(2,Unit.YARD);
		
		assertTrue(oneMetre.equals(twoYard));
	}
	
	@Test
	public void UnEquate2MetreAnd2Yard() {
		Distance twoMetre = new Distance(2,Unit.METRE);
		Distance twoYard= new Distance(2,Unit.YARD);
		
		assertFalse(twoMetre.equals(twoYard));
	}
	
	@Test
	public void equate4YardAnd2Metre() {
		Distance twoMetre = new Distance(2,Unit.METRE);
		Distance fourYard = new Distance(4,Unit.YARD);
		
		assertTrue(fourYard.equals(twoMetre));
	}
	
	@Test
	public void UnEquate8YardAnd1Metre() {
		Distance oneMetre = new Distance(1,Unit.METRE);
		Distance eightYard= new Distance(8,Unit.YARD);
		
		assertFalse(eightYard.equals(oneMetre));
	}
}
