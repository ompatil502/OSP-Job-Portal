package com.osp.JobPortal.Controller;

import com.osp.JobPortal.model.JobPost;
import com.osp.JobPortal.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    public jobService service;

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }

   @PostMapping("handleForm")
    public String handleForm(JobPost job){
        service.addJob(job);
        return "success";
   }

   @GetMapping("viewalljobs")
    public String viewalljobs(Model m){
        List<JobPost> jobs= service.viewjobs();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
   }
}
