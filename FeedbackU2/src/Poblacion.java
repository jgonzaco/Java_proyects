/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fjgon
 */
public class Poblacion {
    //1.VARIABLES
    private String cAutonoma;
    private String provincia;
    private String nPoblacion;
    public Padron padron;
    //2.CONSTRUCTOR
    public Poblacion(String cAutonoma, String provincia, String nPoblacion, Padron padron){
        this.cAutonoma=cAutonoma;
        this.provincia=provincia;
        this.nPoblacion=nPoblacion;
        this.padron=padron;
        }
    
    //3.MÉTODOS
    public String getcAutonoma(){
        return this.cAutonoma;
    }
    
    public void setcAutonoma(String cAutonoma){
        this.cAutonoma=cAutonoma;
    }
    
    public String getProvincia(){
        return this.provincia;
    }
    
    public void setProvincia(String provincia){
        this.provincia=provincia;
    }
    
    public String getnPoblacion(){
        return this.nPoblacion;
    }
    
    public void setnPoblacion(String nPoblacion){
        this.nPoblacion=nPoblacion;
    } 
    
}
