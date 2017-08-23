
package com.iqmsoft.payara.jbatch.ejb;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class MySchedule {
    
    @Schedule(second = "*/5", minute = "*", hour = "*", persistent = false) // Thirty second intervals
    public void processFiles() {
        JobOperator jobOperator = BatchRuntime.getJobOperator();
        jobOperator.start("jbatch-schedule", null);
    }
}