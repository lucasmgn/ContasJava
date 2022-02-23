package desafiopolimofismoesobreposicao;

/*
 * Se voc� prestou aten��o nas aulas, n�o ser� muito dif�cil, mas voc� pode achar trabalhoso ou ficar um pouco confuso,
 *  pois precisar� trabalhar com 8 arquivos ao mesmo tempo, entre classes e enumera��es.
 *  O poder da orienta��o a objetos est� quando diversas classes est�o envolvidas, comunicando-se entre si. Ao final desse trabalho,
 *   voc� conseguir� entender ainda melhor sobre o que estamos falando.Este desafio � uma continua��o do anterior, sobre o sistema financeiro para sua empresa.
 *    Voc� pensou bastante e decidiu incluir o gerenciamento de contas a receber tamb�m, al�m de contas a pagar, que j� estava sendo desenvolvido.
 *    Voc� solicitou a especifica��o das classes para seu analista e recebeu o diagrama de classes abaixo:
 *    
 *    Antes de come�ar a codificar, � importante notar as principais mudan�as:

Foi criada uma nova classe chamada Pessoa e a classe Fornecedor herda dessa nova classe.
O atributo da classe Fornecedor foi transferido para a classe Pessoa.
Uma nova classe chamada Cliente foi criada. Essa classe herda Pessoa.
Foi criada uma nova classe chamada Conta e a classe ContaPagar herda dessa nova classe.
Os atributos, o m�todo cancelar() e o construtor padr�o da classe ContaPagar foram transferidos para a classe Conta.
Foi criada uma nova classe chamada ContaReceber que herda da classe Conta.
A classe ContaReceber possui o m�todo cancelar(). Isso � uma sobreposi��o ao m�todo de mesmo nome da classe Conta.
 Este m�todo deve verificar se a conta a receber possui valor maior que 50 mil,
  pois s� permitiremos o cancelamento de contas a receber para contas abaixo desse valor (vamos fingir que esse � um requisito do neg�cio).
 * */
public class Main {
	public static void main(String[] args) {
		
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Neg�cios Imobili�rios");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Jo�o");
		
		
		Cliente atacadista = new Cliente();
		atacadista.setNome("Tri�ngulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunica��es");
		
		
		ContaPagar contaPagar1 = new ContaPagar(mercado, null, 0, null);
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do m�s", 390d, "19/05/2012");
		
		
		ContaReceber contaReceber1 = new ContaReceber(telecom, null, 0, null);
		contaReceber1.setDescricao("Desenvolvimento de projeto de log�stica em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manuten��o em sistema de conta online", 
			53200d, "13/05/2012");
		
	
		contaPagar1.pagar();
		contaPagar2.cancelar();


		contaReceber1.receber();
		contaReceber2.cancelar();
	}
}
