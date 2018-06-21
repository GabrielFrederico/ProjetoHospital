/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.singleton;

import br.com.gabriel.objetos.Enfermeira;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SEnfermeira {

    List<Enfermeira> enfermeiras = new ArrayList();

    private SEnfermeira() {
    }

    public List<Enfermeira> getEnfermeiras() {
        return enfermeiras;
    }

    public static SEnfermeira getInstance() {
        return SEnfermeiraHolder.INSTANCE;
    }

    private static class SEnfermeiraHolder {

        private static final SEnfermeira INSTANCE = new SEnfermeira();
    }
}
