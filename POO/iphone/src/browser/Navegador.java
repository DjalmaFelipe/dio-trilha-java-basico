package browser;

import iphone.Iphone2g;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Navegador {

    private String URL;
    private List<String> abas = new LinkedList<>();
    private List<String> historico = new ArrayList<>();

    //  TODO:
    //  private List<String> favoritos = new LinkedList<>();

    Iphone2g hardware = new Iphone2g();

    private String exibirPagina(String URL) {
            this.URL = URL;
            historico.add(URL);
            return "Exibindo pagina: " + URL;
    }

    public String adicionarNovaAba(String url){
        if (hardware.isWifi()) {
        abas.add(url);
            return exibirPagina(url);
        } else {
            return "Sem Conexão De Internet";
        }
    }

    public String atualizarPagina(){
        return "pagina atualizada, Exibindo: " + URL;
    }

}