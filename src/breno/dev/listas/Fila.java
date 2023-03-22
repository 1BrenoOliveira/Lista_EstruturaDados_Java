package breno.dev.listas;

import breno.dev.nos.No;

public class Fila {
	
	private No refPrimeiroFila;
	
	public Fila() {
		this.refPrimeiroFila = null;
	}
	
	public boolean isEmpty() {
		return refPrimeiroFila==null?true:false;
	}
	
	public No first() {
		return refPrimeiroFila;
	}
	
	public void enqueue(No novoNo) {
		No noAux = refPrimeiroFila;
		if(refPrimeiroFila==null) {
			refPrimeiroFila = novoNo;
		}else {
			while(true) {
				if(noAux.getRefNo()!=null) {
					noAux = noAux.getRefNo();
				}else {
					noAux.setRefNo(novoNo);
					break;
				}
			}
		}
	}
	public No dequeue() {
		No primeiroDaFila = refPrimeiroFila;
		refPrimeiroFila = refPrimeiroFila.getRefNo();
		return primeiroDaFila;
	}

	@Override
	public String toString() {
		String mensagem  = "Fila: \n";
		No noAux = refPrimeiroFila;
		if(noAux==null)return "Fila vazia...";
		else {
			while(true) {
				mensagem+=noAux.getConteudo() + " => ";
				if(noAux.getRefNo()!=null) {
					noAux = noAux.getRefNo();
				}else {
					break;
				}
			}
		}
		return mensagem;
	}
	
}
