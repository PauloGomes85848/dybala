/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.FileInputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import excetions.DadosEmBranco;
import excetions.DadosInvalidos;
import excetions.DadosNaoEncontrados;
import java.util.ArrayList;

/**
 *
 * @author bidas
 */
public class Sistema implements Serializable {

    public static final String NOME = "Sistema.bin";

    private ListaUsers listaUser;
    private ListaProjetos listaProjetos;

    public Sistema() {
        this.listaProjetos = new ListaProjetos();
        this.listaUser = new ListaUsers();
    }

    public ListaUsers getListaUser() {
        return listaUser;
    }

    public void setListaUser(ListaUsers listaUser) {
        this.listaUser = listaUser;
    }

    public ListaProjetos getListaProjetos() {
        return listaProjetos;
    }

    public void setListaProjetos(ListaProjetos listaProjetos) {
        this.listaProjetos = listaProjetos;
    }

    private User userLigado;
    private User userRegistado;

    public String getTime() {
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yy");
        Date thisdate = new Date();
        return s.format(thisdate);
    }

    public ListaUsers getListaUsers() {
        return listaUser;
    }

    public User getUserLigado() {
        return userLigado;
    }

    public User getUserRegistado() {
        return userRegistado;
    }

    public void setListaUsers(ListaUsers listaUsers) {
        this.listaUser = listaUsers;
    }

    public void setUserRegistado(String Email) throws DadosNaoEncontrados {
        userRegistado = listaUser.getUser(Email);
    }

    public boolean autenticarUser(String Email, String Pw) throws DadosEmBranco, DadosInvalidos, DadosNaoEncontrados {
        try {
            if (listaUser.validaUser(Email)) {
                if (listaUser.validaPw(Pw)) {
                    userLigado = listaUser.getUser(Email);
                    return true;
                }
            }
        } catch (NumberFormatException | DadosNaoEncontrados ex) {
            JOptionPane.showMessageDialog(null, "Tem de introduzir o email de Loja", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    //Escreve e guarda toda a informação do sistema num ficheiro com o nome 'Data.bin'
    public void guardar(String nomeFicheiro) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeFicheiro));
            out.writeObject(this);
            out.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), NOME, JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Saí do programa.
     */
    public void sair() {
        guardar(this.NOME);
        exit();
    }

    /**
     * Termina o programa.
     */
    public void terminar() {
        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        if (JOptionPane.showConfirmDialog(null,
                "Deseja realmente terminar o programa?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            sair();
        }
    }

    public void exit() {
        System.exit(0);
    }
}
