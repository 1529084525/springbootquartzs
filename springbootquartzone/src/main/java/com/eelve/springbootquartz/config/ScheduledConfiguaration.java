package com.eelve.springbootquartz.config;

import com.eelve.springbootquartz.job.Job;
import com.eelve.springbootquartz.service.QuartzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;



/**
 * @ClassName ScheduledConfiguaration
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/1 10:40
 * @Version 1.0
 **/
@Component
@Slf4j
public class ScheduledConfiguaration implements CommandLineRunner {

    @Autowired
    QuartzService quartzService;

    @Override
    public void run(String... args) throws Exception {
        HashMap<String,Object> map = new HashMap<>();
        map.put("name",1);
        quartzService.deleteJob("job", "Job");
        quartzService.addJob(Job.class, "job", "Job", "0 * * * * ?", map);

        map.put("name",2);
        quartzService.deleteJob("job2", "Job");
        quartzService.addJob(Job.class, "job2", "Job", "10 * * * * ?", map);

        map.put("name",3);
        quartzService.deleteJob("job3", "Job");
        quartzService.addJob(Job.class, "job3", "Job", "15 * * * * ?", map);

        map.put("name",13);
        quartzService.deleteJob("job4", "Job");
        quartzService.addJob(Job.class, "job4", "Job", "15 * * * * ?", map);
        map.put("name",14);
        quartzService.deleteJob("job5", "Job");
        quartzService.addJob(Job.class, "job5", "Job", "15 * * * * ?", map);

    }
}
