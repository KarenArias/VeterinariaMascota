/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author 
 */
public interface IMascota {
    public abstract void guardarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listarMascotas(Session sesion);
    public abstract void actualizMascotas(Mascota mascota);
    public abstract ArrayList<Mascota> listarInfoRaza(Session sesion, String raza);
    public abstract List<Mascota>listarInfoNom(Session session, String nombreMascota);
    public abstract Integer CantMascotas(Session session);
}
