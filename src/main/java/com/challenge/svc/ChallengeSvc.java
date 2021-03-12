package com.challenge.svc;

import java.util.List;

import com.challenge.model.Challenge;

public interface ChallengeSvc {

	Boolean isPassing(List<Challenge> challenges);
}
