package com.cloudfleet;

import com.cloudfleet.DAO.JSONMessageDAO;
import com.cloudfleet.DAO.ThreadsPool;
import com.cloudfleet.entity.JSONMessage;

import java.util.List;

public class SendMessagesApp {

    public static void main(String[] args) {
        ThreadsPool threadsPool = new ThreadsPool();
        threadsPool.runScheduledThreads();


    }

}
        /*
        ThreadsPool threadsPool = new ThreadsPool();
        threadsPool.runScheduledThreads();

        ================

        List<JSONMessage> jsonMessageList = jsonMessageDAO.selectAll();

        for (JSONMessage msg : jsonMessageList){
            System.out.println(msg.getId() + ". Se envia json: " + msg.getJson());
            System.out.println("A la url: " + msg.getUrl() + "\n");;
        }
        */
