package com.cloudfleet.DAO;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadsPool {
    Runnable checkingIfNewInput;

    public ThreadsPool(){
        checkingIfNewInput = new CheckIfNewInput();
    }

    public void runScheduledThreads(){
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(1);
        threadPool.scheduleAtFixedRate(checkingIfNewInput, 0, 1, TimeUnit.MICROSECONDS);
    }
}
