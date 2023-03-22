package breno.dev.listas;

import breno.dev.nos.NoDuplo;

public class ListaDuplamenteEncadeada {
	private NoDuplo refPrimeiroNo;
	private NoDuplo refUltimoNo;
	private int tamanhoLista;

	public ListaDuplamenteEncadeada() {
		this.refPrimeiroNo = null;
		this.refUltimoNo = null;
		this.tamanhoLista = 0;
	}

	public int size() {
		return this.tamanhoLista;
	}

	private NoDuplo getNo(int index) {
		if (index >= tamanhoLista) {
			throw new IndexOutOfBoundsException("Nao existe conteudo no indice " + index
					+ " nesta lista. Esta lista so vai ate o indice " + (tamanhoLista - 1) + ".");
		}
		NoDuplo noAux = refPrimeiroNo;
		if (noAux == null)
			return null;
		else {
			for (int i = 0; i < index; i++) {
				noAux = noAux.getProximo();
			}
			return noAux;
		}

	}

	public String get(int index) {
		return this.getNo(index).getConteudo();
	}

	/**
	 * Adiciona o novoNo na ultima posição da lista.
	 * 
	 * @param novoNo
	 */
	public void add(NoDuplo novoNo) {
		if (refPrimeiroNo == null) {
			refPrimeiroNo = novoNo;
			refUltimoNo = novoNo;
		} else {
			novoNo.setAnterior(refUltimoNo);
			refUltimoNo.setProximo(novoNo);
			refUltimoNo = novoNo;
		}
		tamanhoLista++;
	}

	/**
	 * *Adiciona o novo NÓ antes do NÓ indicado pelo indice. Caso queira inserir na
	 * ultima posição, utilize o metodo add(), inserindo apenas o novo NÓ sem passar
	 * o parametro de indice.
	 * 
	 * @param novoNo
	 * @param index
	 **/
	public void add(NoDuplo novoNo, int index) {
		if (refPrimeiroNo == null) {
			refPrimeiroNo = novoNo;
			refUltimoNo = novoNo;
		} else {
			NoDuplo noAux = getNo(index);
			NoDuplo noAnterior = noAux.getAnterior();
			if (noAnterior == null) {
				refPrimeiroNo = novoNo;
			} else {
				noAnterior.setProximo(novoNo);
			}
			novoNo.setProximo(noAux);
			noAux.setAnterior(novoNo);
		}
		tamanhoLista++;
	}

	public void remove(int index) {
		if(size()==1) {
			this.refPrimeiroNo = null;
			this.refUltimoNo = null;
		}else {
			NoDuplo noSelecionado = getNo(index);
			NoDuplo noAnterior = noSelecionado.getAnterior();
			NoDuplo noPosterior = noSelecionado.getProximo();
			if (noAnterior == null) {
				refPrimeiroNo = noPosterior;
				refPrimeiroNo.setAnterior(null);
			} else if(noPosterior== null){
				refUltimoNo = noAnterior;
				noAnterior.setProximo(null);
			}
			else {
				noAnterior.setProximo(noPosterior);
				noPosterior.setAnterior(noAnterior);
			}
		}
		tamanhoLista--;
		}
	@Override
	public String toString() {
		if(size()==0)return "Lista Vazia....";
		else {
			String mensagem = "LISTA DUPLAMENTE ENCADEADA: \n";
			for (int i = 0; i < tamanhoLista; i++) {
				mensagem += this.get(i) + " <=> ";
			}
			mensagem += "null";
			return mensagem;
		}
	}

}
