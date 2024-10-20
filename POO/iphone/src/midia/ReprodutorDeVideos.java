package midia;

import java.util.LinkedList;
import java.util.List;

public class ReprodutorDeVideos implements Reproduzivel {

    private EstadoReproducao estado = EstadoReproducao.NENHUM;
    List<String> videos = new LinkedList<>();

    @Override
    public String Tocar() {
        if (estado == EstadoReproducao.REPRODUZINDO) {
            return "O conteúdo já está em reprodução.";
        } else {
            estado = EstadoReproducao.REPRODUZINDO;
            return "Reproduzindo Conteúdo";
        }
    }

    @Override
    public String pausar() {
        estado = EstadoReproducao.EM_PAUSA;
        return "Conteúdo Pausado.";
    }

    @Override
    public String parar() {
        estado = EstadoReproducao.NENHUM;
        return "Reprodução Encerrada";
    }

    @Override
    public String escolherArquivo(int enderecoDoVideo) {
        this.estado = EstadoReproducao.REPRODUZINDO;
        return "Reproduzindo Video: " + videos.get(enderecoDoVideo);
    }
}
