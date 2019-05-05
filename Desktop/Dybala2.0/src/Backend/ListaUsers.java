/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.Serializable;
import java.util.ArrayList;
import excetions.DadosEmBranco;
import excetions.DadosNaoEncontrados;

/**
 *
 * @author bidas
 */
public class ListaUsers implements Serializable {

    public ArrayList<User> listaUser;

    public ListaUsers() {
        this.listaUser = new ArrayList<>();
    }

    public int tamanho() {
        return listaUser.size();
    }
     public User getUser(int s){
        return listaUser.get(s);
    }
    public void registarUser(User u) {
        listaUser.add(u);
    }

    public boolean validaUser(String Email) throws DadosNaoEncontrados, DadosEmBranco {
        if (Email.isEmpty()) {
            //throw new DadosEmBranco("Administrador ou Loja não inseridos");
            return false;
        } else {
            for (User a : this.listaUser) {
                if (a.getMail().equals(Email)) {
                    return true;
                }
            }
            //throw new DadosNaoEncontrados("Administrador não existe");
            return false;
        }
    }

    public boolean validaPw(String Pw) throws DadosNaoEncontrados, DadosEmBranco {
        if (Pw.isEmpty()) {
            throw new DadosEmBranco("Password não inserida.");
        } else {
            for (User a : this.listaUser) {
                if (a.getPassword().equals(Pw)) {
                    return true;
                }
            }
            throw new DadosNaoEncontrados("Password inválida!");
        }
    }

    public User getUser(String Email) throws DadosNaoEncontrados {
        for (User u : this.listaUser) {
            if (u.getMail().equals(Email)) {
                return u;
            }
        }
        throw new DadosNaoEncontrados();
    }

    public boolean passAdmin(String pw) {
        for (User u : listaUser) {
            if (u.getPassword().equals(pw)) {
                return true;
            }
        }
        return false;
    }

}
