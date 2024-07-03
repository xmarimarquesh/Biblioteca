public class Usuario {
    public String nome;
    public int ID;
    public Livro livros[] = new Livro[10];

    public Usuario(String nome, int ID, Livro[] livros) {
        this.nome = nome;
        this.ID = ID;
        this.livros = livros;
    }
}
