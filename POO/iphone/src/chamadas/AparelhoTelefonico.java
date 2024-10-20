package chamadas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AparelhoTelefonico {

    private HashMap<String, String> contatos = new HashMap<>();
    private HashMap<String, String> favoritos = new HashMap<>();
//    TODO:
//    private HashMap<String, String> recentes = new HashMap<>();
    private List<String> correiosDeVoz = new LinkedList<>();
    private List<String> registroDeChamadas = new ArrayList<>();

    public void adicionarContato(String numero, String nome){
        contatos.put(numero, nome);
    }

    public String Ligar(String numero){
        // TODO: alterar para salvar o nome do contatdo
        //  caso numero esteja presente nos contatos.
        registroDeChamadas.add(numero);
        return "ligando para " + numero;
    }

    public String Atender(String numero) {
        // todo: ajustar para poder recusar a ligação;

        boolean verificaSePossuiContato = contatos.containsKey(numero);
        if (verificaSePossuiContato){
            return "em chamada com o contato: " + contatos.get(numero);
        } else {
            return "em chamada com: " + numero;
        }
    }
}