package View;

import Model.Denuncia;
import java.util.List;

public class DenunciaView {

    public void mostrarDenuncias(List<Denuncia> denuncias) {
        System.out.println("=== Lista de Denúncias ===");
        for (Denuncia d : denuncias) {
            System.out.println(d); 
        }
    }
}
