package com.challenge.svc;

import java.util.List;

import com.challenge.model.Challenge;

public interface InterviewService {

	/**
	 *      * Looks up all [Challenge] associated with      * an interview
	 * identified by id and returns       * as a List.     
	 */
	List<Challenge> getInterview(String id);
}
