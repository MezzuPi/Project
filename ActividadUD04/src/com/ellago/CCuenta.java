/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ellago;


public class CCuenta {

	//Atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    //Constructores
    public CCuenta()
    {
    }

    /**
     * Constructor para inicializar todos los atributos
     * @param nom Nombre del titular
     * @param cue Numero de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    
    //Metodos
    /**
     * Metodo para asignar el nombre, setter
     * @param nom Nombre del titular
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Metodo para obtener el nombre, getter
     * @return nombre del titular
     */
    public String obtenerNombre()
    {
        return getNombre();
    }


    /**
     * Metodo para conocer el saldo de la cuenta
     * @return devuelve el saldo
     */
    public double estado()
    {
        return saldo;
    }


    /**
     * Metodo para ingresar dinero en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Error en caso de que la cantidad sea negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Metodo para retirar dinero de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception Error en caso de que la cantidad a retirar sea superior al saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Metodo getter para obtener el nombre de la cuenta
     * @return nombre de la cuenta
     */
    public String obtenerCuenta()
    {
        return cuenta;
    }

    /**
     * Metodo getter para obtener el nombre del titular de la cuenta
     * @return Nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setter para introducir el nombre del titular de la cuenta
     * @param nombre Nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo getter para obtener el tipo de interes
     * @return Nombre del tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Metodo setter para introducir el tipo de interes
     * @param tipoInterés El tipo de interes de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
