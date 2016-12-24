/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roda.a.roda;

import java.util.Scanner;

/**
 *
 * @author JoãoCarlos
 */
public class teste {
    
    
    static Scanner s = new Scanner(System.in);
    
    public static void main(String args[]){
    
       
        jogar();
        
        
    }
    
    static void jogar(){
        
        
        Palavras p = new Palavras();
        
        p.sortearPalavra();
        p.esconderPalavra();
        
        for( int x=0 ; x<29 ; x++){
            p.palpite = s.next().charAt(0);
            p.verificarPalpite();
            p.mostrarPalavra();
    }

