/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import DAO.Mascotadao;
import Entidades.Mascota;
import Utilitarios.HibernateUtil;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author 
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        int cantidad=0;
        Mascotadao mascotadao = new Mascotadao();
        cantidad= mascotadao.CantMascotas(sesion);
        System.out.println("Cantidad de mascotas: "+cantidad);
    }
    
}
