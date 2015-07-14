package com.cloudfleet.DAO;

import com.cloudfleet.datasource.ConnectionConfiguration;
import com.cloudfleet.entity.JSONMessage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JSONMessageDAO {

    public final static String TABLE = "json_messages_table";
    public final static String ID = "id_column";
    public final static String JSON = "json_column";
    public final static String URL = "url_column";

    public JSONMessageDAO(){

    }

    public JSONMessage selectById(int id) {
        JSONMessage jsonMessage = new JSONMessage();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement(  "SELECT * FROM " + TABLE
                                                            + " WHERE " + ID + " = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                jsonMessage.setId(resultSet.getInt(ID));
                jsonMessage.setJson(resultSet.getString(JSON));
                jsonMessage.setUrl(resultSet.getString(URL));
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
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
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

        return jsonMessage;
    }


    public List<JSONMessage> selectAll(){
        List<JSONMessage> jsonMessages = new ArrayList<JSONMessage>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM " + TABLE);

            while (resultSet.next()) {
                JSONMessage jsonMessage = new JSONMessage();
                jsonMessage.setId(resultSet.getInt(ID));
                jsonMessage.setJson(resultSet.getString(JSON));
                jsonMessage.setUrl(resultSet.getString(URL));

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
