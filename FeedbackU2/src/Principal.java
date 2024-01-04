/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fjgon
 */
public class Principal {
    public static void main(String[] args){
        
        Padron padron1=new Padron(2023,150000,25);
        Padron padron2=new Padron(2022,120000,4.35);
        Padron padron3=new Padron(2021,115000,5);
        
        Poblacion poblacion1=new Poblacion("Madrid","Madrid","Torrejón de Ardoz",padron1);
        Poblacion poblacion2=new Poblacion("Castilla La Mancha","Toledo","Quismondo",padron2);
        Poblacion poblacion3=new Poblacion("Madrid","Madrid","Robledo de Chavela",padron3);
        
        
        System.out.println("De la Poblacion 1, la Comunidad Autónoma es "+poblacion1.getcAutonoma()+", su provincia es "+poblacion1.getProvincia()+", su poblacion es "+poblacion1.getnPoblacion()+", el año del padron "+poblacion1.padron.getAnioPadron()+", el número de habitantes es "+poblacion1.padron.getnHabitantes()+" y el porcentaje de variacion es  "+poblacion1.padron.getPorcentajeVariacion()+"%.");
        System.out.println("De la Poblacion 2, la Comunidad Autónoma es "+poblacion2.getcAutonoma()+", su provincia es "+poblacion2.getProvincia()+", su poblacion es "+poblacion2.getnPoblacion()+", el año del padron "+poblacion2.padron.getAnioPadron()+", el número de habitantes es "+poblacion2.padron.getnHabitantes()+" y el porcentaje de variacion es  "+poblacion2.padron.getPorcentajeVariacion()+"%.");
        System.out.println("De la Poblacion 3, la Comunidad Autónoma es "+poblacion3.getcAutonoma()+", su provincia es "+poblacion3.getProvincia()+", su poblacion es "+poblacion3.getnPoblacion()+", el año del padron "+poblacion3.padron.getAnioPadron()+", el número de habitantes es "+poblacion3.padron.getnHabitantes()+" y el porcentaje de variacion es  "+poblacion3.padron.getPorcentajeVariacion()+"%.");
   
    poblacion1.setcAutonoma("Cantabria");
    poblacion2.setcAutonoma("Asturias");
    poblacion3.setcAutonoma("Galicia");
    
    poblacion1.setProvincia("Santander");
    poblacion2.setProvincia("Gijón");
    poblacion3.setProvincia("Lugo");
    
    poblacion1.setnPoblacion("Castro-Urdiales");
    poblacion2.setnPoblacion("Gijón");
    poblacion3.setnPoblacion("Xove");
    
    poblacion1.padron.setAnioPadron(1995);
    poblacion2.padron.setAnioPadron(1996);
    poblacion3.padron.setAnioPadron(1997);
    
    poblacion1.padron.setnHabitantes(3000);
    poblacion2.padron.setnHabitantes(2500);
    poblacion3.padron.setnHabitantes(2000);
    
    
    poblacion1.padron.setPorcentajeVariacion(5);
    poblacion2.padron.setPorcentajeVariacion(3);
    poblacion3.padron.setPorcentajeVariacion(2);
    
    System.out.println("De la Poblacion 1, la Comunidad Autónoma es "+poblacion1.getcAutonoma()+", su provincia es "+poblacion1.getProvincia()+", su poblacion es "+poblacion1.getnPoblacion()+", el año del padron "+poblacion1.padron.getAnioPadron()+", el número de habitantes es "+poblacion1.padron.getnHabitantes()+" y el porcentaje de variacion es  "+poblacion1.padron.getPorcentajeVariacion()+"%.");
    System.out.println("De la Poblacion 2, la Comunidad Autónoma es "+poblacion2.getcAutonoma()+", su provincia es "+poblacion2.getProvincia()+", su poblacion es "+poblacion2.getnPoblacion()+", el año del padron "+poblacion2.padron.getAnioPadron()+", el número de habitantes es "+poblacion2.padron.getnHabitantes()+" y el porcentaje de variacion es  "+poblacion2.padron.getPorcentajeVariacion()+"%.");
    System.out.println("De la Poblacion 3, la Comunidad Autónoma es "+poblacion3.getcAutonoma()+", su provincia es "+poblacion3.getProvincia()+", su poblacion es "+poblacion3.getnPoblacion()+", el año del padron "+poblacion3.padron.getAnioPadron()+", el número de habitantes es "+poblacion3.padron.getnHabitantes()+" y el porcentaje de variacion es  "+poblacion3.padron.getPorcentajeVariacion()+"%.");
   
    }
}
