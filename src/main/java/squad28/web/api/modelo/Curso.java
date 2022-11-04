package squad28.web.api.modelo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "cursos")
public class Curso {

    @Id
    private String id;
    private String titulo;

    private String imagem;

    private String descricao;

    private Boolean estaAtivo;

    public String origemConteudo;

    public String urlConteudo;


    public Curso() {
    }

    public Curso(String id, String titulo, String imagem, String descricao, Boolean estaAtivo, String origemConteudo, String urlConteudo) {
        this.id = id;
        this.titulo = titulo;
        this.imagem = imagem;
        this.descricao = descricao;
        this.estaAtivo = estaAtivo;
        this.origemConteudo = origemConteudo;
        this.urlConteudo = urlConteudo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(Boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public String getOrigemConteudo() {
        return origemConteudo;
    }

    public void setOrigemConteudo(String origemConteudo) {
        this.origemConteudo = origemConteudo;
    }

    public String getUrlConteudo() {
        return urlConteudo;
    }

    public void setUrlConteudo(String urlConteudo) {
        this.urlConteudo = urlConteudo;
    }
}
