/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.singleton;

import br.com.gabriel.objetos.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SPaciente {

    List<Paciente> pacientes = new ArrayList();

    private SPaciente() {
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public static SPaciente getInstance() {
        return SPacienteHolder.INSTANCE;
    }

    private static class SPacienteHolder {

        private static final SPaciente INSTANCE = new SPaciente();
    }
}
