package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "generos")
public class Genero {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    public void setId(long id){
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getnome(){
        return this.nome;
    }
}
