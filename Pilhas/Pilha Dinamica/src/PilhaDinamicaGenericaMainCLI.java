import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PilhaDinamicaGenericaMainCLI {
  public static void main(String[] args) {
    Empilhavel<String> pilha = new PilhaDinamicaGenerica<>(7);
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
      exibirMenu();
      System.out.print("Escolha uma opção (0-5): ");
	  try {
        opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir o newline

        switch (opcao) {
          case 0:
            System.out.println("Saindo da Pilha. Até mais!");
            break;
          case 1:
            System.out.print("Digite o valor: ");
            String valor = scanner.nextLine();
			try {			
              pilha.empilhar(valor);
			} catch(NoSuchElementException e) {
		      System.err.println(e.getMessage());
			}
            break;
          case 2:
            System.out.print("Deseja desempilhar[s/n]? ");
            String confirmacao = scanner.nextLine().trim().toLowerCase();
            if (confirmacao.equals("s")) {
			  try {
                pilha.desempilhar();
			  } catch(NoSuchElementException e) {
		        System.err.println(e.getMessage());
			  }
            }
            break;
          case 3:
			try {
              System.out.println("Topo: " + pilha.espiar());
			} catch(NoSuchElementException e) {
		      System.err.println(e.getMessage());
			}
            break;
          case 4:
            System.out.print("Digite o valor: ");
            String novoValor = scanner.nextLine();
			try {
              pilha.atualizar(novoValor);
            } catch(NoSuchElementException e) {
		      System.err.println(e.getMessage());
			}
			break;
          case 5:
            System.out.println(pilha.imprimir());
            break;
          default:
            System.out.println("Opção inválida. Tente novamente.");
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida. Tente novamente.");
        scanner.nextLine(); // Consumir a entrada inválida
        opcao = -1; // Para não sair do loop
      }		
    } while (opcao != 0);

    scanner.close();
  }

  public static void exibirMenu() {
    System.out.println("=== PILHA DINÂMICA GENÉRICA CLI ===");
    System.out.println("0. SAIR");
    System.out.println("1. Empilhar");
    System.out.println("2. Desempilhar");
    System.out.println("3. Espiar");
    System.out.println("4. Atualizar");
    System.out.println("5. Imprimir");
  }
}