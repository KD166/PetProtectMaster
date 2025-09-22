package Model;

public class AdmAnimalHelpers {
    private int idAdmAnimalHelpers;
    private int idUsuario; 
    private double salario;
    private String experiencia;

   
    public AdmAnimalHelpers(int idAdmAnimalHelpers, int idUsuario, double salario, String experiencia) {
        this.idAdmAnimalHelpers = idAdmAnimalHelpers;
        this.idUsuario = idUsuario;
        this.salario = salario;
        this.experiencia = experiencia;
    }

    public int getIdAdmAnimalHelpers() {
        return idAdmAnimalHelpers;
    }

    public void setIdAdmAnimalHelpers(int idAdmAnimalHelpers) {
        this.idAdmAnimalHelpers = idAdmAnimalHelpers;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    
    @Override
    public String toString() {
        return "ID ADM Animal Helpers: " + idAdmAnimalHelpers +
               ", ID Usuário: " + idUsuario +
               ", Salário: R$ " + salario +
               ", Experiência: " + experiencia;
    }
}
