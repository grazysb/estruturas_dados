public class q1 {
    int valor;
    No esquerda, direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = direita = null;
    }
}

public class ArvoreBinaria {

    No raiz;

    // Método recursivo para contar os nós da árvore
    public int contarNos(No no) {
        if (no == null) {
            return 0;
        }

        int esquerda = contarNos(no.esquerda);  // conta nós da subárvore esquerda
        int direita = contarNos(no.direita);    // conta nós da subárvore direita

        return 1 + esquerda + direita;  // soma 1 (raiz) + nós da esquerda + nós da direita
    }

    // Método auxiliar para iniciar a contagem a partir da raiz
    public int contarNos() {
        return contarNos(raiz);
    }

    // Teste
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.raiz = new No(10);
        arvore.raiz.esquerda = new No(5);
        arvore.raiz.direita = new No(20);
        arvore.raiz.esquerda.esquerda = new No(3);
        arvore.raiz.esquerda.direita = new No(7);

        int totalNos = arvore.contarNos();
        System.out.println("Total de nós na árvore: " + totalNos);
    }
}
