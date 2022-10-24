import java.util.ArrayList;

/**
 * Classe Trabalho(TCC)
 */
public class Trabalho {
    private int id;
    private String titulo;
    private String areaAtuacao;
    private int qtdCurtidas = 0;
    private Professor profOrientador;
    private ArrayList<Universitario> listaAlunos = new ArrayList<>();
    private ArrayList<String> comentarios = new ArrayList<>();

    /**
     * Construtor do Trabalho(TCC)
     * @param id
     * @param titulo
     * @param areaAtuacao
     * @param profOrientador
     */
    public Trabalho(int id, String titulo, String areaAtuacao, Professor profOrientador)
    {
        this.id = id;
        this.titulo = titulo;
        this.areaAtuacao = areaAtuacao;
        this.profOrientador = profOrientador;
    }

    void setId(int id)
    {
        this.id = id;
    }

    int getId()
    {
        return this.id;
    }

    void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    String getTitulo()
    {
        return this.titulo;
    }

    void setAreaAtuacao(String areaAtuacao)
    {
        this.areaAtuacao = areaAtuacao;
    }

    String getAreaAtuacao()
    {
        return this.areaAtuacao;
    }

    void setQtdCurtidas(int qtdCurtidas)
    {
        this.qtdCurtidas = qtdCurtidas;
    }

    int getQtdCurtidas()
    {
        return this.qtdCurtidas;
    }

    public void setNomeAlunos(ArrayList<Universitario> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public ArrayList<Universitario> getNomeAlunos() {
        return listaAlunos;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public ArrayList<String> getComentarios() 
    {
        return comentarios;
    }
    
     public Professor getProfOrientador() 
     {
        return profOrientador;
    }

    public void setProfOrientador(Professor profOrientador) 
    {
        this.profOrientador = profOrientador;
    }

    /**
     * Método para curtir o trabalho
     */
    public void curtirTrabalho()
    {
        qtdCurtidas++;
    }

    /**
     * Método para inserir comentários em um trabalho
     * @param comentario
     */
    public void comentarTrabalho(String comentario)
    {
        comentarios.add(comentario);
    }

    /**
     * Método para inserção de alunos
     * @param aluno
     */
    public void inserirAlunos(Universitario aluno)
    {
        listaAlunos.add(aluno);
    }
}
