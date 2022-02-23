package desafiopolimofismoesobreposicao;


public class ContaPagar extends Conta{

	private Fornecedor fornecedor;
	
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	void pagar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			
			System.out.println("N�o pode pagar uma conta que j� est� paga: " + this.getDescricao() + ".");
			
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			
			System.out.println("N�o pode pagar uma conta que est� cancelada: " + this.getDescricao() + ".");
		} else {
			
			System.out.println("Pagando conta " + this.getDescricao() + " no valor de " + this.getValor() +
					" e vencimento em " + this.getDataVencimento() 
				+ " do fornecedor " + this.getFornecedor().getNome() + ".");
				
			// altera situa��o da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
