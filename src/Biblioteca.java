import java.util.HashMap;
import java.util.Map;

/**
 * Classe Biblioteca(Armazenamento de TCCs)
 */
public class Biblioteca {
    Map<Integer, Trabalho> colecao = new HashMap<>();

    /**
     * Método para publicar um trabalho. Apenas para professores.
     * @param codigo
     * @param trabalho
     * @param professor
     */
    public void publicarTrabalho(int codigo, Trabalho trabalho, Professor professor) // prof
    {
        colecao.put(codigo, trabalho);
        System.out.println("O Trabalho de ID " + codigo + " foi publicado com sucesso pelo professor " + professor.getNome());
    }

    /**
     * Método para remover um trabalho. Apenas para professores.
     * @param codigo
     * @param professor
     */
    public void deletarTrabalho(int codigo, Professor professor) // prof
    {
        colecao.remove(codigo);
        System.out.println("O Trabalho de ID " + codigo + " foi removido com sucesso pelo professor " + professor.getNome());
    }

    /**
     * Método para visualização de qualquer parte de um trabalho.
     * @param codigo
     * @return qualquer atributo desejado do trabalho em específico
     */
    public Trabalho visualizarTrabalho(int codigo) // aluno
    {
        return colecao.get(codigo);
    }

    /**
     * Método para curtir o trabalho.
     * @param codigo
     */
    public void curtirTrabalho(int codigo) // aluno
    {
        colecao.get(codigo).curtirTrabalho();
        System.out.println("O trabalho de ID " + codigo + " foi curtido com sucesso.");
    }

    /**
     * Método para comentar um trabalho
     * @param codigo
     * @param comentario
     */
    public void comentarTrabalho(int codigo, String comentario) // aluno
    {
        colecao.get(codigo).comentarTrabalho(comentario);
        System.out.println("Comentário inserido com sucesso.");
    }

    /**
     * Método para baixar um trabalho.
     * @param codigo
     */
    public void baixarTrabalho(int codigo) // aluno
    {
        colecao.get(codigo);
        System.out.println("O Trabalho " + codigo + " foi baixado com sucesso.");
    }
}
