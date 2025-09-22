package View;

import Model.Abrigo;
import java.util.List;

public class AbrigoView {

    public void mostrarAbrigo(List<Abrigo> lar) {
        System.out.println("=== Lista de Abrigos ===");
        for (Abrigo a : lar) {
            System.out.println(a);
        }
    }
}