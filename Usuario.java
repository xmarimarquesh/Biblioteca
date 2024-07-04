import java.util.ArrayList;

public class Usuario {
    public String nome;
    public int ID;
    public ArrayList<Livro> livros_emprestados = new ArrayList<Livro>();


    public Usuario(String nome, int ID) {
        this.nome = nome;
        this.ID = ID;
    }
}
