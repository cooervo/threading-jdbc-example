package com.cloudfleet;

import com.cloudfleet.DAO.JSONMessageDAO;
import com.cloudfleet.entity.JSONMessage;

import java.util.List;

public class SendMessagesApp {


    public static void main(String[] args) {

        JSONMessageDAO jsonMessageDAO = new JSONMessageDAO();

        List<JSONMessage> jsonMessageList = jsonMessageDAO.selectAll();

        for (JSONMessage msg : jsonMessageList){
            System.out.println(msg.getId() + ". Se envia json: " + msg.getJson());
            System.out.println("A la url: " + msg.getUrl() + "\n");;
        }
    }

}
