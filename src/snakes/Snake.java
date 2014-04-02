/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakes;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class Snake {
    //añadir los numeros en las constantes
    //creacion de variable de matriz

    private char[][] tablero;
    private int tamFila;
    private int tamCol;
    public static final char VACIO = '.';
    public static final char CABEZA = '@';
    public static final char CUERPO = '=';
    public static final char MURO = '#';
    public static final char FRUTA = '$';
    private final int MARGEN = 2;
    //El tamaño inicial del cuerpo no puede ser mayor que el margen
    private final int TAM_INI_CUERPO = 2;
    
    public static final byte DERECHO = 0;
    public static final byte IZQUIERDA = 1;
    public static final byte ARRIBA = 2;
    public static final byte ABAJO = 3;
    
    /*
     informacion contenida en el tablero
     * ' ':vacio
     * '@': cabeza
     * '=': cuerpo
     * '#': pared
     * '$': fruto
     */

    //

    public Snake(int tamFila, int tamCol) {
        this.tamFila = tamFila;
        this.tamCol = tamCol;

        tablero = new char[tamFila][tamCol];
        //inicializamos el tablero con todo vacio
        for (int f = 0; f < tamFila; f++) {
            for (int c = 0; c < tamCol; c++) {
                tablero[f][c] = VACIO;
            }
        }
        //colocar la cabeza en posicion aleatoria
        Random random = new Random();
        int cabezaFila = random.nextInt(tamFila - 2 * MARGEN) + MARGEN;
        int cabezaCol = random.nextInt(tamCol - 2 * MARGEN) + MARGEN;
        tablero[cabezaFila][cabezaCol] = CABEZA;
        //colocar el cuerpo
        for (int i = 1; i <= TAM_INI_CUERPO; i++) {
            tablero[cabezaFila][cabezaCol - i] = CUERPO;
        }
    }
    @Override
    //tablero que lo retorne como String
    public String toString(){
        String retorno = " ";
         for (int f = 0; f < tamFila; f++) {
            for (int c = 0; c < tamCol; c++) {
                retorno += tablero[f][c];
            }
            retorno +='\n';
        }
         return retorno;
    }
    public boolean mover(byte direccion){
        
    }
}
