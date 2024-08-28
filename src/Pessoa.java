public class Pessoa extends Ser { // Utilizamos a palavra reservadas Extends para extender a classe Ser.

    String sobrenome;

    public Pessoa(String nome, int idade, String sobrenome) {

        super(nome, idade); // Chamamos o construtor da superclasse passando os argumentos.
        this.sobrenome = sobrenome;
    }

    @Override

    public String saudacao(){
        return "Olá meu nome é " + this.nome + " " + this.sobrenome + ".";
    }

}