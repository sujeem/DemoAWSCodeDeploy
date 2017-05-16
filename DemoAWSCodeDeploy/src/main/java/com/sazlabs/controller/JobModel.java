package com.sazlabs.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JobModel {

	@Id	@GeneratedValue
	private Long jobInternalId; //Internal ID
	private String jobExternalId; //Usually client job ID
	private Boolean jobStatus;
	@Column(length=1000)
	private String jobtitle;
	private String location;
	private String duration;
	private String rate;
	private String requestDate;
	@Column(length=3000)
	private String skillsets;
	@Column(length=3000)
	private String jobdescription;
	private String lastUpdated;

	public JobModel() {
	}



	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getSkillsets() {
		return skillsets;
	}

	public void setSkillsets(String skillsets) {
		this.skillsets = skillsets;
	}

	public String getJobdescription() {
		return jobdescription;
	}

	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getJobExternalId() {
		return jobExternalId;
	}


	public void setJobExternalId(String jobExternalId) {
		this.jobExternalId = jobExternalId;
	}



	public Long getJobInternalId() {
		return jobInternalId;
	}



	public void setJobInternalId(Long jobInternalId) {
		this.jobInternalId = jobInternalId;
	}



	public Boolean getJobStatus() {
		return jobStatus;
	}



	public void setJobStatus(Boolean jobStatus) {
		this.jobStatus = jobStatus;
	}

	
}
