/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Mascota;
import Interfaces.IMascota;
import Utilitarios.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 
 */
public class Mascotadao implements IMascota {

    @Override
    public void guardarMascota(Mascota mascota) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.save(mascota);
        transaccion.commit();
        sesion.close();
    }
    @Override
    public ArrayList<Mascota> listarMascotas(Session sesion) {
        ArrayList<Mascota> milista = new ArrayList<>();
        Query query = sesion.createQuery("FROM Mascota");
        milista = (ArrayList<Mascota>) query.list();

        return milista;
    }
    @Override
    public void actualizMascotas(Mascota mascota) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.update(mascota);

    }
    @Override
    public ArrayList<Mascota> listarInfoRaza(Session sesion, String raza) {
        String hql = " from Mascota where raza ='Pastor aleman'";
        Query query = sesion.createQuery(hql);
        List<Mascota> lista = (List< Mascota>) query.list();
        return (ArrayList<Mascota>) lista;
    }

    @Override
    public List<Mascota> listarInfoNom(Session session, String nombreMascota) {
        String hql = " from Mascota where nombreMascota='Sandor'";
        Query query = session.createQuery(hql);
        List<Mascota> lista = (List< Mascota>) query.list();
        return lista;
    }

    @Override
    public Integer CantMascotas(Session session) {
        String hql = "select count(*) from  Mascota";
        Query query = session.createQuery(hql);
        Long FilasTab = (Long) query.uniqueResult();
        Integer cont = FilasTab.intValue();
        return cont;
    }

   
}
