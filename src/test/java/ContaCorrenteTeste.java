import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTeste {
    @Test
    public void DeveAdicionarOSaldoNaConta(){

        ContaCorrente conta = new ContaCorrente(5);
        conta.depositar(5);

        double resultado = conta.getSaldo();

        Assertions.assertEquals(10,resultado);

    }

}
