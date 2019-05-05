package Backend;

import java.io.Serializable;
import excetions.DadosEmBranco;
import excetions.DadosInvalidos;

 public class User implements Serializable{

	private String nome;
	private String mail;
	private String password;

    public User(String nome, String mail, String password) throws DadosEmBranco, DadosInvalidos {
       setNome(nome);
       setMail(mail);
       setPassword(password);
    }

    public String getNome() {
        return nome;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public void setNome(String nome) throws DadosEmBranco, DadosInvalidos {
        if(nome.isEmpty()){
             throw new DadosEmBranco();
            } 
        
        else { this.nome = nome;
}
    }

    public void setMail(String mail)throws DadosEmBranco, DadosInvalidos {
        if(mail.isEmpty()){
             throw new DadosEmBranco();
            } 
        
        else { this.mail = mail;
}
    }

    public void setPassword(String password)throws DadosEmBranco, DadosInvalidos {
        if(password.isEmpty()){
             throw new DadosEmBranco();
            } 
        
        else { this.password = password;
}
    }

    @Override
    public String toString() {
        return "User{" + "nome=" + nome + ", mail=" + mail + ", password=" + password + '}';
    }

}
