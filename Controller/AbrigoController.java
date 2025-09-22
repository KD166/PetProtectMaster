package Controller;

import Db.Database;
import Model.Abrigo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AbrigoController {

    public List<Abrigo> listarAdmAbrigo() {
        List<Abrigo> helpers = new ArrayList<>();

        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT * FROM Abrigo";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Abrigo a = new Abrigo
                    (
                        rs.getInt("id_abrigo"),
                        rs.getInt("id_animal"),
                        rs.getDouble("nome"),
                        rs.getString("endereco"")
                        rs.getString("telefone"),
                        rs.getString("responsvel"),
                        rs.getString("capacidade"),
                        rs.getString("observacoes"),
                );
                lar.add(a);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lar;
    }
}
