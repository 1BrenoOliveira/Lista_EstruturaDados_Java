package breno.dev.nos;

public class No {
	private String conteudo;
	private No RefNo;
	
	public No() {
		
	}
	public No(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public No getRefNo() {
		return RefNo;
	}
	public void setRefNo(No refNo) {
		RefNo = refNo;
	}
	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
	
}
