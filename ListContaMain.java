
import java.util.ArrayList;
import java.util.List;

public class ListContaMain {
    public static void main(String[] args) {

    ContaCorrente cc1 = new ContaCorrente();
    cc1.setNumero(123);
    PessoaFisica pf1 = new PessoaFisica();
    pf1.setNome("João");
    cc1.setTitular(pf1);
    cc1.setSaldo(1000.0);   

    ContaCorrente cc2 = new ContaCorrente();
    PessoaFisica pf2 = new PessoaFisica();
    pf2.setNome(null);
    cc2.setNumero(456);
    cc2.setTitular(pf2);
    cc2.setSaldo(2000.0);   

    ContaCorrente cc3 = new ContaCorrente();
    PessoaFisica pf3 = new PessoaFisica();
    pf3.setNome("Pedro");
    cc3.setNumero(789);
    cc3.setTitular(pf3);
    cc3.setSaldo(3000.0);   

    List<ContaCorrente> contas = new ArrayList<>();
    contas.add(cc1);
    contas.add(cc2);
    contas.add(cc3);
   

    for (ContaCorrente conta : contas) {
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println();
    }


}
}