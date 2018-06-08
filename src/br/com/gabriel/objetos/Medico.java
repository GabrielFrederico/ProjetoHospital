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
public class Medico extends Pessoa {

    private int crm;
    private String especialidade, setor;

    public Medico(int crm, String especialidade, String setor, String nome, String cpf, String rg, String endereco, String telefone, String estadoCivil, Date dataNascimento, char sexo) {
        super(nome, cpf, rg, endereco, telefone, estadoCivil, dataNascimento, sexo);
        this.crm = crm;
        this.especialidade = especialidade;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Medico{" + "crm=" + crm + ", especialidade=" + especialidade + ", setor=" + setor + '}';
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}
