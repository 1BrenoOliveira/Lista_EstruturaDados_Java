# Estrutura de dados com Java
  Exemplo de codificação em Java dos principais tipos de listas da estrutura de dados. 
## Apresentação
  No projeto, cada classe implementa um tipo de lista diferente, com suas particularidades, utilizando como entidade para inserir na lista, Nós, com conteudo apenas de String(texto), para que seja de fácil compreensão.
## Estrutura de Dados
  Uma estrutura de dados, em ciência da computação, é uma coleção tanto de valores quanto de operações. É uma implementação concreta de um tipo abstrato de dado ou um tipo de dado básico ou primitivo.
#### Foi desenvolvido as seguintes listas:
- Pilha
- Fila
- Lista Encadeada
- Lista Duplamente Encadeada
- Lista Circular

#### PILHA
  A estrutura da pilha, utiliza o conceito de LIFO (Last In, First Out), que basicamente é uma coleção de dados, utilizando a ordenação onde a inserção de dado é feito no topo da coleção, e a remoção de um item retira o dado que está no topo. 

Ex:: -> Quando estamos lavando pratos, costumamos começar ensaboar uma quantidade de pratos primeiro, para depois enxaguar. Quando ensaboamos, começamos a fazer uma pilha de pratos. Colocamos o primeiro, depois o segundo sobre o primeiro, e os próximos sobre os anteriores:

![inserção pilha](https://user-images.githubusercontent.com/59750674/227029337-458a5a01-73e0-467f-a792-3571d688146e.png) Esse metodo de inserção na pilha é chamado **PUSH**.

  ->Quando enxaguamos, é feito o contrário. Retiramos o prato que está mais acima, até que terminamos com a pilha: 
![Remoção Pilha](https://user-images.githubusercontent.com/59750674/227030355-e7639e8b-337a-44b3-ba09-69cc6a04b741.png) Esse metodo de remoção é chamado **POP**.

A estrutura pilha ainda possui o metodo particular chamado **TOP** usado para ver o prato(item) que está no topo da pilha.
