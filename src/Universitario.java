/**
 * Classe Universitario(aluno)
 */
public class Universitario {
    private String nome;
    private int matricula;
    Trabalho trabalho;

    /**
     * Construtor do Universitario(aluno)
     * @param nome
     * @param matricula
     * @param trabalho
     */
    Universitario(String nome, int matricula, Trabalho trabalho)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.trabalho = trabalho;
    }
    
    void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    String getNome()
    {
        return this.nome;
    }
    
    void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    
    int getMatricula()
    {
        return this.matricula;
    }
    
     public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }
}