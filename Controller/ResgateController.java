package Controller;

import Db.Database;
import Model.Resgate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResgateController {

    public List<Resgate> listarResgates() {
        List<Resgate> resgates = new ArrayList<>();

        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT * FROM public.resgate"; 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Resgate r = new Resgate(
                        rs.getString("local_resgate"),
                        rs.getDate("data_resgate"),
                        rs.getString("status"),
                        rs.getInt("id"),
                        rs.getInt("id_animal"),
                        rs.getInt("id_usuario"),
                        rs.getInt("id_veterinario")
                );
                resgates.add(r);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resgates;
    }
}