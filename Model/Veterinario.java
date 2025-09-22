package Model;

public class Veterinario {
    private int idVeterinario;
    private int idUsuario; 
    private String crmv;
    private String especialidade;
    private double salario;

   
    public Veterinario(int idVeterinario, int idUsuario, String crmv, String especialidade, double salario) {
        this.idVeterinario = idVeterinario;
        this.idUsuario = idUsuario;
        this.crmv = crmv;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    
    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    @Override
    public String toString() {
        return "ID Veterinário: " + idVeterinario +
               ", ID Usuário: " + idUsuario +
               ", CRMV: " + crmv +
               ", Especialidade: " + especialidade +
               ", Salário: R$ " + salario;
    }
}
