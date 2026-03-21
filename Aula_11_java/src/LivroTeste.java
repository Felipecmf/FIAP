public class LivroTeste {
    public static void main(String[] args) {
        Livro livro = new Livro("Mistborn", "Brandon Sanderson");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("========================");

        Livro livro2 = new Livro("Harry Potter", "Jk Roling", 2001, "Sla" );
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Ano: " + livro2.getAno());
        System.out.println("Editora: " + livro2.getEditora());

        //configurando os atributos ano e editora através dos métodos setters()
        livro2.setAno(2025);
        livro2.setEditora("sla2");
        System.out.println("=================================");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Ano: " + livro2.getAno());
        System.out.println("Editora: " + livro2.getEditora());
    }
}
