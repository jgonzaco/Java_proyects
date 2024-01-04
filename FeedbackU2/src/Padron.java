/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fjgon
 */
public class Padron {
    //1.VARIABLES
   private int anioPadron;
   private int nHabitantes;
   private double porcentajeVariacion;
   
   //2.CONSTRUCTOR
   public Padron(int anioPadron,int nHabitantes, double porcentajeVariacion){
       this.anioPadron=anioPadron;
       this.nHabitantes=nHabitantes;
       this.porcentajeVariacion=porcentajeVariacion;
   } 
   
   //3.MÉTODOS GETTERS Y SETTERS

    public int getAnioPadron() {
        return  this.anioPadron;
    }

    public void setAnioPadron(int anioPadron) {
        this.anioPadron = anioPadron;
    }

    public int getnHabitantes() {
        return this.nHabitantes;
    }

    public void setnHabitantes(int nHabitantes) {
        this.nHabitantes = nHabitantes;
    }

    public double getPorcentajeVariacion() {
        return this.porcentajeVariacion;
    }

    public void setPorcentajeVariacion(double porcentajeVariacion) {
        this.porcentajeVariacion = porcentajeVariacion;
    }
   
   
   
}
