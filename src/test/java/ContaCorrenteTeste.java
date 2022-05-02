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
    @Test
    public void DeveFazerSubtrairDoSaldoDaConta(){

        ContaCorrente conta = new ContaCorrente(10);
        conta.sacar(5);

        double resultado = conta.getSaldo();

        Assertions.assertEquals(5,resultado);
    }
    @Test
    public void TesteDeSaqueEmContaDeSaldoZero(){
        ContaCorrente conta = new ContaCorrente(0);
        conta.sacar(10);

        double resultado = conta.getSaldo();

        Assertions.assertEquals(0,resultado);
    }

}
