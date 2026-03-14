package FIAP.Java_aula03;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setId(0);
        produto.setName("Arroz");
        produto.setPrice(32.99f);
        System.out.println("ID: " + produto.getId());
        System.out.println("Nome: " + produto.getName());
        System.out.println("Preço: " + produto.getPrice());
    }
}
