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
public class ArquivoService {
    
    static ArquivoService INSTANCE = null;
    
    static ArquivoService getInstance(){
        if (INSTANCE == null){
            INSTANCE = new ArquivoService();}
        return INSTANCE;
    }
    
}
