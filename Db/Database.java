package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public static Connection getConnection() throws SQLException {
        // Always use individual environment variables for proper JDBC URL construction
        String host = System.getenv("PGHOST");
        String port = System.getenv("PGPORT");
        String database = System.getenv("PGDATABASE");
        String user = System.getenv("PGUSER");
        String password = System.getenv("PGPASSWORD");
        
        String url = String.format("jdbc:postgresql://%s:%s/%s?sslmode=disable", host, port, database);
        
        System.out.println("Conectando ao banco: " + host + "/" + database + " como " + user);

        try {
            Class.forName("org.postgresql.Driver"); 
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver PostgreSQL não encontrado!", e);
        }

        Connection conn = DriverManager.getConnection(url, user, password);
        
        // Diagnostic logging
        try {
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery("SELECT current_database(), current_user, current_schema()");
            if (rs.next()) {
                System.out.println("Conectado a: " + rs.getString(1) + " como " + rs.getString(2) + " schema " + rs.getString(3));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println("Erro ao verificar conexão: " + e.getMessage());
        }
        
        return conn;
    }
}
