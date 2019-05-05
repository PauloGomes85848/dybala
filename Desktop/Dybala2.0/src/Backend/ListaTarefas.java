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
public class ListaTarefas implements Serializable {
    
    private ArrayList<Tarefa> listaTarefas;
    
    public ListaTarefas(){
        this.listaTarefas = new ArrayList<>();
    }

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }
    
    public void registarTarefa(Tarefa t){
        this.listaTarefas.add(t);
    }
    
    public void eliminarTarefa(Tarefa t){
        this.listaTarefas.remove(t);
    }
    
    public int size(){
        return this.listaTarefas.size();
    }
    
    public Tarefa getTarefaByIndex(int i){
       return this.listaTarefas.get(i);
    }
    
    public Tarefa getTarefaByEmail(String email){
        Tarefa task = null;
        for(Tarefa t: listaTarefas){
        }
        return task;
    }
    
}
