package biblioteca;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    String isbn;
    boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;

        emprestado = false;
    }

    public void emprestar() {
        if (estaEmprestado()) {
            throw new IllegalStateException("O livro ja esta emprestado.");
        } else {
            this.emprestado = true;
        }
    }

    public void devolver() {
        if (estaEmprestado() == false) {
            throw new IllegalStateException("O livro nao esta emprestado.");
        } else {
            this.emprestado = false;
        }
    }

    boolean estaEmprestado() {
        return emprestado;
    }

    String converteParaString() {
        return String.format("%s. %s. %i. %s", this.autor, this.titulo, this.anoPublicacao, this.isbn);
    }

}