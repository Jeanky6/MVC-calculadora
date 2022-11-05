/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.atuonoma.Calculadora.models;
import java.lang.RuntimeException;
/**
 *
 * @author Jean Carlo Toro Castrillon
 * @version 0.0.1
 * @since 20221105
 * 
 * Permit realizar operaciones matematicas
 */
public class Calculadora {
    /**
     * Identificacion de la calculadora
     */
    private String nombre;
    /**
     * Fecha creacion calculadora
     */
    private String modelo;
    /**
     * Fabricante de la calculadora
     */
    private String marca;
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Calculadora (String nombre, String marca){
        this.nombre=nombre;
        this.marca=marca;
        this.modelo="No especificado";
        
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * 
     * Muestra la informacion de los atribustos de la clase:
     * 
     * @return Informacion: Cadena de texto que muestra los atrubutos de la clase
     */
    public String mostrarDatos(){
        String informacion= "";
        informacion += "Nombre: "+this.nombre+"\n";
        informacion += "Marca: "+this.marca+"\n";
        informacion += "Modelo: "+this.modelo+"\n";
        return informacion;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * 
     * Suma dos numeros de tipo real (Double)
     * 
     * @param n1 sumando 1
     * @param n2 sumando 2
     * @return suma: Varibale de tipo real con el resultado de la suma
     */
    public double sumar(double n1, double n2){
        double suma = n1+n2;
        return suma;
        
    }
    /**
     * 
     * Resta dos numeros de tipo real (Double)
     * 
     * @param n1 minuendo 1
     * @param n2 sustraendo 2
     * @return resta: Resultado de la resta
     */
    public double restar(double n1, double n2){
        double resta = n1-n2;
        return resta;
        
    }
    /**
     * 
     * Multiplica dos numeros de tipo real (Double)
     * 
     * @param n1 Factor 1
     * @param n2 Factor 2
     * @return mult: Resultado de la multiplicacion
     */
    public double multiplicar(double n1, double n2){
        double mult = n1*n2;
        return mult;
        
    }
    /**
     * 
     * Divide dos numeros de tipo real (Double)
     * 
     * @param n1 Divisior 1
     * @param n2 Dividendo 2
     * @return div: Cociente de la division
     * @throws RuntimeException se lanza cuando el dividendo es igual a 0
     */
    public double dividir(double n1, double n2) throws RuntimeException{
        if (n2!=0){
            double div = n1/n2;
            return div;
        } else {
            throw new RuntimeException();
        }
        
        
    }
    /**
     * 
     * Divide dos numeros de tipo real (Double)
     * 
     * @param n1 Base de la raiz
     * @return raiz: Resultado al sacar la raiz cuadrada
     * @throws RuntimeException se lanza cuando la base es negativa ya que la raiz de un numero negativo es imaginaria
     */
    public double calcularRaiz(double n1)throws RuntimeException{
        if (n1>0){
            double raiz=Math.sqrt(n1);
            return raiz;
        }else{
            throw new RuntimeException();
        }
        
    }
    /**
     * 
     * Divide dos numeros de tipo real (Double)
     * 
     * @param base 
     * @param exponente 
     * @return potencia: Resultado de la exponenciacion 
     * @throws RuntimeException se lanza cuando la base y el exponente sean igual a 0 ya que daria una indeterminacion
     */
    public double calcularPotencia(double base, double exponente)throws RuntimeException{
        if (base==0 && exponente==0){
            throw new RuntimeException();
        }else{
            double potencia= Math.pow(base, exponente);
            return potencia;
        }
        
        
    }
}
