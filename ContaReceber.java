package desafiopolimofismoesobreposicao;

public class ContaReceber extends Conta {
	private Cliente cliente;
	
	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	public void receber() {
		
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			
			System.out.println("Conta j� Paga: " + this.getDescricao() + ".");
			
		}else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
			
			System.out.println("N�o pode receber uma conta que est� cancelada: " + this.getDescricao() + ".");
			
		}else {
			
			System.out.println("Recebendo conta " + this.getDescricao() + 
					" no valor de " + this.getValor() + " e vencimento em " + this.getDataVencimento() + 
					" do cliente " + this.getCliente().getNome() + ".");
			
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}
	
	public void cancelar() {
		
		if(this.getValor() > 5000d){
			System.out.println("Conta impossibilitada de cancelamento. " + " Dinheiro a receber: " + this.getDescricao());
		}else {
			super.cancelar();
		}
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	

}
