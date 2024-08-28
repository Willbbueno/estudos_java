/*
 
Programação Orientada a Objetos

Objetivo: Desenvolver programas de maneira modular, reutilizável e escalável.
 
Classes: Modela os objetos através dos atributos e comportamentos.

*/

public class poo {

    /*
     * Aqui podemos criar os atributos para os objetos, ou seja, suas variáveis.
     * Podemos referenciar estas variáveis em todo o escopo da classe poo. Estes
     * atributos vão pertencer às instâncias dessa classe, ou seja, os objetos
     * criados através da classe poo poderão utilizar estas variáveis.
     * 
     * Por exemplo, podemos criar o atributo String nome e referenciar esta variável
     * em todos os métodos da nossa classe poo, menos as classes statics. As classes
     * statics só "enxergam" classes statics.
     */

    String nome; // "String nome" pertece às instâncias da classe poo (seus objetos). Não poderá
                 // ser utilizada por exemplo na classe public static void main(){ }.
    String carro;
    static String nomeEstatico;

    public static void main(String[] args) {
        poo nome1 = new poo(); // Para utilizarmos a variável String nome precisamos criar um objeto da classe
                               // poo para dai poder acessar seus atributos.
        nome1.nome = "William"; // Desta forma, criamos um objeto chamado nome1 e passamos como atributo a
                                // variável nome. Agora, podemos usar a variável nome em outros métodos da
                                // classe poo. Todos os objetos criados possuem uma cópia dos atributos não
                                // estáticos.
        poo nome2 = new poo();
        nome2.nome = "Bernardo"; // Criamos outro objeto chamando o atributo nome e atribuindo um outro nome.

        System.out.println(nome2.nome); // Lembrar da sintaxe para imprimir o objeto ("nome do objeto".classe) ou seja,
                                        // nome2.nome.
        System.out.println(nome1.nome);

        // Exemplo de uso da herança através da classe ser e classe pessoa:
        Ser meuSerAnimal = new Cachorro("Miudo", 15, "Genezi");
        meuSerAnimal.GetNome("Miudo"); // Criamos um objeto chamado meuSerAnimal dentro da Main(poo) utilizando seu
                                       // método getNome.
        System.out.println(meuSerAnimal.saudacao());

        Pessoa personagem = new Pessoa("Zebelus", 33, "Bueno");
        personagem.GetNome("Zebelus"); // Criamos um objeto chamado personagem através da classe pessoa e utilizamos
                                       // método getNome da superclasse Ser
        System.out.println(personagem.saudacao());

    }

    static void teste() {

        // Criei esta classe só para testar na classe declaraNome.
    }

    void declaraNome() { // Criamos um método vazio que declara o nome.

        nome = "Ingrid"; // Declaramos nome como William, isso foi possível graças à variável "global
                         // String nome da nossa classe poo, criada no inicio da classe.

        System.out.println(nomeEstatico);// Este exemplo é para mostrar que podemos chamar uma variável estática da
                                         // instância poo.
        poo.teste(); // Também podemos chamar o método teste mesmo sendo estático, sem necessidade
                     // criar uma instância.

    }

    String getNome() { // Como o método getNome() não é static, podemos utilizar String nome sem
                       // problemas.
        return nome;
    }

    public poo(String carro, String nome) { // Podemos criar construtores dentro da classe Main (poo) e
                                            // sobrecarrega-los, ou seja, criar vários construtures iguais para
        this.carro = carro; // que assim podessamos criar objetos sem precisar passar todos os argumentos,
                            // isso é útil caso não tenhamos ainda todos os parâmetros conhecidos
                            // previamente.
        this.carro = carro;
        this.nome = nome;

    }

    public poo(String nome) {
        this.nome = nome;

    }

    public poo() {

    }
}

/*
 * Modificadores de acesso
 * 
 * Determinam o nível de visibilidade das classes, atributos e métodos.
 * É uma palavra reservada que colocamos antes da declaração.
 * 
 * Public - sinaliza que a classe, método ou atributo é visível para todas as
 * outras classes do programa.
 * Podemos instanciar atributos e métodos da classe Main em qualquer outra
 * classe.
 * Quando criamos uma classe public, só será possível para a classe Main, não
 * podemos ter duas classes pública no mesmo arquivo e o nome da classe pública
 * deverá ser o mesmo nome do arquivo.
 * 
 * Private - sinaliza que a classe, método ou atributo é visível apenas para a
 * própria classe. Não é possível utilizar esta variável ou método em outras
 * classes.
 * Se tentarmos instanciar ocorrerá erro.
 * 
 * Protected - sinaliza que a classe, método ou atributo é vísivel apenas para
 * propriedades do mesmo pacote, ou seja, classes de outros pacotes não podem
 * acessar seu conteúdo. Quando utilizamos
 * por exemplo um pacote importado, esse pacote com certeza terá classes e
 * atributos visíveis somente dentro dela.
 * 
 */
