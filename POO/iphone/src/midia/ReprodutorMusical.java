package midia;

import java.util.LinkedList;
import java.util.List;

public class ReprodutorMusical implements Reproduzivel {
    EstadoReproducao estado = EstadoReproducao.NENHUM;
    List<String> musicas = new LinkedList<>();

    @Override
    public String Tocar() {
        if (estado == EstadoReproducao.REPRODUZINDO) {
        return "A música já está em reprodução.";
        } else {
            estado = EstadoReproducao.REPRODUZINDO;
            return "Reproduzindo.";
        }
    }

    @Override
    public String pausar() {
        estado = EstadoReproducao.EM_PAUSA;
        return "Música Pausada.";
    }

    @Override
    public String parar() {
        estado = EstadoReproducao.NENHUM;
        return "Reprodução Encerrada";
    }

    @Override
    public String escolherArquivo(int enderecoDaMusica) {
        this.estado = EstadoReproducao.REPRODUZINDO;
        return "Reproduzindo a musica: " + musicas.get(enderecoDaMusica);
    }
}
