package flyweightppb;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class PessoaTest {
    @Test
    void deveRetornarAlunos() {
        Pessoa pedro = PessoaFactory.getPessoa("pedro","21991202675");
        pedro.novoAmigo("joao","1234");
        pedro.novoAmigo("iuri","4141");


        Pessoa iuri = PessoaFactory.getPessoa("iuri","4141");
        iuri.novoAmigo("joao","1234");
        iuri.novoAmigo("igor","41241412");

        assertEquals(4, PessoaFactory.getTotalPessoas());
    }
}
