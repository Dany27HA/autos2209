/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import poo.conceptos.basicos.Automovil;
import java.awt.Color;
/**
 *
 * @author danny
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo Java !!!!");
        Persona per1 = new Persona();
        per1.setNombre( "Daniel HA" );
        System.out.println("Nombre per 1:" + per1.getNombre() );
        per1.comer("Tacos!!!");
        
        Persona per2 = new Persona();
        per2.setNombre("Janet");
        per2.comer("Pizza hawaina");
        System.out.println("Nombre per 2:" + per2.getNombre());
        
        Automovil bocho=new Automovil();
        bocho.setMarca("VW");
        System.out.println ("Automovil 1 marca:" + bocho.getMarca() );
        bocho.setSubaMarca("Sedan");
        System.out.println ("Automovil 1 SubMarca:" + bocho.getSubMarca() );
        bocho.setModelo(1970);
        System.out.println ("Automovil 1 Modelo:" + bocho.getModelo() );
        bocho.setColor(Color.BLUE);
        System.out.println ("Automovil 1 Color:" + bocho.getColor() );
        
        Automovil mustang=new Automovil();
        mustang.setMarca("Ford");
        System.out.println ("Automovil 2 marca:" + mustang.getMarca() );
        mustang.setSubaMarca("Mustan");
        System.out.println ("Automovil 2 SubMarca:" + mustang.getSubMarca() );
        mustang.setModelo(2010);
        System.out.println ("Automovil 2 Modelo:" + mustang.getModelo() );
        mustang.setColor(Color.YELLOW);
        System.out.println ("Automovil 2 Color:" + mustang.getColor() );
        
        Automovil akura=new Automovil();
        akura.setMarca("Akura");
        System.out.println ("Automovil 3 marca:" + akura.getMarca() );
        akura.setSubaMarca("NSX");
        System.out.println ("Automovil 3 SubMarca:" + akura.getSubMarca() );
        akura.setModelo(2013);
        System.out.println ("Automovil 3 Modelo:" + akura.getModelo() );
        akura.setColor(Color.GRAY);
        System.out.println ("Automovil 3 Color:" + akura.getColor() );
        
    }
    
    
}
