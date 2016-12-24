/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roda.a.roda;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;
import sun.applet.AppletViewer;

/**
 *
 * @author Líneker
 */
public class Escreve_arquivo {	

                
    public void salvarScore(int score, String nome){
        try{
        
            OutputStream os = new FileOutputStream("arquivo.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            
            bw.append(String.valueOf(score));
            bw.append(";");
            bw.append(nome);
            bw.newLine();
  
            bw.close();
            
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }       
    }
    
    
    
    public Score[] lerScore(){
        int count = Cont(); 
        Score score[] = new Score[count];
        
        try{
            InputStream is = new FileInputStream("arquivo.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
                 String[] str = new String[2];
                 
            for(int i=0; i< count; i++){

                String b = br.readLine();
                if(b!=null){
                    str = b.split(";");
                }
                
                score[i] = new Score(Integer.parseInt(str[0]), str[1]);
                
            }
            
            
            br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        return score;
    }
    
    public int Cont(){
        int cont=0;
        try{
            InputStream is = new FileInputStream("arquivo.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            while(br.readLine() != null){
                
                cont++;
            }
          
            br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        } 
        return cont;
    }
}