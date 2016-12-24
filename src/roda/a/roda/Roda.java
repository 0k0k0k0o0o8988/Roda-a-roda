/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roda.a.roda;

import java.util.Random;

/**
 *
 * @author joao.fonseca
 */
public class Roda {
    
    static int verificador;
    
    static Random sortear = new Random();
    
    String resultPrint;
    
    
    public void rodar(){
        
        verificador = sortear.nextInt(23);
        
        resultPrint = resultados[verificador];
         
    }
  
    String resultados[] = {"PERDE TUDO", "$1000", "$650", "$400", "$650", "$300", "PASSA A VEZ", "$550", "$900", "$450", "$100", "$750", "PASSA A VEZ", "$950", "$200", "$350", "$700", "$250", "PASSA A VEZ", "$600", "$850", "$500", "$50", "$800"};
    }
    
    

