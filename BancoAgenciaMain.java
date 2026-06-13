import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoAgenciaMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Banco banco = new Banco();

        
        System.out.print("Digite o número do banco: ");
        banco.setNumero(scanner.nextInt());
        scanner.nextLine(); 

        System.out.print("Digite o nome do banco: ");
        banco.setNome(scanner.nextLine());

    
        System.out.print("Quantas agências deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        List<Agencia> agencias = new ArrayList<>();

        
        for (int i = 1; i <= quantidade; i++) {
            Agencia agencia = new Agencia();

            System.out.println("\nAgência " + i);

            System.out.print("Digite o número da agência: ");
            agencia.setNumero(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Digite o nome da agência: ");
            agencia.setNome(scanner.nextLine());

            agencias.add(agencia);
        }

        banco.setAgencias(agencias);

        
        System.out.println("DADOS CADASTRADOS:");
        System.out.println("Número do Banco: " + banco.getNumero());
        System.out.println("Nome do Banco: " + banco.getNome());
        System.out.println("Agências:");

        for (Agencia agencia : banco.getAgencias()) {
            System.out.println("- Número: " + agencia.getNumero()
                    + ", Nome: " + agencia.getNome());
        }

        scanner.close();
    }
}