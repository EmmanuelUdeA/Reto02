package reto02;
import java.util.Scanner;

/**
 *
 * @author emmanuel bustamante
 * Santiago Graciano 
 * Tecnicas y laboratorio UdeA
 */
public class Reto02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        int opcion;
        String tecla="";
       
        do{
           
            System.out.println("1. punto1. ");
            System.out.println("2. Punto2. ");
            System.out.println("3. Punto3. ");
            System.out.println("4. Salir. ");
       
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingrese la opcion del menu que desea acceder: ");
               
            opcion = teclado.nextInt();
            switch (opcion){
            case 1:  
                puntoUno();
                break;
            case 2:    
                puntoDos();      
                break;
            case 3:  
               puntoTres();
                break;            
            case 4:  
                System.out.println ("Salir del programa");
                break;
                     
            default:
                System.out.println("Ingrese un numero valido entre 1 y 4");
                break;
            }
            System.out.println("");
            System.out.println("Escoja una nueva opcion o pulse 4 para salir del menu: ");
            tecla = teclado.nextLine();
        } while(opcion!=4);
     
         {// instrucción switch con tipo de datos int
       
        System.out.println("Fin del menu ");
    }}
        // TODO code application logic here
   
    static void puntoUno(){
        Scanner teclado = new Scanner(System.in);
            int numero, suma, potencia;
            String cadena;
            System.out.print("Ingrese el número a potenciar al cuadrado: ");
                numero = teclado.nextInt();
                    if(numero >= 1){
                       for(int n=1; n<=numero; n++){
                        potencia = 0;
                        cadena = n + "^2 = ";
                            for(int i=1;i<=n;i++){
                                suma = (2*i)-1;
                                potencia = potencia + suma;//1+3+5
                                    cadena = cadena + suma + " + ";
                                        }
                        cadena = cadena.substring(0,cadena.length()- 3);
                            System.out.println(cadena + " = " + potencia);
                            }
                                }   else{
                                        System.out.println("Ingrese un numero correcto");
                                        }
       
    }

    //2. Escriba un programa que, en primer lugar, pida un número entero N, y luego, muestre en
//pantalla los primeros N números primos para, finalmente, mostrar la suma de estos
    static void puntoDos(){
    Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero de primos que quiere sumar: ");
        int n = teclado.nextInt();
        int suma = 0;
       if(n>=1) {
        for(int i = 1; i<= n; i++ ){
            int esPrimo = 0;
           
            for(int j = i; j >= 1; j--){
                if(i % j == 0){
                    esPrimo++;
                }
            }
           
            if(esPrimo == 2){
              System.out.println("es primo: " + i + " ");
              suma = suma + i;
            }
           
        }
       
        System.out.println("La suma es: " +suma);
    }
    else{
        System.out.println("Ingrese un valor numerico positivo");
                }  
}
    static void puntoTres(){
System.out.println("Ingrese el numero de platos delanteros");
        Scanner scanner = new Scanner(System.in);
        double platosDelanteros = scanner.nextInt();
        double dientesPlato1;
        double dientesPlato2 = 0;
        double [] dientesPinonTrasero;
        dientesPinonTrasero = new double[12];
       
       while(platosDelanteros > 2){
           System.out.println("Ingrese un numero correcto ");
           System.out.println("Solo se pueden ingresar valores de 1 y 2 ");
           System.out.println("Ingrese el numero de platos delanteros");
           platosDelanteros = scanner.nextInt();
       } 
       
        if((platosDelanteros == 2 )){
            System.out.println("Ingrese el numero de dientes del plato 1");
            dientesPlato1 = scanner.nextInt();
            System.out.println("Ingrese el numero de dientes del plato 2");
            dientesPlato2 = scanner.nextInt();
        }else{
            System.out.println("ingrese el numero de dientes del plato");
            dientesPlato1 = scanner.nextInt();
        } 
        int contadorPinones = 1 ;
        while(contadorPinones <= 12){
           System.out.println("Ingrese el numero de dientes del piños " + contadorPinones);
           int dientes = scanner.nextInt();
           
           if(dientes > 0){
               dientesPinonTrasero[contadorPinones-1] = dientes;
               contadorPinones++;
           }else {
               System.out.println("El numero de dientes debe ser mayor a cero");
           }
      }
      
        System.out.println("Seleccione las dimensiones de su llanta");
        System.out.println("1: 29x2.1");
        System.out.println("2. 29x2.2");
        System.out.println("3. 29x2.3");
        int opcionLlanta = scanner.nextInt();
       
        double circunferencia = 0;
       while(opcionLlanta > 3){
           System.out.println("Ingrese un valor correcto ");
           System.out.println("Ingrese una de las 3 opciones: ");
           System.out.println("Seleccione las dimensiones de su llanta");
            System.out.println("1: 29x2.1");
            System.out.println("2. 29x2.2");
            System.out.println("3. 29x2.3");
               opcionLlanta = scanner.nextInt(); }
        switch(opcionLlanta){
            case 1:
                circunferencia = 2288;
                break;
            case 2:
                circunferencia = 2298;
                break;
            case 3:
                circunferencia = 2326;
                break;
        }
       
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= 12; j++){
               
                if(i == 1){
                    double formula = ((dientesPlato1 / dientesPinonTrasero[j-1] ) * circunferencia) / 1000;
                    System.out.println( "Plato "+ i + " piñon " + j + ": " + formula + "M");
                }else{
                    double formula = ((dientesPlato2 / dientesPinonTrasero[j-1] ) * circunferencia) /1000;
                    System.out.println("Plato "+ i + " piñon " + j + ": " + formula + "M");
                }
            }
        }
       
    }
   
}


