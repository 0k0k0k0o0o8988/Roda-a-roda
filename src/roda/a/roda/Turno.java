/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roda.a.roda;

/**
 *
 * @author JoãoCarlos
 */
public class Turno extends RodaARoda{
    
    int QtdTurno, TurnoAtual;

    void Turno(int QtdTurno, int TurnoAtual) {
        this.QtdTurno = QtdTurno;
        this.TurnoAtual = TurnoAtual;
    }
    
    void definirTurno(){
        QtdTurno = j.qtdJog;
        TurnoAtual = 1;
    }
    
    void ImprimirTurno(){
        System.out.println("Vez de: " + j.nomeJog[TurnoAtual]);
    }
    
    void ManipularTurno(){

        
    }
}
