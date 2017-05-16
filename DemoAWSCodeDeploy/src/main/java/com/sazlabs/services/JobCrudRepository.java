package com.sazlabs.services;

import org.springframework.data.repository.CrudRepository;

import com.sazlabs.controller.JobModel;

public interface JobCrudRepository extends CrudRepository<JobModel, Long> {

}
