/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author bidas
 */
public class ListaProjetos implements Serializable {

    private ArrayList<Projeto> listaProjetos;

    public ArrayList<Projeto> getArrayListaProjetos() {
        return listaProjetos;
    }

    public void setListaProjetos(ArrayList<Projeto> listaProjetos) {
        this.listaProjetos = listaProjetos;
    }

    public ListaProjetos() {
        this.listaProjetos = new ArrayList<>();

    }

    public Projeto getListaProjetos(int y) {
        for (int i = 0; i < listaProjetos.size(); i++) {

            return listaProjetos.get(i);
        }
        return null;
    }

    public void registarProjeto(Projeto p) {
        this.listaProjetos.add(p);
    }
    
}
