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

    public ArrayList<Universitario> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Universitario> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    /**
     * M??todo para curtir o trabalho
     */
    public void curtirTrabalho()
    {
        qtdCurtidas++;
    }

    /**
     * M??todo para inserir coment??rios em um trabalho
     * @param comentario
     */
    public void comentarTrabalho(String comentario)
    {
        comentarios.add(comentario);
    }

    /**
     * M??todo para inser????o de alunos
     * @param aluno
     */
    public void inserirAlunos(Universitario aluno)
    {
        if (listaAlunos.size() < 4)
        {
            listaAlunos.add(aluno);
        } else
        {
            System.out.println("O grupo j?? possui o n??mero m??ximo de integrantes.");
        }
    }
}
