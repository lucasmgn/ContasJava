package desafiopolimofismoesobreposicao;

public class Conta {
	private String descricao;
	private double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	void cancelar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			
			System.out.println("Não pode cancelar uma conta que já foi paga: " + this.getDescricao() + ".");
			
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			
			System.out.println("Conta já cancelada: "+ this.getDescricao() + ".");
			
		} else {
			
			System.out.println("Cancelando conta " + this.getDescricao() + ".");
			
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return this.dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public SituacaoConta getSituacaoConta() {
		return this.situacaoConta;
	}
	
}
