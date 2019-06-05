/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import DAO.Mascotadao;
import Entidades.Mascota;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import Utilitarios.HibernateUtil;

/**
 *
 * @author Julio Cesar
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Mascota> lista = new ArrayList<>();
        Mascotadao mascotadao = new Mascotadao();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        lista = mascotadao.listarMascotas(sesion);
        for (Mascota mascota : lista) {

            System.out.println(mascota.getNombreMascota());
        }
    }

}
