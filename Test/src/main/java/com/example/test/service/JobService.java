package com.example.test.service;

import java.util.List;

import com.example.test.model.Job;

public interface JobService {

    List<Job> getAllJobs();

	void createJob(Job job);

	Job getJob(Long id);

	boolean deleteJob(Long id);

	boolean updateJob(Long id,Job job);

}
