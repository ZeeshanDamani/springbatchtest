package com.registration.batch.vehicle;

/**
 * Created by Zeeshan Damani
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class VehicleJobCompletionListener extends JobExecutionListenerSupport {

    //  private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public VehicleJobCompletionListener(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

      @Override
      public void afterJob(JobExecution jobExecution) {
        System.out.println("Job Completed : " + jobExecution.toString());
      }


//    @Override
//    public void beforeJob(JobExecution jobExecution) {
//
//        log.info("Starting job " + jobExecution.toString());
//
//            }
//
//        }


}