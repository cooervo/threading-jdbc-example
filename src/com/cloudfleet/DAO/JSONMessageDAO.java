package com.cloudfleet.DAO;

import com.cloudfleet.datasource.ConnectionConfiguration;
import com.cloudfleet.entity.JSONMessage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JSONMessageDAO {

    public List<JSONMessage> selectAll(){
        List<JSONMessage> jsonMessages = new ArrayList<JSONMessage>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM json_messages");

            while (resultSet.next()) {
                JSONMessage jsonMessage = new JSONMessage();
                jsonMessage.setId(resultSet.getInt("id"));
                jsonMessage.setJson(resultSet.getString("message"));
                jsonMessage.setUrl(resultSet.getString("url"));

                jsonMessages.add(jsonMessage);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();

                } catch (SQLException e) {
                    e.printStackTrace();

                }
            }
            if (statement != null) {
                try {
                    statement.close();

                } catch (SQLException e) {
                    e.printStackTrace();

                }
            }

            if (connection != null) {

                try {
                    connection.close();

                } catch (SQLException e) {
                    e.printStackTrace();

                }
            }
        }

        return jsonMessages;
    }

}
