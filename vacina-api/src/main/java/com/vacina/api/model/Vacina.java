package com.vacina.api.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vacina")
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vacina;

    @NotNull
    @Size(min = 3, max = 50)
    private String numero_vacina;

    @NotNull
    @Size(min = 3, max = 100)
    private String lote_vacina;

    @NotNull
    @Size(min = 3, max = 45)
    private String nome_vacina;

    @NotNull
    @Size(min = 3, max = 45)
    private String descricao_vacina;

    @NotNull
    private Date data_vencimento;

    @NotNull
    private Date data_producao;

    @NotNull
    private String faixa_etaria;

    public Long getId_vacina() {
        return id_vacina;
    }

    public void setId_vacina(Long id_vacina) {
        this.id_vacina = id_vacina;
    }

    public String getNumero_vacina() {
        return numero_vacina;
    }

    public void setNumero_vacina(String numero_vacina) {
        this.numero_vacina = numero_vacina;
    }

    public String getLote_vacina() {
        return lote_vacina;
    }

    public void setLote_vacina(String lote_vacina) {
        this.lote_vacina = lote_vacina;
    }

    public String getNome_vacina() {
        return nome_vacina;
    }

    public void setNome_vacina(String nome_vacina) {
        this.nome_vacina = nome_vacina;
    }

    public String getDescricao_vacina() {
        return descricao_vacina;
    }

    public void setDescricao_vacina(String descricao_vacina) {
        this.descricao_vacina = descricao_vacina;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public Date getData_producao() {
        return data_producao;
    }

    public void setData_producao(Date data_producao) {
        this.data_producao = data_producao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_vacina == null) ? 0 : id_vacina.hashCode());
        return result;
    }

    public String getFaixa_etaria() {
        return faixa_etaria;
    }

    public void setFaixa_etaria(String faixa_etaria) {
        this.faixa_etaria = faixa_etaria;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vacina other = (Vacina) obj;
        if (id_vacina == null) {
            if (other.id_vacina != null)
                return false;
        } else if (!id_vacina.equals(other.id_vacina))
            return false;
        return true;
    }

}
