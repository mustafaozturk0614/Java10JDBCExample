package com.bilgeadam.utility;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
public class ConnectionProvider {

    private  final String USERNAME="postgres";
    private  final String PASSWORD="root";
    private  final String DB_NAME="java10FutbolDb";
    private  final String URL="jdbc:postgresql://localhost:5432/"+DB_NAME;
    private Connection connection;
    public boolean openConnection(){
        try {
            connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Bağlantı başarılı");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Bağlantı başarısız!!!");
            return  false;
        }
    }
    public void  closeConnection(){
        try {
            if (!connection.isClosed()){
                connection.close();
                System.out.println("Bağlantı sonlandırıldı...");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}