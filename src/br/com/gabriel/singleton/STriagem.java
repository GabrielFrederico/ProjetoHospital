/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.singleton;

import br.com.gabriel.objetos.Triagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class STriagem {

    List<Triagem> triagem = new ArrayList();

    private STriagem() {
    }

    public List<Triagem> getTriagem() {
        return triagem;
    }

    public static STriagem getInstance() {
        return STriagemHolder.INSTANCE;
    }

    private static class STriagemHolder {

        private static final STriagem INSTANCE = new STriagem();
    }
}
