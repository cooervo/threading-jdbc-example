package com.cloudfleet;

import com.cloudfleet.DAO.JSONMessageDAO;
import com.cloudfleet.DAO.ThreadsPool;
import com.cloudfleet.entity.JSONMessage;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ThreadsPool threadsPool = new ThreadsPool();
        threadsPool.runScheduledThreads();


    }

}

