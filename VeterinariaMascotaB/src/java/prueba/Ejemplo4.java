/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import DAO.Mascotadao;
import Entidades.Mascota;
import Utilitarios.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
/**
 *
 * @author 
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // buscar por raza
        ArrayList<Mascota> lista = new ArrayList<>();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        //Transaction transaccion = sesion.beginTransaction();
        Mascotadao mascotadao = new Mascotadao();
        lista = mascotadao.listarInfoRaza(sesion, "Pastor aleman");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(
                    lista.get(i).getNombreMascota() + " SU RAZA: "
                    + lista.get(i).getRaza()
            );
        }
    }

}
