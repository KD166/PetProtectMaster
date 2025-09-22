package Controller;

import Db.Database;
import Model.AdmAnimalHelpers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdmAnimalHelpersController {

    public List<AdmAnimalHelpers> listarAdmAnimalHelpers() {
        List<AdmAnimalHelpers> helpers = new ArrayList<>();

        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT * FROM ADM_Animal_Helpers";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                AdmAnimalHelpers a = new AdmAnimalHelpers(
                        rs.getInt("id_adm_animal_helpers"),
                        rs.getInt("id_usuario"),
                        rs.getDouble("salario"),
                        rs.getString("experiencia")
                );
                helpers.add(a);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return helpers;
    }
}
