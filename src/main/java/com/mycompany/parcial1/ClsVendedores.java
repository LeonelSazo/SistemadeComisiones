/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author Leonel
 */
//la clase con la variables que se utilizaran en el arreglo
public class ClsVendedores {
    private String Nombre;
    private double Enero;
    private double Febrero;
    private double Marzo;
    private double Abril;
    private double Mayo;
    private double Junio;
    private double Julio;
    private double Agosto;
    private double Septiembre;
    private double Octubre;
    private double Noviembre;
    private double Diciembre;
    private double TotVentas;
    private double Vent6mese;
    private double com20;
    private double com35;
    private double Com206m;
    private double Com356m;
    private double TotVentascomi;
    private double ISR;
    private double Liquido;
    private double Liquido6m;
    private double TotVentascomi6m;
    private double ISR6m;
    
    public ClsVendedores(String Nombre){
        this.Nombre = Nombre;
    }

    /**
     * @return the Nombre
     */
    
    //crear los get y set de la variables para asignar el valor y modificarlo
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
   }

    /**
     * @return the Enero
     */
    public double getEnero() {
        return Enero;
    }

    /**
     * @param Enero the Enero to set
     */
    public void setEnero(double Enero) {
        this.Enero = Enero;
    }

    /**
     * @return the Febrero
     */
    public double getFebrero() {
        return Febrero;
    }

    /**
     * @param Febrero the Febrero to set
     */
    public void setFebrero(double Febrero) {
        this.Febrero = Febrero;
    }

    /**
     * @return the Marzo
     */
    public double getMarzo() {
        return Marzo;
    }

    /**
     * @param Marzo the Marzo to set
     */
    public void setMarzo(double Marzo) {
        this.Marzo = Marzo;
    }

    /**
     * @return the Abril
     */
    public double getAbril() {
        return Abril;
    }

    /**
     * @param Abril the Abril to set
     */
    public void setAbril(double Abril) {
        this.Abril = Abril;
    }

    /**
     * @return the TotVentas
     */
    public double getTotVentas() {
        return TotVentas;
    }

    /**
     * @param TotVentas the TotVentas to set
     */
    public void setTotVentas(double TotVentas) {
        this.TotVentas = TotVentas;
    }

    /**
     * @return the com20
     */
    public double getCom20() {
        return com20;
    }

    /**
     * @param com20 the com20 to set
     */
    public void setCom20(double com20) {
        this.com20 = com20;
    }

    /**
     * @return the com35
     */
    public double getCom35() {
        return com35;
    }

    /**
     * @param com35 the com35 to set
     */
    public void setCom35(double com35) {
        this.com35 = com35;
    }

    /**
     * @return the TotVentascomi
     */
    public double getTotVentascomi() {
        return TotVentascomi;
    }

    /**
     * @param TotVentascomi the TotVentascomi to set
     */
    public void setTotVentascomi(double TotVentascomi) {
        this.TotVentascomi = TotVentascomi;
    }

    /**
     * @return the ISR
     */
    public double getISR() {
        return ISR;
    }

    /**
     * @param ISR the ISR to set
     */
    public void setISR(double ISR) {
        this.ISR = ISR;
    }

    /**
     * @return the Liquido
     */
    public double getLiquido() {
        return Liquido;
    }

    /**
     * @param Liquido the Liquido to set
     */
    public void setLiquido(double Liquido) {
        this.Liquido = Liquido;
    }

    /**
     * @return the Mayo
     */
    public double getMayo() {
        return Mayo;
    }

    /**
     * @param Mayo the Mayo to set
     */
    public void setMayo(double Mayo) {
        this.Mayo = Mayo;
    }

    /**
     * @return the Junio
     */
    public double getJunio() {
        return Junio;
    }

    /**
     * @param Junio the Junio to set
     */
    public void setJunio(double Junio) {
        this.Junio = Junio;
    }

    /**
     * @return the Julio
     */
    public double getJulio() {
        return Julio;
    }

    /**
     * @param Julio the Julio to set
     */
    public void setJulio(double Julio) {
        this.Julio = Julio;
    }

    /**
     * @return the Agosto
     */
    public double getAgosto() {
        return Agosto;
    }

    /**
     * @param Agosto the Agosto to set
     */
    public void setAgosto(double Agosto) {
        this.Agosto = Agosto;
    }

    /**
     * @return the Septiembre
     */
    public double getSeptiembre() {
        return Septiembre;
    }

    /**
     * @param Septiembre the Septiembre to set
     */
    public void setSeptiembre(double Septiembre) {
        this.Septiembre = Septiembre;
    }

    /**
     * @return the Octubre
     */
    public double getOctubre() {
        return Octubre;
    }

    /**
     * @param Octubre the Octubre to set
     */
    public void setOctubre(double Octubre) {
        this.Octubre = Octubre;
    }

    /**
     * @return the Noviembre
     */
    public double getNoviembre() {
        return Noviembre;
    }

    /**
     * @param Noviembre the Noviembre to set
     */
    public void setNoviembre(double Noviembre) {
        this.Noviembre = Noviembre;
    }

    /**
     * @return the Diciembre
     */
    public double getDiciembre() {
        return Diciembre;
    }

    /**
     * @param Diciembre the Diciembre to set
     */
    public void setDiciembre(double Diciembre) {
        this.Diciembre = Diciembre;
    }

    /**
     * @return the Vent6mese
     */
    public double getVent6mese() {
        return Vent6mese;
    }

    /**
     * @param Vent6mese the Vent6mese to set
     */
    public void setVent6mese(double Vent6mese) {
        this.Vent6mese = Vent6mese;
    }

    /**
     * @return the Liquido6m
     */
    public double getLiquido6m() {
        return Liquido6m;
    }

    /**
     * @param Liquido6m the Liquido6m to set
     */
    public void setLiquido6m(double Liquido6m) {
        this.Liquido6m = Liquido6m;
    }

    /**
     * @return the TotVentascomi6m
     */
    public double getTotVentascomi6m() {
        return TotVentascomi6m;
    }

    /**
     * @param TotVentascomi6m the TotVentascomi6m to set
     */
    public void setTotVentascomi6m(double TotVentascomi6m) {
        this.TotVentascomi6m = TotVentascomi6m;
    }

    /**
     * @return the ISR6m
     */
    public double getISR6m() {
        return ISR6m;
    }

    /**
     * @param ISR6m the ISR6m to set
     */
    public void setISR6m(double ISR6m) {
        this.ISR6m = ISR6m;
    }

    /**
     * @return the Com206m
     */
    public double getCom206m() {
        return Com206m;
    }

    /**
     * @param Com206m the Com206m to set
     */
    public void setCom206m(double Com206m) {
        this.Com206m = Com206m;
    }

    /**
     * @return the Com356m
     */
    public double getCom356m() {
        return Com356m;
    }

    /**
     * @param Com356m the Com356m to set
     */
    public void setCom356m(double Com356m) {
        this.Com356m = Com356m;
    }
}

