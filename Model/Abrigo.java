package Model;
import Model.Animal;

import Db.Database;
import java.sql.*;


public class Abrigo{
  private int id;
  private String nome;
  private String endereco;
  private int telefone;
  private String responsvel;
  private int capacidade;
  private String observacoes;
  private int id_animal;

  public Abrigo(int id, String nome, String endereco, int telefone, String responsvel, int capacidade, String observacoes, int id_animal){
    this.id = id;
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.responsvel = responsvel;
    this.capacidade = capacidade;
    this.observacoes = observacoes;
  }
  public int getId()
    {return this.id;}
    public void setId(int id)
      {this.id = id;}

    public String getNome()
      {return this.nome;}
      public void setNome(String nome)
        {this.nome = nome;}

    public String getEndereco()
      {return this.endereco;}
      public void setEndereco(String endereco)
        {this.endereco = endereco;}

    public int getTelefone()
      {return this.telefone;}
      public void setTelefone(int telefone)
        {this.telefone = telefone;}

    public String getResponsvel()
      {return this.responsvel;}
      public void setResponsvel(String responsvel)
        {this.responsvel = responsvel;}

    public int getCapacidade()
      {return this.capacidade;}
      public void setCapacidade(int capacidade)
        {this.capacidade = capacidade;}

    public String getObservacoes()
      {return this.observacoes;}
      public void setObservacoes(String observacoes)
        {this.observacoes = observacoes;}

    public int getId_animal()
      {return this.id_animal;}
      public void setId_animal(int id_animal)
        {this.id_animal = id_animal;}


  @Override
  public String toString() {
    return "Abrigo{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", responsvel=" + responsvel + ", capacidade=" + capacidade + ", observacoes=" + observacoes + ", id_animal=" + id_animal + '}';
  }


}