package breno.dev.listas;

import breno.dev.nos.No;

public class ListaCircular {
	private No refPrimeiroNo;
	private int tamanhoLista;
	
	
	public ListaCircular() {
		this.refPrimeiroNo=null;
		tamanhoLista = 0;
	}
	public int size() {
		return tamanhoLista;
	}
	
	public boolean isEmpty() {
		return size()==0?true:false;
	}
	
	private No getNo(int index) {
		if(this.isEmpty()) {
			throw new IndexOutOfBoundsException("A lista está vazia");
		}if(index>=size()) {
			throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + "nesta lista. Está lista so vai ate o indice " + (size()-1) + ".");
		}
		No noAux = refPrimeiroNo;
		for(int i = 0; i<index;i++) {
			noAux = noAux.getRefNo();
		}
		return noAux;
		
	}
	
	public String get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	/***
	 * Adiciona na caula da lista, ou seja, como primeiro Nó
	 * @param novoNo
	 */
	public void add(No novoNo) {
		if(refPrimeiroNo==null)refPrimeiroNo=novoNo;
		else {
			novoNo.setRefNo(refPrimeiroNo);
			refPrimeiroNo=novoNo;
			No ultimoNo = getNo(size()-1);
			ultimoNo.setRefNo(refPrimeiroNo);
		}
		
		tamanhoLista++;
	}
	
	public void remove(int index) {
		if(refPrimeiroNo==null)throw new IndexOutOfBoundsException("LISTA VAZIA...");
		else if(index==0) refPrimeiroNo = refPrimeiroNo.getRefNo();
		else {
			No noRemovido = getNo(index);
			No noAnterior = getNo(index-1);
			noAnterior.setRefNo(noRemovido.getRefNo());
		}
		tamanhoLista--;
	}

	@Override
	public String toString() {
		if(refPrimeiroNo==null) {
			return "Lista vazia....";
		}else {
			String mensagem = "Lista Circular: \n";
			No noAux = refPrimeiroNo;
			for(int i = 0;i<size();i++) {
				mensagem += noAux.getConteudo() + " =>";
				noAux = noAux.getRefNo();
			}
			
			//mostra a execução da lista circular, ficando em um loop infinito, pois ela nunca tem fim....
			//caso queira tesar, basta comentar o metodo 'for' anterior e descomentar o while abaixo!
			/*while(true) { 
				if(noAux.getRefNo()!=null) {
					mensagem += noAux.getConteudo() + " =>";
					noAux = noAux.getRefNo();
					System.out.print(noAux.getConteudo() + " =>");
				}else {
					break;
				}
			}*/
			return mensagem;
		}
	}
	
	
}
