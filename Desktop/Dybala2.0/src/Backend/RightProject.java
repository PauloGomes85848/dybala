/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import static Backend.Sistema.NOME;
import excetions.DadosEmBranco;
import excetions.DadosInvalidos;
import excetions.DadosNaoEncontrados;
import Frontend.HomePage;

/**
 *
 * @author bidas
 */
public class RightProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DadosNaoEncontrados, DadosEmBranco, DadosInvalidos {
        
        Sistema sistema = new Sistema();

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(Sistema.NOME));
            sistema = (Sistema) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), NOME, JOptionPane.ERROR_MESSAGE);
        }

        User ola = new User("fernando", "pedro", "ola");

        Projeto projeto1 = new Projeto("teste", "teste", "teste", "teste");
        Projeto projeto2 = new Projeto("teste2", "teste3", "teste2", "teste2");
        Projeto projeto3 = new Projeto("teste3", "teste2", "teste3", "teste3");

        HomePage inicio = new HomePage(sistema);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);

    }

}
