package com.challenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.model.Challenge;
import com.challenge.svc.InterviewService;

@RestController
public class InterviewController {
	
	@Autowired
	private InterviewService interviewSvc;
	
	@GetMapping("/interviews/{interviewId}")
	public ResponseEntity<List<Challenge>> interviews(@PathVariable String interviewId) {
		return new ResponseEntity<List<Challenge>>(interviewSvc.getInterview(interviewId), HttpStatus.OK);
	}
}
