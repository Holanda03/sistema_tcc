
public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Vinicius", 1234);
        Trabalho trab1 = new Trabalho(1, "Como salvar as onças", "Meio ambiente", prof1);
        
        Universitario aluno1 = new Universitario("Carlos Abraão", 1, trab1);
        Universitario aluno2 = new Universitario("Ricardo Vinicius", 2, trab1);

        trab1.inserirAlunos(aluno1);
        trab1.inserirAlunos(aluno2);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.publicarTrabalho(1, trab1, prof1);
        biblioteca.curtirTrabalho(1);

        System.out.println(trab1.getQtdCurtidas());

        biblioteca.baixarTrabalho(1);

        trab1.getQtdCurtidas();

        biblioteca.comentarTrabalho(1, "Belo trabalho");
        System.out.println(biblioteca.visualizarTrabalho(1).getComentarios());
    }
}
