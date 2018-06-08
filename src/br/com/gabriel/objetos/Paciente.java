/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.objetos;

import java.util.Date;

/**
 *
 * @author SATC
 */
public class Paciente extends Pessoa {

    private int id, numeroSus;
    private Pessoa responsavel;

    public Paciente(int id, int numeroSus, Pessoa responsavel, String nome, String cpf, String rg, String endereco, String telefone, String estadoCivil, Date dataNascimento, char sexo) {
        super(nome, cpf, rg, endereco, telefone, estadoCivil, dataNascimento, sexo);
        this.id = id;
        this.numeroSus = numeroSus;
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", numeroSus=" + numeroSus + ", responsavel=" + responsavel + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSus() {
        return numeroSus;
    }

    public void setNumeroSus(int numeroSus) {
        this.numeroSus = numeroSus;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

}
