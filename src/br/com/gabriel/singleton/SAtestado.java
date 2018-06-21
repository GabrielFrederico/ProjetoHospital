/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.singleton;

import br.com.gabriel.objetos.Atestado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SAtestado {

    List<Atestado> atestados = new ArrayList();

    private SAtestado() {
    }

    public List<Atestado> getAtestados() {
        return atestados;
    }

    public static SAtestado getInstance() {
        return SAtestadoHolder.INSTANCE;
    }

    private static class SAtestadoHolder {

        private static final SAtestado INSTANCE = new SAtestado();
    }
}
