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
import org.hibernate.Transaction;

/**
 *
 * @author 
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Mascota> lista = new LinkedList<>();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        //Transaction transaccion = sesion.beginTransaction();
        Mascotadao mascotadao = new Mascotadao();
       lista= mascotadao.listarInfoNom(sesion,"Sandor");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("codigo:"+lista.get(i).getIdMascota()+" cliente:"+lista.get(i).getNombreCliente()+" mascota:"+ lista.get(i).getNombreMascota()+" raza:"+ lista.get(i).getRaza());
        }
    }
    
}
