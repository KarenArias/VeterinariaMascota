/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import DAO.Mascotadao;
import Entidades.Mascota;
import Utilitarios.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author 
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Mascotadao mascotadao = new Mascotadao();
        Mascota mimascota = new Mascota(003, "Bartolo", "Karen", "Pug");
        mascotadao.actualizMascotas(mimascota);
        session.beginTransaction();
        session.saveOrUpdate(mimascota);
        session.getTransaction().commit();
        session.close();

    }
}
