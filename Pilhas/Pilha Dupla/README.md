## 📌 Pilha Dupla  

A **Pilha Dupla** é uma variação da **Pilha Estática**, onde duas pilhas compartilham um mesmo **array fixo**, crescendo em direções opostas.  

- **Vantagens:** Melhor aproveitamento da memória, pois ambas as pilhas utilizam um mesmo espaço.  
- **Funcionamento:**  
  - Uma pilha cresce do **início para o fim** do array.  
  - A outra cresce do **fim para o início**.  
  - Se ambas se encontrarem, ocorre **estouro de pilha** (*stack overflow*).  
- **Operações básicas:**  
  - `push1(elemento)`, `push2(elemento)` → Insere na pilha 1 ou 2.  
  - `pop1()`, `pop2()` → Remove da pilha 1 ou 2.  
  - `peek1()`, `peek2()` → Consulta o topo da pilha 1 ou 2.  
  - `isFull()` → Verifica se não há mais espaço.  