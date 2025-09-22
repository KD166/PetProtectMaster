
package Model;

import java.sql.Date;

public class Resgate {
    private String local_resgate;
    private Date data_resgate;
    private String status;
    private int id;
    private int id_animal;
    private int id_usuario;
    private int id_veterinario;

    public Resgate(String local_resgate, Date data_resgate, String status, int id, int id_animal, int id_usuario, int id_veterinario){
        this.local_resgate = local_resgate;
        this.data_resgate = data_resgate;
        this.status = status;
        this.id = id;
        this.id_animal = id_animal;
        this.id_usuario = id_usuario;
        this.id_veterinario = id_veterinario;
    }

    
    
    public String getLocal_resgate()
    { return local_resgate; }
    public void setLocal_resgate(String local_resgate)
    { this.local_resgate = local_resgate; }

    public Date getData_resgate() 
        { return data_resgate; }
        public void setData_resgate(Date data_resgate) 
        { this.data_resgate = data_resgate; }

    public String getStatus() 
        { return status; }
        public void setStatus(String status) 
        { this.status = status; }
    
    public int getId() 
    { return id; }
    public void setId(int id)
    { this.id = id; }

    
    public int getIdAnimal() {
        return id_animal;
    }

    public void setIdAnimal(int id_animal) {
        this.id_animal = id_animal;
    }

    public int getIdUsuario() {
        return id_usuario;
    }

    public void setIdUsuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getIdVeterinario() {
        return id_veterinario;
    }

    public void setIdVeterinario(int id_veterinario) {
        this.id_veterinario = id_veterinario;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Local: " + local_resgate + ", Data: " + data_resgate + ", Status: " + status + ", Animal ID: " + id_animal + ", Usuario ID: " + id_usuario + ", Veterinario ID: " + id_veterinario;
    }
}
