package com.example.test.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.test.model.Job;
import com.example.test.service.JobService;

@Service
public class JobServiceImpl implements JobService{

    @Override
    public List<Job> getAllJobs() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllJobs'");
    }

    @Override
    public void createJob(Job job) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createJob'");
    }

    @Override
    public Job getJob(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getJob'");
    }

    @Override
    public boolean deleteJob(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteJob'");
    }

    @Override
    public boolean updateJob(Long id, Job job) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateJob'");
    }

}
