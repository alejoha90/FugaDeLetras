/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

import vista.VentanaJuego1;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Jugador {

    public Jugador() {
        
    }
    
    String nombre="";
    
    public void obtenerNombre(){
        nombre=VentanaJuego1.txtNombre.getText();  //captura en nombre el valor de la cajca de texto en la VentanaJuego1
    }
    
    public void imprimirDato(){
        JOptionPane.showMessageDialog(null, "El nombre es: "+nombre, "Mensaje", JOptionPane.PLAIN_MESSAGE);
        //crea ventana de confirmacion de nombre
    }
}

