package com.challenge.svc;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.challenge.model.Challenge;

public class ChallengeSvcImplTest {

	private ChallengeSvc challengeSvc;
	
	@Before
	public void setup() {	
		challengeSvc = new ChallengeSvcImpl();
	}
	
	@Test
	public void testNullChallenges() {
		Assert.assertNull(challengeSvc.isPassing(null));
	}
	
	@Test
	public void testEmptyChallenges() {
		Assert.assertNull(challengeSvc.isPassing(new ArrayList<>()));
	}
	
	@Test
	public void testFailedChallenge() {
		Assert.assertFalse(challengeSvc.isPassing(getChallenges(87d)));
	}
	
	@Test
	public void testPassedChallenge() {
		Assert.assertTrue(challengeSvc.isPassing(getChallenges(88d)));
	}
	
	private List<Challenge> getChallenges(double percentage) {
		List<Challenge> challenges = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Challenge challenge = new Challenge();
			if (i < Math.floor(percentage))
				challenge.setCorrect(true);
			else
				challenge.setCorrect(false);
			challenges.add(challenge);
		}
		return challenges;
	}
}
