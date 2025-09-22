package View;

import Model.Adocao;
import java.util.List;

public class AdocaoView {

    public void mostrarAdocoes(List<Adocao> adocoes) {
        System.out.println("=== Lista de Adoções ===");
        for (Adocao a : adocoes) {
            System.out.println(a);
        }
    }
}
