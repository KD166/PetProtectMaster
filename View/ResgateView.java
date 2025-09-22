package View;

import Model.Resgate;
import java.util.List;

public class ResgateView {

    public void mostrarResgates(List<Resgate> resgates) {
        System.out.println("=== Lista de Resgates ===");
        for (Resgate r : resgates) {
            System.out.println(r); 
        }
    }
}
