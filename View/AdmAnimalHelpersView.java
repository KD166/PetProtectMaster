package View;

import Model.AdmAnimalHelpers;
import java.util.List;

public class AdmAnimalHelpersView {

    public void mostrarAdmAnimalHelpers(List<AdmAnimalHelpers> helpers) {
        System.out.println("=== Lista de ADM Animal Helpers ===");
        for (AdmAnimalHelpers a : helpers) {
            System.out.println(a);
        }
    }
}
