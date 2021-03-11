
package logicaprogramacionjuegointefaz;

import java.util.Scanner;

public class LogicaProgramacionJuegoIntefaz {

    public static void main(String[] args) {
       
         Scanner entrada = new Scanner(System.in);
        //cantidad de vidas
        int vidas = 5;
        String palabraInicial = "angelo patrick";
        int tm = palabraInicial.length() * 2;
        char[] palabraSinGuiones = new char[tm];
        char[] palabraConGuiones = new char[tm];
        int j = 0;
        for (int i = 0; i < tm; i++) {
            if(i % 2 == 0){
                palabraSinGuiones[i] = palabraInicial.charAt(j);
                j++;
            }else{
                palabraSinGuiones[i] = ' ';
            }
        }
        System.out.println(palabraSinGuiones);
        for (int i = 0; i < tm; i++) {
            if(palabraSinGuiones[i] != ' '){
                palabraConGuiones[i] = '_';
            }else{
                palabraConGuiones[i] = ' ';
            }
        }
        System.out.println(palabraConGuiones);
        
        boolean encontrar;
        boolean juegoTerminado;
        do{
        System.out.println("Ingrese una letra: ");
        char letra = entrada.next().charAt(0);
        encontrar = false;
        juegoTerminado = false;
        for (int i = 0; i < tm; i++) {
            if(letra == palabraSinGuiones[i]){
                palabraConGuiones[i] = letra;
                encontrar = true;
            }
        }
        if(encontrar){
            System.out.println("Muy bien, letra correcta");
            System.out.println(palabraConGuiones);
            if(String.valueOf(palabraConGuiones).equals(String.valueOf(palabraSinGuiones))){
                System.out.println("Muy bien, completaste la palabra correctamente");
                juegoTerminado = true;
            }
        }else{
            vidas--;
            System.out.println("Cantidad de vidas: "+vidas);
            System.out.println("Letra incorrecta");
            if(vidas == 0){
                System.out.println("Lo siento la palabra era: "+palabraInicial);
                juegoTerminado = true;
            }
        }
        }while(!juegoTerminado);
        //EN EL SIGUIENTE VIDEO VEREMOS LA INTERFAZ GRAFICA DEL JUEGO, HASTA LUEGO
        //HOLA A TODOS NUEVAMENTE :D
    }
    
}
