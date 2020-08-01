/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciasimpletarea1;

/**
 *
 * @author Carlos Arias
 */
class Vehiculos{
    String Vehiculo_liviano;
    String Vehiculo_pesado;
       void Determinar_caracteristica_vehiculo(){
           System.out.println("El tipo de vehiculo es: "+Vehiculo_liviano);
           System.out.println("El tipo de vehiculo es: "+Vehiculo_pesado);
       }
    
}

class Neumaticos extends Vehiculos{
    String tipo_neumatico;
        int caracteristica_neumatico;
       String determinar_requerimientos;
           
       
       void Determinar_funcionamiento(){
           System.out.println("Los neumaticos para los tipos de vehiculos son: ");
           System.out.println("El tipo de vehiculo liviano es automovil y necesita: "+tipo_neumatico);
           System.out.println("El tipo de vehiculo pesado es bus y necesita: "+tipo_neumatico);
           
       }
}

class Neumatico_Radial extends Neumaticos{
    int area_neumatico;
    int presion_aire_neumatico;
            
                    
    void Determinar_Neumatico_Radial(){
           
           System.out.println("Los Datos del area del neumatico estan daddos por: ");
           System.out.println("El codigo de la llanta para automoviles es: ");
           System.out.println("La presion de aire del neumatico para automovil es:" );
           System.out.println("El codigo de la llanta para bus es: ");
           System.out.println("La presion de aire del neumatico para bus es:" );
       }
}

public class HerenciaSimpleTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("                  Universidad de las Fuerzas Armadas ESPE");
        System.out.println("                              Sede Latacunga");
        System.out.println("                          Ingenieria Automotriz");
        System.out.println("Desarrollador: Arias Gallo Carlos Aníbal");
        System.out.println("Materia:         Programación");
        System.out.println("NRC:             7450");
        System.out.println("Docente:        Ing. Luis Guerra");
        System.out.println("Tema:            Herencia Simple.");
        System.out.println("------------------------------------------------------------------------");
        
        Neumatico_Radial caso1=new Neumatico_Radial();
        Neumatico_Radial caso2=new Neumatico_Radial();
        
        caso1.presion_aire_neumatico = 33;
        caso1.area_neumatico=235;
        
       
        caso2.presion_aire_neumatico= 102;
        caso2.area_neumatico=205;
      
        
        System.out.println("La informacion del 1°Caso es: ");
        caso1.Determinar_Neumatico_Radial();
        caso1.Determinar_caracteristica_vehiculo();
        caso1.Determinar_funcionamiento();
        System.out.println("--------------------------------------------------");
        System.out.println("La informacion del 2°Caso es: ");
        caso2.Determinar_Neumatico_Radial();
        caso2.Determinar_caracteristica_vehiculo();
        caso2.Determinar_funcionamiento();
    }
    
}