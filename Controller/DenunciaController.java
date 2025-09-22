package Controller;

import Db.Database;
import Model.Denuncia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DenunciaController {

    public List<Denuncia> listarDenuncias() {
        List<Denuncia> denuncias = new ArrayList<>();

        // try-with-resources para gerenciar conexão automaticamente
        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT * FROM public.denuncia"; 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Denuncia d = new Denuncia(
                        rs.getInt("id_denuncia"),
                        rs.getInt("id_usuario"),
                        rs.getInt("id_animal"),
                        rs.getString("endereco")
                );
                denuncias.add(d);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return denuncias;
    }
}
