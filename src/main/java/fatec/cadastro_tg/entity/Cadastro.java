package fatec.cadastro_tg.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tg_cadastro")

public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tg_id")
    private Long id;

    @Column(name = "tg_aluno")
    private String aluno;

    @Column(name = "tg_orientador")
    private String orientador;

    @Column(name = "tg_nota")
    private Float nota;

    @Column(name = "tg_data_hora_apresentacao")
    private LocalDateTime dataHoraApresentacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public LocalDateTime getDataHoraApresentacao() {
        return dataHoraApresentacao;
    }

    public void setDataHoraApresentacao(LocalDateTime dataHoraApresentacao) {
        this.dataHoraApresentacao = dataHoraApresentacao;
    }



    
    
}


