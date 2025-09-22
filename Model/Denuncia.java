package Model;

public class Denuncia {
    private int idDenuncia;
    private int idUsuario;
    private int idAnimal;
    private String endereco;

    // Construtor completo
    public Denuncia(int idDenuncia, int idUsuario, int idAnimal, String endereco) {
        this.idDenuncia = idDenuncia;
        this.idUsuario = idUsuario;
        this.idAnimal = idAnimal;
        this.endereco = endereco;
    }

    // Getters e Setters
    public int getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(int idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Sobrescrevendo toString para exibir dados da denúncia
    @Override
    public String toString() {
        return "ID Denuncia: " + idDenuncia 
            + ", ID Usuario: " + idUsuario 
            + ", ID Animal: " + idAnimal 
            + ", Endereco: " + endereco;
    }
}
