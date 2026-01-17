package com.osp.JobPortal.service;

import com.osp.JobPortal.model.JobPost;
import com.osp.JobPortal.repo.jobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobService {
    @Autowired
    public jobRepo job;

    public List<JobPost> viewjobs(){
        return job.viewAll();
    }

    public void addJob(JobPost exJob){
        job.add(exJob);
    }
}
