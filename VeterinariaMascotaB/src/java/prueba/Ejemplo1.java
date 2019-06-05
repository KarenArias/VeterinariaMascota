/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import DAO.Mascotadao;
import Entidades.Mascota;

/**
 *
 * @author 
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        Mascotadao mascotadao = new Mascotadao();
        Mascota mimascota = new Mascota(005,"Loqui","karen","Bull Terrier");

        mascotadao.guardarMascota(mimascota);
    }
}
