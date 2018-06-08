/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.singleton;

/**
 *
 * @author SATC
 */
public class SPaciente {
    
    private SPaciente() {
    }
    
    public static SPaciente getInstance() {
        return SPacienteHolder.INSTANCE;
    }
    
    private static class SPacienteHolder {

        private static final SPaciente INSTANCE = new SPaciente();
    }
}
