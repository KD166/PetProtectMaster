package Model;

import java.sql.Date;

public class Usuario {
    private int idUsuario;
    private String nome;
    private Date dataNascimento;
    private String email;
    private String cpf;


    public Usuario(int idUsuario, String nome, Date dataNascimento, String email, String cpf) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
    }


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "ID: " + idUsuario +
               ", Nome: " + nome +
               ", Data de Nascimento: " + dataNascimento +
               ", Email: " + email +
               ", CPF: " + cpf;
    }
}
