/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda.compromisso;

/**
 *
 * @author allyson
 */
public class Reuniao extends Compromisso {
    public String participantes;
    
    @Override
    public String RealizarTarefa(){
        return participantes;
}
}
