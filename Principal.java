import java.util.Scanner;
import java.net.NetworkInterface;
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
        int ansPrincipal = 0;

        //Variablles - Producos
        boolean outProd = false;
        int ansProd = 0;
        ArrayList<Alimento> listAlimento = new ArrayList<>();

        boolean outCat = false;
        int ansCat = 0;
        ArrayList<Categoria> listCat = new ArrayList<>();

        boolean outSup = false;
        int ansSup = 0;
        ArrayList<Supermercado> listSupermercado = new ArrayList<>();

        //Variables - Factura
        boolean outFac = false;
        int ansFac = 0;

        //Variables - Usuarios y Familia
        boolean outUser = false;
        int ansUser = 0;
        ArrayList<Usuario> listUsuario = new ArrayList<>();

        boolean outFam = false;
        int ansFam = 0;
        ArrayList<Familia> listFamilia = new ArrayList<>();

        boolean outRol = false;
        int ansRol = 0;
        ArrayList<Rol> listRol = new ArrayList<>();

        while(outPrincipal == false){
            System.out.println("================================ Bienvenidos Food4You ================================");
            System.out.println("1....................................................................Gestor Categorias");        
            System.out.println("2.................................................................Gestor Supermercados");
            System.out.println("3.....................................................................Gestor Productos");        
            System.out.println("4......................................................................Gestor Usuarios");                      
            System.out.println("5.........................................................................Gestor Roles");        
            System.out.println("6.......................................................................Gestor Familia");      
            System.out.println("7......................................................................Gestor Facturas");      
            System.out.println("8................................................................................Salir");      
            System.out.println("Por favor, seleccione una opción...");
            ansPrincipal = Integer.parseInt(teclado.nextLine());
            System.out.println("");

            if(ansPrincipal == 1){

                while(outCat == false){
                    System.out.println("-------------------------------GESTOR: Categorias");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");                            
                    System.out.println("3...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");
                    ansCat = Integer.parseInt(teclado.nextLine());
                    System.out.println("");

                    if(ansCat == 1){
                        int ansSubCat = 0;
                        int newId = 0;
                        int id = 0;

                        for(Categoria categoria : listCat){ 
                            System.out.println("======================================= " + newId + " =======================================");                                               
                            System.out.println("Nombre: " + categoria.getNombre() + " | Descripción: " + categoria.getDescripcion() + "");                            
                            System.out.println("==============================================================================");                                               
                            newId++;       
                        }

                        System.out.println("Deseas eliminar o editar? ");
                        System.out.println("1. ELIMINAR   |   2.EDITAR   |   3.NO");
                        ansSubCat = Integer.parseInt(teclado.nextLine());
                        System.out.println("");

                        if(ansSubCat == 1){
                            System.out.println("Ingresa el id: ");
                            id = Integer.parseInt(teclado.nextLine());
                            listCat.remove(id);

                        }else if(ansSubCat == 2){
                            System.out.println("Ingresa el id: ");
                            id = Integer.parseInt(teclado.nextLine());
                            
                            System.out.println("Ingresa el nombre de la categoria: ");
                            listCat.get(id).setNombre(teclado.nextLine());
                            System.out.println("Ingresa una breve descripción: ");
                            listCat.get(id).setDescripcion(teclado.nextLine());
                        }else{
                            System.out.println("OPCION NO VALIDA...");
                        }


                    }else if(ansCat == 2){                        
                        Categoria newCat = new Categoria();

                        System.out.println("Ingresa el nombre de la categoria: ");
                        newCat.setNombre(teclado.nextLine());
                        System.out.println("Ingresa una breve descripción: ");
                        newCat.setDescripcion(teclado.nextLine());

                        listCat.add(newCat);

                    }else if(ansCat == 3){
                        System.out.println("SALIENDO...");
                        outCat = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal == 2){

                while(outSup == false){
                    System.out.println("-------------------------------GESTOR: Supermercados");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");                            
                    System.out.println("3...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");
                    ansSup = Integer.parseInt(teclado.nextLine());
                    System.out.println("");

                    if(ansSup == 1){

                        int ansSubSupermercado = 0;
                        int newId = 0;
                        int id = 0;

                        for(Supermercado supermercado : listSupermercado){ 
                            System.out.println("======================================= " + newId + " =======================================");                                               
                            System.out.println("Nombre: " + supermercado.getNombre() + " | Descripción: " + supermercado.getDescripción() + " | Nivel: " + supermercado.getNivel());                            
                            System.out.println("==============================================================================");                                               
                            newId++;       
                        }

                        System.out.println("Deseas eliminar o editar? ");
                        System.out.println("1. ELIMINAR   |   2.EDITAR   |   3.NO");
                        ansSubSupermercado = Integer.parseInt(teclado.nextLine());
                        System.out.println("");

                        if(ansSubSupermercado == 1){
                            System.out.println("Ingresa el id: ");
                            id = Integer.parseInt(teclado.nextLine());
                            listSupermercado.remove(id);

                        }else if(ansSubSupermercado == 2){
                            System.out.println("Ingresa el id: ");
                            id = Integer.parseInt(teclado.nextLine());
                            
                            System.out.println("Ingresa el nombre del supermerrcado: ");
                            listSupermercado.get(id).setNombre(teclado.nextLine());
                            System.out.println("Ingresa la descripción del supermercado: ");
                            listSupermercado.get(id).setDescripción(teclado.nextLine());
                            System.out.println("Ingresa el nivel ded supermercado: ");
                            listSupermercado.get(id).setNivel(Integer.parseInt(teclado.nextLine()));
                        }else{
                            System.out.println("OPCION NO VALIDA...");
                        }

                    }else if(ansSup == 2){
                        Supermercado supermercado = new Supermercado();

                        System.out.println("Ingresa el nombre del supermerrcado: ");
                        supermercado.setNombre(teclado.nextLine());
                        System.out.println("Ingresa la descripción del supermercado: ");
                        supermercado.setDescripción(teclado.nextLine());
                        System.out.println("Ingresa el nivel del supermercado: ");
                        supermercado.setNivel(Integer.parseInt(teclado.nextLine()));

                        listSupermercado.add(supermercado);

                    }else if(ansSup == 3){
                        System.out.println("SALIENDO...");
                        outSup = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }


            }else if(ansPrincipal == 3){
                while(outProd == false){
                    System.out.println("-------------------------------GESTOR: PRODUCTOS");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");                                               
                    System.out.println("3...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");
                    ansProd = Integer.parseInt(teclado.nextLine());
                    System.out.println("");

                    if(ansProd == 1){       
                        int id = 0;
                        int ansSubProd = 0;
                        int newId = 0;
                        for(Alimento alimento : listAlimento){ 
                            System.out.println("======================================= " + id + " =======================================");                                               
                            System.out.println("Nombre: " + alimento.getNombre() + " | Nutricion: " + alimento.getValNutricional() + "");                            
                            System.out.println("Cantidad: " + alimento.getCantidad() + " | Supermercado: " + alimento.getSupermercado().getNombre() + " | Categoria: " + alimento.getCategoria().getNombre());                            
                            System.out.println("==============================================================================");                                               
                            id++;       
                        }

                        
                        System.out.println("Deseas eliminar o editar? ");
                        System.out.println("1. ELIMINAR   |   2.EDITAR   |   3.NO");
                        ansSubProd = Integer.parseInt(teclado.nextLine());
                        System.out.println("");

                        if(ansSubProd == 1){
                            System.out.println("Ingresa el id: ");
                            id = Integer.parseInt(teclado.nextLine());
                            listAlimento.remove(id);

                        }else if(ansSubProd == 2){
                            int idCat = 0;
                            int idCatSelect = 00;                    
                            int idSup = 0;
                            int idSupSelect = 0;

                            System.out.println("Ingresa el id: ");
                            id = Integer.parseInt(teclado.nextLine());
                            System.out.println("");

                            //Manejo de categorias
                            System.out.println("Ingresa el ID de la categoria a elegir: ");
                            for(Categoria categoria : listCat){ 
                                System.out.println("======================================= " + idCat + " =======================================");                                               
                                System.out.println("Nombre: " + categoria.getNombre() + " | Descripción: " + categoria.getDescripcion() + "");                            
                                System.out.println("==============================================================================");                                               
                                idCat++;       
                            }

                            idCatSelect = Integer.parseInt(teclado.nextLine());
                            listAlimento.get(id).setCategoria(listCat.get(idCatSelect));

                            //Manejo de Supermercados
                            for(Supermercado supermercado : listSupermercado){ 
                                System.out.println("======================================= " + idSup + " =======================================");                                               
                                System.out.println("Nombre: " + supermercado.getNombre() + " | Descripción: " + supermercado.getDescripción() + " | Nivel: " + supermercado.getNivel());                            
                                System.out.println("==============================================================================");                                               
                                idSup++;       
                            }

                            idSupSelect = Integer.parseInt(teclado.nextLine());
                            listAlimento.get(id).setSupermercado(listSupermercado.get(idSupSelect));

                            //Información extra
                            System.out.println("Ingresa el nombre del Alimento: ");
                            listAlimento.get(id).setNombre(teclado.nextLine());

                            System.out.println("Ingresa el valor nutricional del alimento: ");
                            listAlimento.get(id).setValNutricional(teclado.nextLine());

                            System.out.println("Ingresa el stock actual del alimento");
                            listAlimento.get(id).setCantidad(Integer.parseInt(teclado.nextLine()));
                            
                        }else{
                            System.out.println("OPCION NO VALIDA...");
                        }

                    }else if(ansProd == 2){
                        Alimento newAlimento = new Alimento();
                        int idCat = 0;
                        int idCatSelect = 00;                    
                        int idSup = 0;
                        int idSupSelect = 0;

                        //Manejo de categorias
                        System.out.println("Ingresa el ID de la categoria a elegir: ");
                        for(Categoria categoria : listCat){ 
                            System.out.println("======================================= " + idCat + " =======================================");                                               
                            System.out.println("Nombre: " + categoria.getNombre() + " | Descripción: " + categoria.getDescripcion() + "");                            
                            System.out.println("==============================================================================");                                               
                            idCat++;       
                        }

                        idCatSelect = Integer.parseInt(teclado.nextLine());
                        newAlimento.setCategoria(listCat.get(idCatSelect));

                        //Manejo de Supermercados
                        for(Supermercado supermercado : listSupermercado){ 
                            System.out.println("======================================= " + idSup + " =======================================");                                               
                            System.out.println("Nombre: " + supermercado.getNombre() + " | Descripción: " + supermercado.getDescripción() + " | Nivel: " + supermercado.getNivel());                            
                            System.out.println("==============================================================================");                                               
                            idSup++;       
                        }

                        idSupSelect = Integer.parseInt(teclado.nextLine());
                        newAlimento.setSupermercado(listSupermercado.get(idSupSelect));

                        //Información extra
                        System.out.println("Ingresa el nombrre del Alimento: ");
                        newAlimento.setNombre(teclado.nextLine());

                        System.out.println("Ingresa el valor nutricional del alimento: ");
                        newAlimento.setValNutricional(teclado.nextLine());

                        System.out.println("Ingresa el stock actual del alimento");
                        newAlimento.setCantidad(Integer.parseInt(teclado.nextLine()));

                        listAlimento.add(newAlimento);

                    }else if(ansProd == 3){
                        System.out.println("SALIENDO...");
                        outProd = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal == 4){
                while(outUser == false){
                    System.out.println("-------------------------------GESTOR: Usuarios");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");                                                   
                    System.out.println("3...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");
                    ansUser = Integer.parseInt(teclado.nextLine());
                    System.out.println("");

                    if(ansUser == 1){
                        int id = 0;
                        int newId = 0;
                        int ansSubUsuario = 0;

                        for(Usuario usuario : listUsuario){ 
                            System.out.println("================================== " + id  + "   |   " +  usuario.getUsername() + " ==================================");                                               
                            System.out.println("Nombre: " + usuario.getName() + " | Telefono: " + usuario.getTelefono() + " | Rol: " + usuario.getRol().getNombre());                           
                            System.out.println("==============================================================================");                                               
                            id++;       
                        }

                        System.out.println("Deseas eliminar o editar? ");
                        System.out.println("1. ELIMINAR   |   2.EDITAR   |   3.NO");
                        ansSubUsuario = Integer.parseInt(teclado.nextLine());
                        System.out.println("");

                        if(ansSubUsuario == 1){
                            System.out.println("Ingresa el id: ");
                            newId = Integer.parseInt(teclado.nextLine());
                            listUsuario.remove(newId);

                        }else if(ansSubUsuario == 2){
                            System.out.println("Ingresa el id: ");
                            newId = Integer.parseInt(teclado.nextLine());

                            System.out.println("Ingresa el nombre");
                            listUsuario.get(newId).setName(teclado.nextLine());
                            System.out.println("Ingresa el username");
                            listUsuario.get(newId).setUsername(teclado.nextLine());
                            System.out.println("Ingresa la contraseña");
                            listUsuario.get(newId).setPassword(teclado.nextLine());
                            System.out.println("Ingresa el telefono");
                            listUsuario.get(newId).setTelefono(teclado.nextLine());
    
                            System.out.println("Selecciona un rol");
                            int idRol = 0;
                            int idSelect = 0;
                            for(Rol rol : listRol){ 
                                System.out.println("======================================= " + idRol + " =======================================");                                               
                                System.out.println("Nombre: " + rol.getNombre() + " | Descripción: " + rol.getDescripcion());                           
                                System.out.println("==============================================================================");                                               
                                idRol++;       
                            }
                            idSelect = Integer.parseInt(teclado.nextLine());
                            listUsuario.get(newId).setRol(listRol.get(idSelect));
                        }else{
                            System.out.println("OPCION NO VALIDA...");
                        }

                    }else if(ansUser == 2){

                        Usuario newUsuario = new Usuario();

                        System.out.println("Ingresa el nombre");
                        newUsuario.setName(teclado.nextLine());
                        System.out.println("Ingresa el username");
                        newUsuario.setUsername(teclado.nextLine());
                        System.out.println("Ingresa la contraseña");
                        newUsuario.setPassword(teclado.nextLine());
                        System.out.println("Ingresa el telefono");
                        newUsuario.setTelefono(teclado.nextLine());

                        System.out.println("Selecciona un rol");
                        int id = 0;
                        int idSelect = 0;
                        for(Rol rol : listRol){ 
                            System.out.println("======================================= " + id + " =======================================");                                               
                            System.out.println("Nombre: " + rol.getNombre() + " | Descripción: " + rol.getDescripcion());                           
                            System.out.println("==============================================================================");                                               
                            id++;       
                        }
                        idSelect = Integer.parseInt(teclado.nextLine());
                        newUsuario.setRol(listRol.get(idSelect));

                        listUsuario.add(newUsuario);

                    }else if(ansUser == 3){
                        System.out.println("SALIENDO...");
                        outUser = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal == 5){
                while(outRol == false){
                    System.out.println("-------------------------------GESTOR: Roles");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");                                                   
                    System.out.println("3...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");
                    ansRol = Integer.parseInt(teclado.nextLine());
                    System.out.println("");

                    if(ansRol == 1){
                        int newId = 0;
                        int id = 0;
                        int ansSubRol = 0;

                        for(Rol rol : listRol){ 
                            System.out.println("======================================= " + id + " =======================================");                                               
                            System.out.println("Nombre: " + rol.getNombre() + " | Descripción: " + rol.getDescripcion());                           
                            System.out.println("==============================================================================");                                               
                            id++;       
                        }

                        System.out.println("Deseas eliminar o editar? ");
                        System.out.println("1. ELIMINAR   |   2.EDITAR   |   3.NO");
                        ansSubRol = Integer.parseInt(teclado.nextLine());
                        System.out.println("");

                        if(ansSubRol == 1){
                            System.out.println("Ingresa el id: ");
                            newId = Integer.parseInt(teclado.nextLine());
                            listRol.remove(newId);

                        }else if(ansSubRol == 2){
                            System.out.println("Ingresa el id: ");
                            newId = Integer.parseInt(teclado.nextLine());

                            System.out.println("Ingrese el nombre: ");
                            listRol.get(newId).setNombre(teclado.nextLine());
                            System.out.println("Ingrese una breve descripción");
                            listRol.get(newId).setDescripcion(teclado.nextLine());
                        }else{
                            System.out.println("OPCION NO VALIDA...");
                        }

                    }else if(ansRol == 2){

                        Rol newRol = new Rol();

                        System.out.println("Ingrese el nombre: ");
                        newRol.setNombre(teclado.nextLine());
                        System.out.println("Ingrese una breve descripción");
                        newRol.setDescripcion(teclado.nextLine());

                        listRol.add(newRol);

                    }else if(ansRol == 3){
                        System.out.println("SALIENDO...");
                        outRol = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal == 6){
                while(outFam == false){
                    System.out.println("-------------------------------GESTOR: Familia");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");                            
                    System.out.println("3...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");
                    ansFam = Integer.parseInt(teclado.nextLine());
                    System.out.println("");

                    if(ansFam == 1){
                        int newId = 0;
                        int id = 0;
                        int ansSubFam = 0;

                        for(Familia familia : listFamilia){ 
                            System.out.println("======================================= " + id + " =======================================");                                               
                            System.out.println("Apellido: " + familia.getApellido() + " | Pobreza: " + familia.getSituacionPobreza());                           
                            System.out.println("Niños: " + familia.getCantNiños() + " | Adultos: " + familia.getCantAdultos() + " | Total: " + familia.getTotalMiembros());                           
                            System.out.println("==============================================================================");                                               
                            id++;       
                        }

                        System.out.println("Deseas eliminar o editar? ");
                        System.out.println("1. ELIMINAR   |   2.EDITAR   |   3.NO");
                        ansSubFam = Integer.parseInt(teclado.nextLine());
                        System.out.println("");

                        if(ansSubFam == 1){
                            System.out.println("Ingresa el id: ");
                            newId = Integer.parseInt(teclado.nextLine());
                            listFamilia.remove(newId);

                        }else if(ansSubFam == 2){
                            System.out.println("Ingresa el id: ");
                            newId = Integer.parseInt(teclado.nextLine());

                            System.out.println("Ingresa el apellido: ");       
                            listFamilia.get(newId).setApellido(teclado.nextLine());                 
                            System.out.println("Ingresa el total de niños: ");
                            listFamilia.get(newId).setCantNiños(Integer.parseInt(teclado.nextLine()));
                            System.out.println("Ingresa el total de adultos: ");
                            listFamilia.get(newId).setCantAdultos(Integer.parseInt(teclado.nextLine()));
                            listFamilia.get(newId).setTotalMiembros(listFamilia.get(newId).getCantAdultos() + listFamilia.get(newId).getCantNiños());
                            System.out.println("Ingresa la situación de pobreza: ");
                            listFamilia.get(newId).setSituacionPobreza(Integer.parseInt(teclado.nextLine()));
                        }else{
                            System.out.println("OPCION NO VALIDA...");
                        }

                    }else if(ansFam == 2){
                        Familia newFamilia = new Familia();

                        System.out.println("Ingresa el apellido: ");       
                        newFamilia.setApellido(teclado.nextLine());                 
                        System.out.println("Ingresa el total de niños: ");
                        newFamilia.setCantNiños(Integer.parseInt(teclado.nextLine()));
                        System.out.println("Ingresa el total de adultos: ");
                        newFamilia.setCantAdultos(Integer.parseInt(teclado.nextLine()));
                        newFamilia.setTotalMiembros(newFamilia.getCantAdultos() + newFamilia.getCantNiños());
                        System.out.println("Ingresa la situación de pobreza: ");
                        newFamilia.setSituacionPobreza(Integer.parseInt(teclado.nextLine()));

                        listFamilia.add(newFamilia);

                    }else if(ansFam == 3){
                        System.out.println("SALIENDO...");
                        outFam = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal == 7){

                while(outFac == false){
                    System.out.println("-------------------------------GESTOR: Facturas");
                    System.out.println("1.............................................VER");        
                    System.out.println("2.........................................AGREGAR");                                              
                    System.out.println("3...........................................Salir");      
                    System.out.println("Por favor, seleccione una opción...");

                    if(ansFac == 1){
                        //Factura
                    }else if(ansFac == 2){
                        //Factura
                    }else if(ansFac == 3){
                        //Factura
                    }else if(ansFac == 4){
                        //Factura
                    }else if(ansFac == 5){
                        System.out.println("SALIENDO...");
                        outFac = true;
                    }else{
                        System.out.println("Opción no valida, intetalo nuevamente.");
                    }
                }

            }else if(ansPrincipal == 8){
                System.out.println("SALIENDO...");
                outPrincipal = true;
            }else{
                System.out.println("Opción no valida, intetalo nuevamente.");
            }
        }
    }
}
