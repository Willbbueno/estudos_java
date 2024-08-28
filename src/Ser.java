
/*
  Visibilidade das classes
    Mesmo se eu criar outra classe, se ele estiver no mesmo arquivo da classe Main, teremos a mesma visibilidade para todas as classes que forem públicas ou protegidas.

    Quando o arquivo é executado a classe public static void main será o ponto de partida para o compilador, é a partir dela que o programa se inicia.


  Herança

    Quando uma classe herda atributos e métodos que mão são privados de uma classe. A subclasse herda da superclasse, podendo adicionar mais métodos e atributos.
    Para criarmos um herança precisamos pensar em qual abstração de alto nível fazer, por exemplo se vou criar uma classe carro, carro é uma tipo de transporte, como existem
    diversas características comuns entre carro e outros tipos de transport es, podemos criar uma classe transporte com atributos como modelo, roda, ano e etc.


 */

// Exemplo de herança: Crie uma classe chamada Ser, podemos criar a partir dela qualquer tipo de ser, no sentido de existencia. Pode ser humano ou não. Com isso temos a possibilidade
// de criar outras subclasses com características mais específicas.

public class Ser {

    String nome;
    int idade;

    void GetNome(String nome) {
        System.out.println("Nome: " + nome);
    }

    void GetIdade(int idade) {
        System.out.println("Idade: " + idade);

    }

    public Ser(String nome, int idade) { // Criamos um método construtor para classe ser e vamos utilizar nas subclasses.
        this.nome = nome;
        this.idade = idade;
    }

    public String saudacao(){
      return null;
    }
}


