# Estruturas de Dados

Este repositório contém implementações de diversas **estruturas de dados** em **Java**, com foco em conceitos fundamentais e operações clássicas. Abaixo, você encontra uma explicação dos principais temas e estruturas presentes.

---

## 📚 Assuntos Abordados

### 1. Pilhas (Stacks)
- **Definição:** Estrutura do tipo **LIFO** (*Last In, First Out*), onde o último elemento inserido é o primeiro a ser removido.
- **Principais operações:**
  - `push()` / `empilhar()` – Insere elemento no topo.
  - `pop()` / `desempilhar()` – Remove o elemento do topo.
  - `peek()` / `espiar()` – Consulta o topo sem remover.
  - `isEmpty()` / `estaVazia()` – Verifica se está vazia.
  - `isFull()` / `estaCheia()` – Verifica se está cheia (no caso de pilha estática).
- **Implementações:**
  - Pilha Estática (array fixo)
  - Pilha Dinâmica (lista encadeada)
  - Pilha Dupla
  - Pilha Invertida

---

### 2. Filas (Queues)
- **Definição:** Estrutura do tipo **FIFO** (*First In, First Out*), onde o primeiro elemento inserido é o primeiro a ser removido.
- **Principais operações:**
  - `enqueue()` / `enfileirar()` – Insere elemento no final.
  - `dequeue()` / `desenfileirar()` – Remove o elemento do início.
  - `front()` / `frente()` – Consulta o início da fila.
  - `isEmpty()` / `estaVazia()` – Verifica se está vazia.
  - `isFull()` / `estaCheia()` – Verifica se está cheia (no caso de fila estática).
- **Implementações:**
  - Fila Estática
  - Fila Estática Circular
  - Fila Dinâmica (lista encadeada)
  - Fila Genérica

---

### 3. Listas (Lists)
- **Definição:** Estruturas que armazenam elementos de forma linear, permitindo inserções, remoções e buscas em posições arbitrárias.
- **Principais operações:**
  - Inserção (`anexar`, `inserir`)
  - Remoção (`apagar`)
  - Atualização (`atualizar`)
  - Seleção (`selecionar`, `selecionarTodos`)
  - Verificações (`estaVazia`, `estaCheia`)
- **Implementações:**
  - Lista Estática (array fixo)
  - Lista Dinâmica (lista encadeada)
  - Lista Genérica

---

### 4. Ordenação (Sorting)
Os algoritmos de ordenação são fundamentais para organizar dados em uma determinada ordem (crescente ou decrescente). Neste repositório, o principal algoritmo implementado é o **Bubblesort**.

### Bubblesort

- **Descrição:**  
  O Bubblesort é um algoritmo de ordenação simples que percorre o vetor diversas vezes, comparando elementos adjacentes e trocando-os de posição se estiverem fora de ordem. Esse processo é repetido até que o vetor esteja ordenado.

- **Funcionamento:**  
  - Em cada passagem pelo vetor, o maior (ou menor) elemento "borbulha" para o final (ou início) do vetor.
  - O algoritmo continua até que nenhuma troca seja necessária, indicando que o vetor está ordenado.

- **Vantagens:**  
  - Fácil de implementar e entender.
  - Útil para pequenas quantidades de dados ou para fins didáticos.

- **Desvantagens:**  
  - Ineficiente para grandes volumes de dados (complexidade O(n²)).
  - Realiza muitas comparações e trocas desnecessárias.

---

## 📝 Contrato das Estruturas

As interfaces presentes no projeto definem contratos para as operações básicas das estruturas, seguindo o padrão CRUD:
- **Create:** Inserção de elementos.
- **Read:** Consulta de elementos.
- **Update:** Atualização de elementos.
- **Delete:** Remoção de elementos.
- **Sort:** Ordenação dos elementos.

---

## 📁 Organização do Projeto

- `Pilhas/` – Implementações de pilhas.
- `Filas/` – Implementações de filas.
- `Listas/` – Implementações de listas.
- `Ordenacao/` – Algoritmos de ordenação.

---