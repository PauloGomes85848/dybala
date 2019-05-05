/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excetions;

/**
 *
 * @author bidas
 */
public class DadosEmBranco extends Exception {
      public DadosEmBranco() {
        super("Tem dados em branco.");
    }
    
    public DadosEmBranco(String msg) {
        super(msg);
    }
}
