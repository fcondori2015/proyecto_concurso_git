/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.dao;

import dominio.Cargo;
import java.util.List;

/**
 *
 * @author SIISAJUJUY
 */
public interface CargoDao {
    public List<Cargo> getAll();
    public Cargo getCargo(int idCargo);
    public void insertar(Cargo cargo);
    public void eliminar(Cargo cargo);
    public void modificar(Cargo cargo);
}
