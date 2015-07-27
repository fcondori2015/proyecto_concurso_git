/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.dao;

import dominio.Resolucion;
import java.util.List;

/**
 *
 * @author nahuel
 */
public interface ResolucionDao {
    public List<Resolucion> getAll();
    public Resolucion getResolucion(int idResolucion);
    public List<Resolucion> getResoluciones(String numeroExpediente);
    public void insertar(Resolucion resolucion);
    public void eliminar(Resolucion resolucion);
    public void modificar(Resolucion resolucion);
    public Resolucion obtenerUltimaResolucion();
}
