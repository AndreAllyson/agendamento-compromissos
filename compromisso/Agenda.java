/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agenda.compromisso;

public class Agenda {

    public static void main(String[] args) {
        Compromisso com = new Compromisso();
        Reuniao reu = new Reuniao();
        EventoSocial evso = new EventoSocial();
        
        
    }
    
    static void impressao (Compromisso x){
        System.out.println(x.RealizarTarefa());
    }
}
