/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roda.a.roda;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joao.fonseca
 */
public class Palavras {
    
    int indice, verificadorCat, verificadorPal;
    
    int i, m, tamanhoPalavra, cont;
   
    static String palavra, palpiteS, palavraCript, categoria;
    
    static char palpite;
    
    static char[] vetorPalavra = new char[40];
    
    static char[] mostrarPalavra = new char[40];

    Random sortear = new Random();
    
    Scanner n = new Scanner(System.in);
    
    public telaJogo tj = new telaJogo();

    public Palavras(int indice, int verificadorCat, int verificadorPal, int i, int j, int tamanhoPalavra, int cont, String palavra, char palpite) {
        this.indice = indice;
        this.verificadorCat = verificadorCat;
        this.verificadorPal = verificadorPal;
        this.i = i;
        this.m = j;
        this.tamanhoPalavra = tamanhoPalavra;
        this.cont = cont;
        Palavras.palavra = palavra;
        Palavras.palpite = palpite;
    }
    
    Palavras(){
        super();
    }

    public void darPalpite(){
            palpite = palpiteS.charAt(0);

    }
        
    public void esconderPalavra(){
        
        for (m=0 ; m<=tamanhoPalavra ; m++){
            mostrarPalavra[m] = '_';
        }
    }
    
    public void mostrarPalavra(){
        for (int k=0 ; k<tamanhoPalavra ; k++){
            
            if (vetorPalavra[k] == ' '){
               palavraCript = (palavraCript+' ');
                
            }else{
            palavraCript = (palavraCript+mostrarPalavra[k]+" ");
        }
        
        }
    }
    
    public void verificarPalpite(){
            for (i=0 ; i<tamanhoPalavra ; i++){
                if (palpite == vetorPalavra[i]){   
                    mostrarPalavra[i] = palpite;
                }   
            }
    }
    
    public void sortearPalavra(){
        
        verificadorCat = sortear.nextInt(9);
        verificadorPal = sortear.nextInt(9);
        
        switch (verificadorCat){
            
            case 0:
                categoria = ("Cantores");
                palavra = Cantores[verificadorPal];
                break;
                
            case 1:
                categoria = ("Animal");
                palavra = Animal[verificadorPal];
                break;
                
            case 2:
                categoria = ("Fruta");
                palavra = Fruta[verificadorPal];
                break;

            case 3:
                categoria = ("Comida");
                palavra = Comida[verificadorPal];
                break;

            case 4:
                categoria = ("País");
                palavra = País[verificadorPal];
                break;

            case 5:
                categoria = ("Eletrônicos");
                palavra = Eletrônicos[verificadorPal];
                break;

            case 6:
                categoria = ("Praia");
                palavra = Praia[verificadorPal];
                break;

            case 7:
                categoria = ("Profissão");
                palavra = Profissão[verificadorPal];
                break;

            case 8:
                categoria = ("Escola");
                palavra = Escola[verificadorPal];
                break;

            case 9:
                categoria = ("Parte do corpo humano");
                palavra = PDCH[verificadorPal];
                break;
        }
        
        palavra = palavra.toLowerCase();
        vetorPalavra = palavra.toCharArray();
        tamanhoPalavra = vetorPalavra.length;
    }
    
    String bancoDeCategorias[] = {"Cantor(a)", "Animal","Fruta","Comida","País","Eletrônicos","Praia","Profissão","Escola","Parte do corpo humano"};
    
    final String Cantores[] = {"Roberto Carlos","Luan Santana","Justin Bieber","Ivete Sangalo","Britney Spears","Lady Gaga","Ze Ramalho","Tina Turner","Wesley Safadao","Rihanna"};
    final String Animal[] = {"Urso","Víbora","Borboleta","Ornitorrinco","Zebra","Dromedario","Orca","Lontra","Crocodilo","Ouriço"};
    final String Fruta[] = {"Lichia","Kiwi","Tomate","Tamarindo","Pitanga","Pequi","Maracuja","Jabuticaba","Guarana","Graviola"};
    final String Comida[] = {"Tacaca","Vatapa","Pamonha","Estrogonofe","Lasanha","Coxinha","Pao de Queijo","Quindim","Tapioca","Curau"};
    final String País[] = {"Bulgaria","Etiopia","Brasil","Guiana","Tunisia","Madagascar","Serra Leoa","Portugal","Palestina","Noruega"};
    final String Eletrônicos[] = {"Ventilador","Secadora","Chapinha","Torradeira","Liquidificador","Microfone","Sanduicheira","Telefone","Geladeira","Televisao"};
    final String Praia[] = {"Tanga","Coqueiro","Marisco","Banhista","Frescobol","Coral","Concha","Brisa","Surfe","Picole"};
    final String Profissão[] = {"Enfermeiro","Gerontologista","Engenheiro", "Motorista","Eletricista","Cientista","Agrimensor","Locutor","Biblioteconomista","Agricultor",};
    final String Escola [] = {"Discente","Docente","Cola branca","Tesoura","Pincel","Borracha","Sirene","Lapiseira","Dicionario","Caderno"};
    final String PDCH [] = {"Joelho", "Patela","Tornozelo","Intestino","Cotovelo","Faringe","Olho","Coluna cervical","Rins","Garganta"};  
}

        
