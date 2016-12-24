/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roda.a.roda;

/**
 *
 * @author joao.fonseca
 */
public class RodaARoda {

    static int x;
    
    Jogadores j = new Jogadores();
    Palavras p = new Palavras(0,0,0,0,0,0,0," ",' ');
    
    
    public void jogar(){

        p.sortearPalavra();
        p.esconderPalavra();


        for (x=0 ; x<27 ; x++){

            p.darPalpite();
            p.verificarPalpite(); 
            p.mostrarPalavra();
        }
    }  

}
