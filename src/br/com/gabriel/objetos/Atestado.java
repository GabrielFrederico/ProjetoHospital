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
public class Atestado {

    private Date dataInicioDoAtestado, dataFimDoAtestado;
    private Consulta consulta;
    private int quantidadeDias;

    public Atestado(Date dataInicioDoAtestado, Date dataFimDoAtestado, Consulta consulta, int quantidadeDias) {
        this.dataInicioDoAtestado = dataInicioDoAtestado;
        this.dataFimDoAtestado = dataFimDoAtestado;
        this.consulta = consulta;
        this.quantidadeDias = quantidadeDias;
    }

    @Override
    public String toString() {
        return "Atestado{" + "dataInicioDoAtestado=" + dataInicioDoAtestado + ", dataFimDoAtestado=" + dataFimDoAtestado + ", consulta=" + consulta + ", quantidadeDias=" + quantidadeDias + '}';
    }

    public Date getDataInicioDoAtestado() {
        return dataInicioDoAtestado;
    }

    public void setDataInicioDoAtestado(Date dataInicioDoAtestado) {
        this.dataInicioDoAtestado = dataInicioDoAtestado;
    }

    public Date getDataFimDoAtestado() {
        return dataFimDoAtestado;
    }

    public void setDataFimDoAtestado(Date dataFimDoAtestado) {
        this.dataFimDoAtestado = dataFimDoAtestado;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

}
