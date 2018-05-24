/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.objetos;

import java.util.List;

/**
 *
 * @author SATC
 */
public class Triagem {

    private Enfermeira enfermeira;
    private Paciente paciente;
    private String pressao, sintoma;
    private float temperatura, peso, altura, imc;
    private List<String> alergias;
    private boolean febre;

    public Triagem(Enfermeira enfermeira, Paciente paciente, String pressao, String sintoma, float temperatura, float peso, float altura, List<String> alergias) {
        this.enfermeira = enfermeira;
        this.paciente = paciente;
        this.pressao = pressao;
        this.sintoma = sintoma;
        this.temperatura = temperatura;
        this.peso = peso;
        this.altura = altura;
        this.alergias = alergias;
    }

    @Override
    public String toString() {
        return "Triagem{" + "enfermeira=" + enfermeira + ", paciente=" + paciente + ", pressao=" + pressao + ", sintoma=" + sintoma + ", temperatura=" + temperatura + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + ", alergias=" + alergias + ", febre=" + febre + '}';
    }

    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public boolean isFebre() {
        return febre;
    }

    public void setFebre(boolean febre) {
        this.febre = febre;
    }

}
