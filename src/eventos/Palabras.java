/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

import javax.swing.JLabel;
import vista.VentanaJuego2;

/**
 *
 * @author Alejandro
 */
public class Palabras {
    public static String [][] arregloColor;
    public static String [][] arregloAnimal;
    public static String [][] arregloFruta;
    
    

    public Palabras() {
       arregloColor = new String[][] {
            {"AZUL", "AZ_L"}, 
            {"VERDE", "V_RDE"}, 
            {"ROJO", "R_JO"}, 
            {"AMARILLO", "AM_RILLO"}, 
            {"MORADO", "MOR_DO"}, 
            {"NEGRO", "N_GRO"}, 
            {"BLANCO", "BL_NCO"}, 
            {"GRIS", "GR_S"}, 
            {"ROSADO", "ROS_DO"}, 
            {"NARANJA", "NAR_NJA"}, 
            {"DORADO", "DOR_DO"}
                
        };
       
        
        arregloAnimal = new String[][] {
            {"GATO", "G_TO"}, 
            {"PERRO", "PERR_"}, 
            {"ELEFANTE", "ELEF_NTE"}, 
            {"JIRAFA", "J_RAFA"}, 
            {"LEON", "L_ON"}, 
            {"TIGRE", "T_GRE"}, 
            {"MONO", "M_NO"}, 
            {"CEBRA", "CEBR_"}, 
            {"OSO", "_SO"}, 
            {"VACA", "VAC_"}, 
            {"LORO", "L_RO"}
          
        };
        
        
        
        arregloFruta = new String[][]{
            {"FRESA", "FR_SA"}, 
            {"MANZANA", "M_NZANA"}, 
            {"NARANJA", "NAR_NJA"}, 
            {"SANDIA", "SAND_A"}, 
            {"UVA", "_VA"}, 
            {"KIWI", "KIW_"}, 
            {"MELON", "MEL_N"}, 
            {"BANANO", "BAN_NO"}, 
            {"LIMON", "L_MON"}, 
            {"MANGO", "MANG_"}, 
            {"PAPAYA", "PAPAY_"}
                
        };
        
    }
    
 
    /**
     *
     */
    public static String seleccionColor (){
        int indiceColor = (int) (Math.random()*arregloColor.length);
        String palabraColor = arregloColor[indiceColor] [1];
        return palabraColor;
    }
    
    public static String seleccionAnimal() {
        int indiceAnimal = (int) (Math.random()*arregloAnimal.length);
        String palabraAnimal = arregloAnimal[indiceAnimal] [1];
        return palabraAnimal;
       
    }
    
    public static String seleccionFruta() {
        int indiceFruta = (int) (Math.random()*arregloFruta.length);
        String palabraFruta = arregloFruta[indiceFruta] [1];
        return palabraFruta;
        
    }

}

 