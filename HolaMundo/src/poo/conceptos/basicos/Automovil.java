/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.conceptos.basicos;

import java.awt.Color;

/**
 *
 * @author danny
 */
public class Automovil {
    private String marca;
    private String subaMarca;
    private int modelo;
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String subaMarca, int modelo, Color color) {
        this.marca = marca;
        this.subaMarca = subaMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subaMarca;
    }

    public void setSubaMarca(String subaMarca) {
        this.subaMarca = subaMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
   public void encender () {
       System.out.println("El auto " + this.subaMarca + " esta encendido");
   }
    public void acelerar () {
       System.out.println("Acelerando al auto " + this.subaMarca);
    }
     public void avanzar () {
       System.out.println("avanzando el auto");
     }
}

