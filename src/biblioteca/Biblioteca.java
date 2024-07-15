package biblioteca;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> acervo;

    Biblioteca() {
        acervo = new ArrayList<Livro>();
    }

    void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    boolean removerLivro(String isbn) {
        for (Livro livro : acervo) {
            if (isbn.equals(livro.isbn)) {
                acervo.remove(livro);

                return true;
            }
        }
        return false;
    }

    ArrayList<Livro> listaTodos() {
        return acervo;
    }

    ArrayList<Livro> listaEmprestados() {
        var emprestados = new ArrayList<Livro>();

        for (var livro : acervo) {
            if (livro.estaEmprestado()) {
                listaEmprestados().add(livro);
            }
        }
        return emprestados;
    }
    ArrayList<Livro> listaDisponiveis() {
        ArrayList<Livro> disponiveis = new ArrayList<Livro>();

        for (Livro livro : acervo) {
            if (livro.estaEmprestado() == false) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }
}