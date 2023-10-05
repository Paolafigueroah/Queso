/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.queso.negocio;

import java.util.HashMap;
import java.util.Map;

/**
 *  Contiene métodos y operaciones para generar la CURP.
 * @author Claudia Figueroa, Danett Arana. Arleth Bejarano.
 */
public class Operacion {
   /**
     * Convierte la información personal proporcionada en una concatenación y los organiza para formar la CURP
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param dia
     * @param mes
     * @param año
     * @param estado
     * @param sexo
     * @return Los datos de la persona concatenados formando el CURP
     */ 
    private static final Map<String, String> estadosMap = new HashMap<>();

    static {
        
        estadosMap.put("AGUASCALIENTES", "AS");
        estadosMap.put("BAJA CALIFORNIA", "BC");
        estadosMap.put("BAJA CALIFORNIA SUR", "BS");
        estadosMap.put("CAMPECHE", "CC");
        estadosMap.put("COAHUILA", "CL");
        estadosMap.put("COLIMA", "CM");
        estadosMap.put("CHIAPAS", "CS");
        estadosMap.put("CHIHUAHUA", "CH");
        estadosMap.put("DISTRITO FEDERAL", "DF");
        estadosMap.put("DURANGO", "DG");
        estadosMap.put("GUANAJUATO", "GT");
        estadosMap.put("GUERRERO", "GR");
        estadosMap.put("HIDALGO", "HG");
        estadosMap.put("JALISCO", "JC");
        estadosMap.put("ESTADO DE MEXICO", "MC");
        estadosMap.put("MICHOACÁN", "MN");
        estadosMap.put("MORELOS", "MS");
        estadosMap.put("NAYARIT", "NT");
        estadosMap.put("NUEVO LEÓN", "NL");
        estadosMap.put("OAXACA", "OC");
        estadosMap.put("PUEBLA", "PL");
        estadosMap.put("QUERÉTARO", "QT");
        estadosMap.put("QUINTANA ROO", "QR");
        estadosMap.put("SAN LUIS POTOSÍ", "SP");
        estadosMap.put("SINALOA", "SL");
        estadosMap.put("SONORA", "SR");
        estadosMap.put("TABASCO", "TC");
        estadosMap.put("TAMAULIPAS", "TS");
        estadosMap.put("TLAXCALA", "TL");
        estadosMap.put("VERACRUZ", "VZ");
        estadosMap.put("YUCATÁN", "YN");
        estadosMap.put("ZACATECAS", "ZS");
        estadosMap.put("NACIDO EXTRANJERO", "NE");
    }
        
        
    public String generarCurp (String nombre, String apellidoPaterno, String apellidoMaterno, String dia, String mes, String año, String estado, String sexo){
        
        char[] letrasApellidoP = apellidoPaterno.toCharArray();
        char[] letrasApellidoM = apellidoMaterno.toCharArray();
        char[] letrasNombre = nombre.toCharArray();
        char primerLetraP = letrasApellidoP[0];
        char primerLetraM = letrasApellidoM[0];
        String vacioM = String.valueOf(primerLetraM);
        
        int añoNacimiento = Integer.parseInt(año);
        String penultimoCaracter = "";
        if(añoNacimiento>=2000){
            penultimoCaracter = "A";
        }else{
            penultimoCaracter = "0";
        }
        //Se busca la primera vocal del primer apellido
        char caracter2 = '0';
         for(int i = 1 ;letrasApellidoP.length>=0;i++){
         if(letrasApellidoP[i] == 'A'|| letrasApellidoP[i] == 'E' || letrasApellidoP[i] == 'U' || letrasApellidoP[i] == 'O' || letrasApellidoP[i] == 'I' ){
          caracter2 = letrasApellidoP[i];
          break;
         
         }}
         //Se busca la primera consonante del primer apellido
         char consonanteApellidoP = '0';
         for(int j = 1 ;letrasApellidoP.length>=0;j++){
         if(letrasApellidoP[j] == 'B'|| letrasApellidoP[j] == 'C' || letrasApellidoP[j] == 'D' || letrasApellidoP[j] == 'F' || letrasApellidoP[j] == 'G' 
            || letrasApellidoP[j] == 'H'|| letrasApellidoP[j] == 'J' || letrasApellidoP[j] == 'K' || letrasApellidoP[j] == 'L' || letrasApellidoP[j] == 'M'
                 || letrasApellidoP[j] == 'N'|| letrasApellidoP[j] == 'P' || letrasApellidoP[j] == 'Q' || letrasApellidoP[j] == 'R' || letrasApellidoP[j] == 'S'
                 || letrasApellidoP[j] == 'T'|| letrasApellidoP[j] == 'V' || letrasApellidoP[j] == 'W' || letrasApellidoP[j] == 'X' || letrasApellidoP[j] == 'T' || letrasApellidoP[j] == 'Z'){
          consonanteApellidoP = letrasApellidoP[j];
          break;
         
         }
         }
         //Se busca la primera consonante del segundo apellido
         char consonanteApellidoM = '0';
         for(int k = 1 ;letrasApellidoM.length>=0;k++){
         if(letrasApellidoM[k] == 'B'|| letrasApellidoM[k] == 'C' || letrasApellidoM[k] == 'D' || letrasApellidoM[k] == 'F' || letrasApellidoM[k] == 'G' 
            || letrasApellidoM[k] == 'H'|| letrasApellidoM[k] == 'J' || letrasApellidoM[k] == 'K' || letrasApellidoM[k] == 'L' || letrasApellidoM[k] == 'M'
                 || letrasApellidoM[k] == 'N'|| letrasApellidoM[k] == 'P' || letrasApellidoM[k] == 'Q' || letrasApellidoM[k] == 'R' || letrasApellidoM[k] == 'S'
                 || letrasApellidoM[k] == 'T'|| letrasApellidoM[k] == 'V' || letrasApellidoM[k] == 'W' || letrasApellidoM[k] == 'X' || letrasApellidoM[k] == 'T' || letrasApellidoM[k] == 'Z'){
          consonanteApellidoM = letrasApellidoM[k];
          break;
         
         }
         }

         char consonanteNombre = '0';
         for(int l = 1 ;letrasNombre.length>=0;l++){
         if(letrasNombre[l] == 'B'|| letrasNombre[l] == 'C' || letrasNombre[l] == 'D' || letrasNombre[l] == 'F' || letrasNombre[l] == 'G' 
            || letrasNombre[l] == 'H'|| letrasNombre[l] == 'J' || letrasNombre[l] == 'K' || letrasNombre[l] == 'L' || letrasNombre[l] == 'M'
                 || letrasNombre[l] == 'N'|| letrasNombre[l] == 'P' || letrasNombre[l] == 'Q' || letrasNombre[l] == 'R' || letrasNombre[l] == 'S'
                 || letrasNombre[l] == 'T'|| letrasNombre[l] == 'V' || letrasNombre[l] == 'W' || letrasNombre[l] == 'X' || letrasNombre[l] == 'T' || letrasNombre[l] == 'Z'){
          consonanteNombre = letrasNombre[l];
          break;
         
         }
         }
         //Se convierte los caracteres de tipo char a una cadena de String
        String letra2 = String.valueOf(caracter2);
        String primerConsonanteP = String.valueOf(consonanteApellidoP);
        String primerConsonanteM = String.valueOf(consonanteApellidoM);
        String primerConsonanteN = String.valueOf(consonanteNombre);
       
        nombre = nombre.substring(0,1);
        año = año.substring(2, 4);  
        String fecha = año + mes + dia;

        if (sexo.equals("Hombre")){
            sexo = "H";    
        }else {
            sexo = "M";
        }
        
        if (estadosMap.containsKey(estado)) {
            estado = estadosMap.get(estado);
        } else {
            // Si el estado no se encuentra en el mapa, maneja el caso de error aquí
            throw new IllegalArgumentException("Estado no válido: " + estado);
        }
       
        String curpEntero = primerLetraP + letra2 + primerLetraM + nombre + fecha + sexo + estado + primerConsonanteP + primerConsonanteM + primerConsonanteN + penultimoCaracter + "1";
        return curpEntero;
        }
    
    }