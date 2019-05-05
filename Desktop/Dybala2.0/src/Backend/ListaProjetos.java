/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author bidas
 */
public class ListaProjetos implements Serializable {

    private ArrayList<Projeto> listaProjetos;

    public ListaProjetos() {
        this.listaProjetos = new ArrayList<>();
    }

    public ArrayList<Projeto> getListaProjetos() {
        return listaProjetos;
    }

    public void setListaProjetos(ArrayList<Projeto> listaProjetos) {
        this.listaProjetos = listaProjetos;
    }

    public Projeto getListaProjetos(int i) {
        return this.listaProjetos.get(i);
    }

    public void registarProjeto(Projeto p) {
        this.listaProjetos.add(p);
    }

    public void eliminarProjeto(Projeto p) {
        this.listaProjetos.remove(p);
    }
}
