package com.sazlabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sazlabs.services.JobServices;


@RestController
public class JobsController {
	
	@Autowired
	private JobServices jobServices;

	@RequestMapping("/sazlabs/jobs")
	public List<JobModel> getAllDealers(){
		return jobServices.getAllJobs();
	}
	
	@RequestMapping("/sazlabs/jobs/{id}")
	public JobModel getADelear(@PathVariable Long id){
		return jobServices.getJob(id);
	}

	@RequestMapping(value = "/sazlabs/jobs", method = RequestMethod.POST)
	public void addJob(@RequestBody JobModel jobModel) {
		jobServices.addJob(jobModel);
	}	

	@RequestMapping(value = "/sazlabs/jobs", method = RequestMethod.PUT)
	public void updateJob(@RequestBody JobModel jobModel) {
		jobServices.updateJob(jobModel);
	}	

	@RequestMapping(value = "/sazlabs/jobs/{id}/{status}", method = RequestMethod.PUT)
	public void updateJobStatus(@PathVariable Long id, @PathVariable Boolean status) {
		jobServices.updateJobStatus(id, status);
	}	
		
}
