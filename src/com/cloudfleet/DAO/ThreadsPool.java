package com.cloudfleet.DAO;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadsPool {
    Runnable checkingIfNewInput;
    Runnable sendingNewMessage;

    public ThreadsPool(){
        checkingIfNewInput = new CheckIfNewInput();
        sendingNewMessage = new SendNewMessage();
    }

    public void runScheduledThreads(){
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(2);
        threadPool.scheduleAtFixedRate(checkingIfNewInput, 0, 1, TimeUnit.SECONDS); //TODO change to MILLISECONDS TimeUnit.MILLISECONDS
        threadPool.scheduleAtFixedRate(sendingNewMessage,1,1, TimeUnit.SECONDS);    //TODO change to MILLISECONDS TimeUnit.MILLISECONDS
    }
}
