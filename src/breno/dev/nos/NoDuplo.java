package breno.dev.nos;

public class NoDuplo {
	private String conteudo;
	private NoDuplo proximo;
	private NoDuplo anterior;
	public NoDuplo() {
		this.proximo = null;
		this.anterior = null;
	}
	public NoDuplo(String conteudo) {
		this.proximo = null;
		this.anterior = null;
		this.conteudo = conteudo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public NoDuplo getProximo() {
		return proximo;
	}
	public void setProximo(NoDuplo proximo) {
		this.proximo = proximo;
	}
	public NoDuplo getAnterior() {
		return anterior;
	}
	public void setAnterior(NoDuplo anterior) {
		this.anterior = anterior;
	}
	@Override
	public String toString() {
		return "NoDuplo [conteudo=" + conteudo + "]";
	}
	
}
