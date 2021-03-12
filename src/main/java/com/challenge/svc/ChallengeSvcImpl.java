package com.challenge.svc;

import java.util.List;

import com.challenge.model.Challenge;

public class ChallengeSvcImpl implements ChallengeSvc {

	private static final double CUT_OFF = 87.5;

	@Override
	public Boolean isPassing(List<Challenge> challenges) {
		if (null == challenges || challenges.isEmpty())
			return null;
		int totalQuestions = challenges.size();
		long correctAnswers = challenges.stream().filter(challenge -> challenge.isCorrect()).count();		
		return (Double.valueOf(correctAnswers) / Double.valueOf(totalQuestions)) * 100 > CUT_OFF;
	}

}
 