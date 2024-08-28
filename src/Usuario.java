 /*

    Construtor

        É um método especial usado para criar objetos de uma classe. Sempre que um objeto for criado, chamará o método construtor.
        Ele é usado para facilitar a criação de objetos que precisam de variáveis de instância para ser criado, ou seja, irá garantir que o objeto seja criado com os parâmetros desejados.


  */



public class Usuario { 

  String nome;
  int idade;
  String sexo;
    
  public Usuario (String nome, int idade, String sexo){
    
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
            
    Usuario usuario1 = new Usuario("Joaquina", 25, "Feminino"); // Dois objetos criados a partir da classe usuario, os constrututores pedem para que passemos os atributos.
    Usuario usuario2 = new Usuario("João", 30, "Masculino");

    System.out.println("Usuario(a) " + usuario1.nome + " tem " + usuario1.idade + " anos de idade e é do sexo " + usuario1.sexo + ".");
    System.out.println("Usuario(a) " + usuario2.nome + " tem " + usuario2.idade + " anos de idade e é do sexo " + usuario2.sexo + ".");
        
    //Poo meuMain = new Poo(); // Mesmo em outro arquivo, ainda podemos referenciar a classe principal poo (Main)
    //System.out.println(nome);// Os atributos da classe poo estarão viziveis.
       
  }
}
    
