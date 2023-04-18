package flyweightppb;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String Telefone;
    private ArrayList<Pessoa> listaAmigos =new ArrayList<>();
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.Telefone =telefone;
    }

    public void novoAmigo(String nome, String telefone){
        Pessoa p = PessoaFactory.getPessoa(nome,telefone);
        listaAmigos.add(p);
    }
    public String toString() {
        return getNome()+" "+getTelefone();
    }
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public ArrayList<Pessoa> getListaAmigos() {
        return listaAmigos;
    }
}
