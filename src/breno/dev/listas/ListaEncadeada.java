package breno.dev.listas;

import breno.dev.nos.No;

public class ListaEncadeada {
	
	private No refPrimeiroNo;
	
	
	public ListaEncadeada() {
		refPrimeiroNo = null;
	}
	
	public boolean isEmpty() {
		return refPrimeiroNo==null?true:false;
	}
	
	public int size() {
		int tamanho = 0;
		No noAux = refPrimeiroNo;
		while(true) {
			tamanho++;
			if(noAux.getRefNo()!=null) {
				noAux = noAux.getRefNo();
			}else {
				break;
			}
		}
		return tamanho;
	}
	
	public void add(No novoNo) {
		if(this.isEmpty()) {
			refPrimeiroNo = novoNo;
		}else {
			No noAux = refPrimeiroNo;
			for(int i=0;i<size()-1;i++) {
				noAux = noAux.getRefNo();
			}
			noAux.setRefNo(novoNo);
		}
	}
	
	
	public String get(int index) {
		return getNo(index).getConteudo();
	}
	
	private No getNo(int index) {
		
		validaIndice(index);
		No noAux = refPrimeiroNo;
		No noRetorno = null;
		
		for(int i = 0 ; i<=index;i++) {
			noRetorno = noAux;
			noAux = noAux.getRefNo();
		}
		return noRetorno;
	}
	
	public String remove(int index) {
		No noRetorno = getNo(index);
		if(index == 0) {
			refPrimeiroNo = refPrimeiroNo.getRefNo();
		}else {
			No noAnterior = getNo(index-1);
			noAnterior.setRefNo(noRetorno.getRefNo());
		}
		return noRetorno.getConteudo();
	}
	
	@Override
	public String toString() {
		if(refPrimeiroNo==null)return "Lista vazia...";
		else {
			String mensagem = "Lista Encadeada: ";
			No noAux = refPrimeiroNo;
			for(int i = 0; i<size();i++) {
				mensagem += noAux.getConteudo() + "=>";
				noAux = noAux.getRefNo();
			}
			return mensagem;
		}
	}
	
	private void validaIndice(int index) {
		if(index>=size()) {
			throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + "nesta lista. Está lista so vai ate o indice " + (size()-1) + ".");
		}
	}
}
