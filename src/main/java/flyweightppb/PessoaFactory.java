package flyweightppb;
import java.util.HashMap;
import java.util.Map;
public class PessoaFactory {
    private static Map<String, Pessoa> pessoas = new HashMap<>();


    public static Pessoa getPessoa(String nome, String telefone) {
        Pessoa pessoa = pessoas.get(telefone);
        if (pessoa == null) {
            pessoa = new Pessoa(nome, telefone);
            pessoas.put(telefone, pessoa);
        }
        return pessoa;
    }
    public static int getTotalPessoas() {
        return pessoas.size();
    }
}
