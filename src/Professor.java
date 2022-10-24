/**
 * Classe Professor
 */
public class Professor {
    private String nome;
    private int id;

    /**
     * Construtor do professor
     * @param nome
     * @param id
     */
    Professor(String nome, int id)
    {
        this.nome = nome;
        this.id = id;
    }
    
    void setNome(String nome)
    {
        this.nome = nome;
    }
    
    String getNome()
    {
        return this.nome;
    }
    
    void setId(int id)
    {
        this.id = id;
    }
    
    int getId()
    {
        return this.id;
    }
}
