/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.atuonoma.Calculadora.main;

import co.edu.atuonoma.Calculadora.models.Calculadora;
import co.edu.atuonoma.Calculadora.views.CalculadoraView;

/**
 *
 * @author Jean Carlo Toro Castrillon
 * @version 0.0.1
 * @since 20221105
 */
public class Main {
    /**
     * 
     * @param args 
     */
    
    public static void main (String[] args){
        Calculadora calculadora = new Calculadora ("CalculadoraJean", "Casio");
        calculadora.setModelo("20221105");
        CalculadoraView ventana = new CalculadoraView();
        ventana.setVisible(true);
    }
    
}
