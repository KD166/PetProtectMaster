package Controller;

import Db.Database;
import Model.Adocao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdocaoController {

    public List<Adocao> listarAdocoes() {
        List<Adocao> adocoes = new ArrayList<>();

        // try-with-resources para garantir que a conexão seja fechada
        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT * FROM public.adocao";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Adocao a = new Adocao(
                        rs.getInt("id_adocao"),
                        rs.getInt("id_usuario"),
                        rs.getInt("id_animal"),
                        rs.getInt("id_veterinario"),
                        rs.getString("data_adocao"),
                        rs.getString("status"),
                        rs.getString("observacoes")
                );
                adocoes.add(a);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return adocoes;
    }
}