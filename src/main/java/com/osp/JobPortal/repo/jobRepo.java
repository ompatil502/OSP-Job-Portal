package com.osp.JobPortal.repo;

import com.osp.JobPortal.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class jobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost(1, 2, "Java developer","Must have good experience in core Java and advanced Java" ,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),


            new JobPost(2, 2, "spring dev", "Must have good experience in core Java and advanced Java",
                    List.of("HTML", "CSS", "JavaScript", "React")),


            new JobPost(3, 3, "backend dev", "Strong background in machine learning and data analysis",
                    List.of("Python", "Machine Learning", "Data Analysis")),


            new JobPost(4, 4, "appdev", "Design and implement computer networks for efficient data communication",
                    List.of("Networking", "Cisco", "Routing", "Switching")),


            new JobPost(5, 5, "andriod dev", "Experience in mobile app development for iOS and Android",
                    List.of("iOS Development", "Android Development", "Mobile App"))
    ));

    public void add(JobPost job){
        jobs.add(job);
    }
    public List<JobPost> viewAll(){
        return jobs;
    }
}
