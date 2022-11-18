package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    static String bd="prueba";
    static String user="root";
    static String pass="root";
    static String url="jdbc:mysql://localhost:3306/" + bd;

    Connection conn = null;

    public Conexion() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);
        
        if(conn!= null){
            System.out.println("la conexion es exitosa");
        }

        }catch(Exception e){
            System.out.println("Error en la conexion" + e);
        }
    }

    public Connection Conectar(){
        return conn;
    }


    public void Desconectar() throws Exception{
        conn.close();
    }
}
