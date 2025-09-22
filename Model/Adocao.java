package Model;

public class Adocao {
    private int idAdocao;
    private int idUsuario;
    private int idAnimal;
    private int idVeterinario;
    private String dataAdocao;   // Pode usar LocalDate no lugar de String, se preferir
    private String status;
    private String observacoes;

    // Construtor completo
    public Adocao(int idAdocao, int idUsuario, int idAnimal, int idVeterinario, String dataAdocao, String status, String observacoes) {
        this.idAdocao = idAdocao;
        this.idUsuario = idUsuario;
        this.idAnimal = idAnimal;
        this.idVeterinario = idVeterinario;
        this.dataAdocao = dataAdocao;
        this.status = status;
        this.observacoes = observacoes;
    }

    // Construtor vazio (opcional)
    public Adocao() {}

    // Getters e setters
    public int getIdAdocao() { return idAdocao; }
    public void setIdAdocao(int idAdocao) { this.idAdocao = idAdocao; }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public int getIdAnimal() { return idAnimal; }
    public void setIdAnimal(int idAnimal) { this.idAnimal = idAnimal; }

    public int getIdVeterinario() { return idVeterinario; }
    public void setIdVeterinario(int idVeterinario) { this.idVeterinario = idVeterinario; }

    public String getDataAdocao() { return dataAdocao; }
    public void setDataAdocao(String dataAdocao) { this.dataAdocao = dataAdocao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    // Sobrescrevendo toString para exibir os dados da adoção
    @Override
    public String toString() {
        return "ID Adoção: " + idAdocao +
               ", ID Usuário: " + idUsuario +
               ", ID Animal: " + idAnimal +
               ", ID Veterinário: " + idVeterinario +
               ", Data: " + dataAdocao +
               ", Status: " + status +
               ", Observações: " + observacoes;
    }
}
