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
 * @author lucasbrito
 */
public class ListaAssociados implements Serializable {

    private ArrayList<User> listaAssociados;

    public ListaAssociados() {
        this.listaAssociados = new ArrayList<>();
    }

    public ArrayList<User> getListaAssociados() {
        return listaAssociados;
    }

    public void setListaAssociados(ArrayList<User> listaAssociados) {
        this.listaAssociados = listaAssociados;
    }

    public void registarAssociado(User u) {
        this.listaAssociados.add(u);
    }

    public void eliminarAssociado(User u) {
        this.listaAssociados.remove(u);
    }

    public int size() {
        return this.listaAssociados.size();
    }

    public User getAssociadoByIndex(int i) {
        return this.listaAssociados.get(i);
    }

    public User getAssociadoByEmail(String email) {
        User u = null;
        for (User user : listaAssociados) {
            if (user.getMail().equals(email)) {
                u = user;
            }
        }
        return u;
    }
}
