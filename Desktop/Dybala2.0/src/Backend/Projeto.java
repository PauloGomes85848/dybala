package Backend;

public class Projeto {

    private String titulo;
    private String descricao;
    private User owner;
    private String data_de_inicio;
    private String data_de_fim;
    private ListaTarefas listaTarefas;

    public Projeto() {
        this.listaTarefas = new ListaTarefas();
    }

    public Projeto(String titulo, String descricao, String data_de_inicio, String data_de_fim) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_de_inicio = data_de_inicio;
        this.data_de_fim = data_de_fim;
        this.listaTarefas = new ListaTarefas();
    }

    public ListaTarefas getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ListaTarefas listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public User getOwner() {
        return owner;
    }

    public String getData_de_inicio() {
        return data_de_inicio;
    }

    public String getData_de_fim() {
        return data_de_fim;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setData_de_inicio(String data_de_inicio) {
        this.data_de_inicio = data_de_inicio;
    }

    public void setData_de_fim(String data_de_fim) {
        this.data_de_fim = data_de_fim;
    }

    @Override
    public String toString() {
        return "Projeto{" + "titulo=" + titulo + ", descricao=" + descricao + ", owner=" + owner + ", data_de_inicio=" + data_de_inicio + ", data_de_fim=" + data_de_fim + '}';
    }

}
