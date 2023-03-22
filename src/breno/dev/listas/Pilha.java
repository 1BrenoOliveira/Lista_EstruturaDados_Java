package breno.dev.listas;

import breno.dev.nos.No;

public class Pilha {

	private No refNoEntrada;

	public Pilha() {
		refNoEntrada = null;
	}

	public boolean isEmpty() {
		return refNoEntrada == null ? true : false;
	}

	public No top() {
		return refNoEntrada;
	}

	public No pop() {
		if(!isEmpty()) {
			No ultimoNo = refNoEntrada;
			refNoEntrada = refNoEntrada.getRefNo();
			return ultimoNo;
		}else return null;
			
	}

	public void push(No novoNo) {
		No noAux = refNoEntrada;
		refNoEntrada = novoNo;
		refNoEntrada.setRefNo(noAux);
	}

	@Override
	public String toString() {
		String mensagem = "pilha: \n\n";
		No noAux = refNoEntrada;
		if(noAux==null) return "Fila Vaziia....";
		else {
			while(true) {
				mensagem += "| " + noAux.getConteudo() + " | \n";
				if(noAux.getRefNo()!=null) {
					noAux = noAux.getRefNo();
				}else {
					break;
				}
			}
		}
		mensagem += "-----";
		return mensagem;
	}

}
