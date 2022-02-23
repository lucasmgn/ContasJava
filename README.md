# ContasJava!

Se você prestou atenção nas aulas, não será muito difícil, mas você pode achar trabalhoso ou ficar um pouco confuso,
pois precisará trabalhar com 8 arquivos ao mesmo tempo, entre classes e enumerações.
O poder da orientação a objetos está quando diversas classes estão envolvidas, comunicando-se entre si. Ao final desse trabalho,
você conseguirá entender ainda melhor sobre o que estamos falando.Este desafio é uma continuação do anterior, sobre o sistema financeiro para sua empresa.
Você pensou bastante e decidiu incluir o gerenciamento de contas a receber também, além de contas a pagar, que já estava sendo desenvolvido.
Você solicitou a especificação das classes para seu analista e recebeu o diagrama de classes abaixo:
    
 Antes de começar a codificar, é importante notar as principais mudanças:

Foi criada uma nova classe chamada Pessoa e a classe Fornecedor herda dessa nova classe.
O atributo da classe Fornecedor foi transferido para a classe Pessoa.
Uma nova classe chamada Cliente foi criada. Essa classe herda Pessoa.
Foi criada uma nova classe chamada Conta e a classe ContaPagar herda dessa nova classe.
Os atributos, o método cancelar() e o construtor padrão da classe ContaPagar foram transferidos para a classe Conta.
Foi criada uma nova classe chamada ContaReceber que herda da classe Conta.
A classe ContaReceber possui o método cancelar(). Isso é uma sobreposição ao método de mesmo nome da classe Conta.
Este método deve verificar se a conta a receber possui valor maior que 50 mil,
pois só permitiremos o cancelamento de contas a receber para contas abaixo desse valor (vamos fingir que esse é um requisito do negócio).

https://user-images.githubusercontent.com/81782608/155394697-ae300911-966c-42f1-ad32-27199e12d659.jpg)
