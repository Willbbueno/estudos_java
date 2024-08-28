public class Cachorro extends Ser { // Obrigatoriamente precisamos inserir o construtor da classe extendida, dentro da subclasse. Ou seja, construtor de Ser dentro da subclasse Cachorro.
  
    String nomeDono;

    public Cachorro (String nome, int idade, String nomeDono) { // Aqui passamos os argumentos necessários para a criação de um cachorro.
        super(nome, idade); // Chamamos o construtor da superclasse passando os argumentos.
    
        this.nomeDono = nomeDono; 

    }
    
    @Override

    public String saudacao(){
        return "Au, au! Meu nome é " + this.nome + " e eu sou um cachorro."; // Sobrescrevemos o método da superclasse.
    }
}
