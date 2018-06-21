/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.singleton;

import br.com.gabriel.objetos.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SMedico {

    List<Medico> medicos = new ArrayList();

    private SMedico() {
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public static SMedico getInstance() {
        return SMedicoHolder.INSTANCE;
    }

    private static class SMedicoHolder {

        private static final SMedico INSTANCE = new SMedico();
    }
}
