package breno.dev;


import breno.dev.listas.Fila;
import breno.dev.listas.ListaCircular;
import breno.dev.listas.ListaDuplamenteEncadeada;
import breno.dev.listas.ListaEncadeada;
import breno.dev.listas.Pilha;
import breno.dev.nos.No;
import breno.dev.nos.NoDuplo;

public class Main {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.push(new No("1"));
		pilha.push(new No("2"));
		pilha.push(new No("3"));
		pilha.push(new No("4"));
		pilha.push(new No("5"));
		System.out.println("Top: " + pilha.top());
		System.out.println(pilha);
		pilha.pop();
		System.out.println("\nApos usar o metodo pop(tirar o de cima).");
		System.out.println(pilha);
		
		System.out.println("____________________________________________________________________________________________");
		
		
		Fila fila = new Fila();
		fila.enqueue(new No("1"));
		fila.enqueue(new No("2"));
		fila.enqueue(new No("3"));
		fila.enqueue(new No("4"));
		fila.enqueue(new No("5"));
		System.out.println("Primeiro da fila: " + fila.first());
		System.out.println(fila);
		fila.dequeue();
		System.out.println("\nDepois de usar o metodo dequeue(remover o primeiro da fila).");
		System.out.println(fila);
		
		System.out.println("____________________________________________________________________________________________");
		
		
		ListaEncadeada lista = new ListaEncadeada();
		lista.add(new No("1"));
		lista.add(new No("2"));
		lista.add(new No("3"));
		lista.add(new No("4"));
		System.out.println(lista);
		int index = 0;
		System.out.println("Removendo o item " + (index) +" da lista: " +lista.get(index));
		System.out.println("\nApos remover o item " + index + " da lista\n"+lista);
		
		System.out.println("____________________________________________________________________________________________");
		
		ListaDuplamenteEncadeada duplaLista = new ListaDuplamenteEncadeada();
		duplaLista.add(new NoDuplo("1"));
		duplaLista.add(new NoDuplo("2"));
		duplaLista.add(new NoDuplo("3"));
		System.out.println(duplaLista);
		index = 0;
		duplaLista.add(new NoDuplo("0"), index);//inserindo na posição informada pelo index
		System.out.println(duplaLista);
		duplaLista.remove(3);
		System.out.println(duplaLista);
		System.out.println("____________________________________________________________________________________________");
		
		ListaCircular listaCircular = new ListaCircular();
		listaCircular.add(new No("3"));
		listaCircular.add(new No("2"));
		listaCircular.add(new No("1"));
		System.out.println(listaCircular);
		//listaCircular.remove(0);
		System.out.println(listaCircular);
		
		System.out.println("____________________________________________________________________________________________");

	}
}
