package biblioteca;

public class App {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro(
            "O Senhor dos Aneis",
            "J. R. R. Tolkien",
            1954,
            "123"
        );

        Livro livro2 = new Livro(
            "O Hobbit",
            "J. R. R. Tolkien",
            1937,
            "456"
        );

        Livro livro3 = new Livro(
            "Dom Quixote",
            "Miguel de Cervantes",
            1605,
            "157"
        );

        Livro livro4 = new Livro(
            "Guerra e Paz",
            "Lev Toistoi",
            1869,
            "125"
        );

        Livro livro5 = new Livro(
            "Cem Anos de Solidao",
            "Gabriel Garcia Marques",
            1967,
            "4961"
        );

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        livro1.emprestar();
        livro2.emprestar();
        livro3.emprestar();
        livro1.devolver();

        System.out.println("Livros emprestados: ");
        for (Livro livro : biblioteca.listaEmprestados()) {
            System.out.println(livro.converteParaString());
        }
    }
}