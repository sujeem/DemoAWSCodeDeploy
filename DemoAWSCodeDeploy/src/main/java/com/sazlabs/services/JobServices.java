package com.sazlabs.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sazlabs.controller.JobModel;

@Service
public class JobServices {
	
	
	@Autowired
	private JobCrudRepository jobRepository;
	
	//Get All Job Summary

	public List<JobModel> getAllJobs(){
		List<JobModel> allJobs = new ArrayList<JobModel>();
		jobRepository.findAll().
		forEach(allJobs::add);
		return allJobs;
	}
	
	public JobModel getJob(Long id){
		return jobRepository.findOne(id);
	}
	
	public void addJob(JobModel newJobModel){
		jobRepository.save(newJobModel);
	}
	
	public void updateJob(JobModel jobModel){
		jobRepository.save(jobModel);
	}
	
	public boolean updateJobStatus(Long id, Boolean status){
		JobModel jobModel = getJob(id);
		jobModel.setJobStatus(status);
		updateJob(jobModel);
		return true;
	}



}
