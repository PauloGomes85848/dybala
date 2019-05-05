package Backend;

public class Tarefa {

    private String titulo;
    private String descricao;
    private String prioridade;
    private String data_de_fim;
    private String estado;
    private ListaAssociados listaAssociados;
    
    public Tarefa(){
        this.listaAssociados = new ListaAssociados();
    }

    public Tarefa(String titulo, String descricao, String prioridade, String data_de_fim, String estado) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.data_de_fim = data_de_fim;
        this.estado = estado;
        this.listaAssociados = new ListaAssociados();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getData_de_fim() {
        return data_de_fim;
    }

    public String getEstado() {
        return estado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public void setData_de_fim(String data_de_fim) {
        this.data_de_fim = data_de_fim;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ListaAssociados getListaAssociados() {
        return listaAssociados;
    }

    public void setListaAssociados(ListaAssociados listaAssociados) {
        this.listaAssociados = listaAssociados;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "titulo=" + titulo + ", descricao=" + descricao + ", prioridade=" + prioridade + ", data_de_fim=" + data_de_fim + ", estado=" + estado + '}';
    }

}
