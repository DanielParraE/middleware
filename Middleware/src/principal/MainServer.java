/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.IOException;
import java.util.Arrays;
import server.Servidor;

public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            
            Servidor serv = new Servidor(); //Se crea el servidor

            System.out.println("Iniciando servidor\n");
            serv.startServer(); //Se inicia el servidor
            
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        
//        Materia mat = new Materia();
//        mat.setCalificacion(10);
//        mat.setNombre("Matematicas");
//        
//        Materia mat1 = new Materia();
//        mat1.setCalificacion(8);
//        mat1.setNombre("Sistemas Operativos");
//        
//        Boleta bol = new Boleta();
//        ArrayList<Materia> mats = new ArrayList<>();
//        mats.add(mat);
//        mats.add(mat1);
//        bol.setMaterias(mats);

    }

}
