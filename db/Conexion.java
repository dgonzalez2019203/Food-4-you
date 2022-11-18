/*
 * Decompiled with CFR 0.152.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    static String bd = "prueba";
    static String user = "root";
    static String pass = "root";
    static String url = "jdbc:mysql://localhost:3306/" + bd;
    Connection conn = null;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, user, pass);
            if (this.conn != null) {
                System.out.println("la conexion es exitosa");
            }
        }
        catch (Exception exception) {
            System.out.println("Error en la conexion" + exception);
        }
    }

    public Connection Conectar() {
        return this.conn;
    }

    public void Desconectar() throws Exception {
        this.conn.close();
    }
}
