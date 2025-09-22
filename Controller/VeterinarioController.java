package Controller;

import Db.Database;
import Model.Veterinario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeterinarioController {

    public List<Veterinario> listarVeterinarios() {
        List<Veterinario> veterinarios = new ArrayList<>();

        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT * FROM public.veterinario";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Veterinario v = new Veterinario(
                        rs.getInt("id_veterinario"),
                        rs.getInt("id_usuario"),
                        rs.getString("crmv"),
                        rs.getString("especialidade"),
                        rs.getDouble("salario")
                );
                veterinarios.add(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return veterinarios;
    }
}
