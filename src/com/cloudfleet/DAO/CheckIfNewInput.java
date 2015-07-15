package com.cloudfleet.DAO;

import com.cloudfleet.entity.JSONMessage;

public class CheckIfNewInput implements Runnable {

    private int count = 1;

    @Override
    synchronized public void run() {
        JSONMessageDAO jsonMessageDAO = new JSONMessageDAO();
        JSONMessage data = jsonMessageDAO.selectById(count);

        //System.out.println("id=" + data.getId() + " count= " + count);

        if (data.getId() > 0) {
            count++;
            //System.out.println("add " + data.getId());
            System.out.println("Id: " + data.getId() + " enviando JSON: " + data.getJson() + " a la URL: " + data.getUrl());

        }

    }

}
