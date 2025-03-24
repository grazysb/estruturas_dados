## 📌 Pilha Invertida  

A **Pilha Invertida** segue o mesmo conceito de uma **Pilha Estática**, mas os elementos são armazenados de forma invertida, ou seja, o **topo começa no final do array e cresce para trás**.  

- **Diferença principal:** O índice do topo **diminui** ao invés de aumentar.  
- **Principais operações:**  
  - `push(elemento)` → Insere no topo (diminuindo o índice).  
  - `pop()` → Remove do topo (aumentando o índice).  
  - `peek()` → Consulta o topo.  
  - `isEmpty()` → Verifica se está vazia.  
  - `isFull()` → Verifica se está cheia.  
- **Vantagem:** Pode ser útil em aplicações que necessitam de manipulação reversa de dados.  
