public class Livro {

    private String titulo;
    private String autor;
    private int ano;
    private String editora;

    public Livro(String titulo, String autor, int ano, String editora){
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
    }
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo(){ return this.titulo; }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano) {this.ano = ano;}

    public String getAutor(){ return this.autor; }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditora() {return this.editora = editora;}

    public void setEditora(String editora) {this.editora = editora;}




}
