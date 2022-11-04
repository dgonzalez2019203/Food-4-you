import java.util.Scanner;
import java.util.ArrayList;

/**
 * Este programa permite realizar post de varios tipos, comentarlos y darles likes.
 * @author: GRUPO No.4 - FOOD 4 YOU
 * @version: 04/11/2022
*/


public class Principal {
    
    public static void main(String[]  args){   
        //Variables - Generales
        Scanner teclado = new Scanner(System.in);            
        boolean outPrincipal = false;
        int ansPrincipal1 = 0;

        //Variablles - Producos
        boolean outProd = false;
        int ansProd = 0;

        boolean outCat = false;
        int ansCat = 0;

        //Variables - Factura
        boolean outFac = false;
        int ansFac = 0;

        //Variables - Usuarios y Familia
        boolean outUser = false;
        int ansUser = 0;
        boolean outFam = false;
        int ansFam = 0;
        boolean outRol = false;
        int ansRol = 0;

        while(outPrincipal == false){
            System.out.println("================================ Bienvenidos Food4You ================================");
            System.out.println("1....................................................................Gestor Categorias");        
            System.out.println("2.....................................................................Gestor Productos");        
            System.out.println("3......................................................................Gestor Usuarios");                      
            System.out.println("4.........................................................................Gestor Roles");        
            System.out.println("5.......................................................................Gestor Familia");      
            System.out.println("6......................................................................Gestor Facturas");      
            System.out.println("7................................................................................Salir");      
            System.out.println("Por favor, seleccione una opción... \n");

            if(ansPrincipal1 == 1){

                while(outCat == false){
                    System.out.println("-------------------------------GESTOR: Categorias");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");        
                    System.out.println("3..........................................EDITAR");                      
                    System.out.println("4........................................ELIMINAR");                        
                    System.out.println("5...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");

                    if(ansCat == 1){
                        //SUB-CODIGO Categorias
                    }else if(ansCat == 2){
                        //SUB-CODIGO Categorias
                    }else if(ansCat == 3){
                        //SUB-CODIGO Categorias
                    }else if(ansCat == 4){
                        //SUB-CODIGO Categorias
                    }else if(ansCat == 5){
                        System.out.println("SALIENDO...");
                        outCat = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal1 == 2){

                while(outProd == false){
                    System.out.println("-------------------------------GESTOR: PRODUCTOS");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");        
                    System.out.println("3..........................................EDITAR");                      
                    System.out.println("4........................................ELIMINAR");                        
                    System.out.println("5...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");

                    if(ansProd == 1){
                        //SUB-CODIGO Productos
                    }else if(ansProd == 2){
                        //SUB-CODIGO Productos
                    }else if(ansProd == 3){
                        //SUB-CODIGO Productos
                    }else if(ansProd == 4){
                        //SUB-CODIGO Productos
                    }else if(ansProd == 5){
                        System.out.println("SALIENDO...");
                        outProd = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal1 == 3){
                while(outUser == false){
                    System.out.println("-------------------------------GESTOR: Usuarios");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");        
                    System.out.println("3..........................................EDITAR");                      
                    System.out.println("4........................................ELIMINAR");                        
                    System.out.println("5...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");

                    if(ansUser == 1){
                        //Codigo sub menu Usuarios
                    }else if(ansUser == 2){
                        //Codigo sub menu Usuarios
                    }else if(ansUser == 3){
                        //Codigo sub menu Usuarios
                    }else if(ansUser == 4){
                        //Codigo sub menu Usuarios
                    }else if(ansUser == 5){
                        System.out.println("SALIENDO...");
                        outUser = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal1 == 4){
                while(outRol == false){
                    System.out.println("-------------------------------GESTOR: Roles");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");        
                    System.out.println("3..........................................EDITAR");                      
                    System.out.println("4........................................ELIMINAR");                        
                    System.out.println("5...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");

                    if(ansRol == 1){
                        //Codigo sub menu Roles
                    }else if(ansRol == 2){
                        //Codigo sub menu Roles
                    }else if(ansRol == 3){
                        //Codigo sub menu Roles
                    }else if(ansRol == 4){
                        //Codigo sub menu Roles
                    }else if(ansRol == 5){
                        System.out.println("SALIENDO...");
                        outRol = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal1 == 5){
                while(outFam == false){
                    System.out.println("-------------------------------GESTOR: Familia");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");        
                    System.out.println("3..........................................EDITAR");                      
                    System.out.println("4........................................ELIMINAR");                        
                    System.out.println("5...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");

                    if(ansFam == 1){
                        //Familia
                    }else if(ansFam == 2){
                        //Familia
                    }else if(ansFam == 3){
                        //Familia
                    }else if(ansFam == 4){
                        //Familia
                    }else if(ansFam == 5){
                        System.out.println("SALIENDO...");
                        outFam = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal1 == 6){

                while(outFac == false){
                    System.out.println("-------------------------------GESTOR: Facturas");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");        
                    System.out.println("3..........................................EDITAR");                      
                    System.out.println("4........................................ELIMINAR");                        
                    System.out.println("5...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");

                    if(ansFac == 1){
                        //Familia
                    }else if(ansFac == 2){
                        //Familia
                    }else if(ansFac == 3){
                        //Familia
                    }else if(ansFac == 4){
                        //Familia
                    }else if(ansFac == 5){
                        System.out.println("SALIENDO...");
                        outFac = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal1 == 7){
                System.out.println("SALIENDO...");
                outPrincipal = true;
            }else{
                System.out.println("Opción no valida, intetalo nuevamente.");
            }
        }
    }
}
