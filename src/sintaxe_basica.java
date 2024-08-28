/**

Estudo em Java

Sintaxe básica: 

Variáveis:

    Estrutura básica:

    tipo nome = valor => int idade = 33
_______________________________________________________________________________________________________

    * Quando vamos atribuir uma variável como tipo "var", o java não permite que seja apenas declarada sem passarmos um valor:

    Exemplo: var nome;      // Não é permitido
    var nome = "Lucas";     // Modo Correto.
_______________________________________________________________________________________________________
    * Podemos declarar a variável e atribuir valor posteriormente.

    int idade;       
    idade = 33;       
_______________________________________________________________________________________________________
    * Variável local - dentro do código

    Precisa ser inializada antes de executada, o compilador java não permite que uma variável sem valor.

    public void exemplo(){

    int x;                 // declaracão
    x = 33;               // Atribuir valor
    System.out.println(x) // Uso da variável, se tentassemos executar sem atribuir valor daria erro.
    }
_______________________________________________________________________________________________________
    * Variável de instância

    Variável de instancia se não atribuido valor, assumem valores padrão: int será 0, booleano será false e referência de objetos serão Null.

    public class Exemplo {

    int numero;  // Variável de instância

    public void metodo() {
        System.out.println(numero);  // Imprime 0, valor padrão
    }
_______________________________________________________________________________________________________

    * Dentro do bloco de códigos

    Em if, for e while podemos criar a variável e atribui-las de acordo com as condicionais, porém só serão acessíveis dentro dos loops.

    if (condicao) {
    int y;
    y = 20;
    System.out.println(y); 
}
_______________________________________________________________________________________________________


Tipos primitivos

    São 8 tipos - Diferenciam pela faixa de representação

    4 tipos para inteiros: 

    byte - armazena 8 bits
    short - 16 bits
    int - 32 bits
    long - 64 bits

    Se utilizarmos o long para armazenar uma variável: long idade = 22, será uma disperdício para o compilador, já que ele armazenará um espaço de 64 bits para uma variável tão pequena.
    O ideal seria o byte idade = 22;

    4 outros tipos:

    boolean = atribuir valor true ou false
    char = armazena um caractere Unicode, ou seja, caracteres. Ex.: char letraFormula = "x" . Usa-se String para palavras, porém ela não é um tipo primitivo, ela é uma classe dentro do java
    double = armazena numeros com ponto fluente com mais números depois da virgula, ou seja, com mais precisão.
    float = armazena numeros com ponto fluente com menos precisão. Colocar um F no final para sinalizar que é do tipo float. Ex.: 22.50F, sem o F dará erro.
_______________________________________________________________________________________________________

Condicionais

    if, else if, else

    Identico às outras linguagens

    byte numero = 2
        if (numero == 2) {
        System.out.println("igual");
    } else if (numero < 2) {
        System.out.println("menor");
    } else {
        System.out.println("maior");
    }
_______________________________________________________________________________________________________

Arrays

    Sintaxe:

    Passar tipo dos dados, indicar que é um array com [] e dar o nome á variável.

    int[] numeros = {1, 2};

    Como usar o array - Modo estático:
    
        Antes de utilizar o array, é preciso inicializa-lo. Antes disso dará erro como por ex.: numeros[0] = 22;

        * Podemos inicializar diretamente colocando os valores dentro das chaves como padrão.
            int[] numeros = {1, 2, 3, 4, 5};  //Dessa forma o tamanho sempre será lengh 5.
            numeros[0] = 10                   // Também é possível subtituir o valor das posições.

        * Ou podemos atribuir o tamanho do array e inserir os valores depois.
            int[] numeros = new int[10];

            numeros.length   // Utilizamos este método para buscarmos o tabanho da lista.   
        
        Podemos aplicar a todos os tipos vistos anteriormente:

        int[] numeros = new int [10];
        String nomes = new String[5];
        boolean saoBrasileiros = boolean[6];

    Como usar o array - Modo dinâmico
    
        * Utilizamos o array List, que é uma classe dentro da biblioteca padrão do java que é o java.util.ArrayList. Nos ajuda a representar a lista dinâmica.
        Por isso devemos importar esta classe antes de chama-la.
        
        Como usar: 
            import java.util.ArrayList; // Primeiro chama a biblioteca

            Depois chamamos o arrayList e passamos como tipo o "Interger" que é outra classe nativa de java, assim como a classe String. Não podemos passar um tipo primitivo.

             ArrayList<Integer> numeros = new ArrayList<Interger>();   // Inicializado sem declararmos o tamanho da lista.
             numeros.add(12);
             numeros.add(22);
             numeros.add(32);
             numeros.remove(index: 0); // Podemos utilizar o método remover da classe arrayList, passando o index da lista (posição)
             numeros.get(2);    // Da mesma forma, podemos pegar o valor de alguma posição da lista.
             numeros.size();    // Pega o tamanho do array.

_______________________________________________________________________________________________________

Loops

    for, while

        For

        Primeiro declaramos a variável que estamos observando, passamos o valor que será comparado e depois inserir o que será feito, geralmente soma mais um)

        int idade = 10;
        for (var i = 0; i < idade; i++) {

        System.out.println("Olá " + i);
        
        }

        
        While

        Primeiro declaramos uma variável que será comparada e depois inserimos o que será feito.

        int idade = 10
        int i = 0;

        while (i < idade) {
            i++;  
            System.out.println("Olá " + i);
        }

_______________________________________________________________________________________________________

Casting

    Tranformar o valor de um tipo em outro tipo. 

    * Casting implicito:

        É quando transformamos um valor em outro apenas com as variáveis.
    
        int idadeInt = 10;
        double idadeDouble = idadeInt;     // O java já entende por inferencia que estamos transformando um valor int e double.
    
        idadeDouble = idadeInt;            // Porém o inverso não é verdadeiro, não podemos transformar o double em int. O int é como uma caixa pequena e o double uma caixa grande.
                                           // O int pequeno cabe dentro do double mas o double, caixa grande, não cabe no int, caixa pequena.
    
    * Casting explicito:

         Para castiarmos um valor forçadamente temos que passar como parâmetro o tipo que queremos transformar

            int idadeInt = 10;
            double idadeDouble = (double) idadeInt;   // Aqui estamos explicitamente transformando o int em double.

         O mesmo se aplica para as letras

            char letra = 'a';
            String nomeString = String.valueOf(letra);       // Neste caso precisamos utilizar o método auxiliar da String (valueOf)
            letra = nomeString.charAt(0);                    // Para transformar String em Char, usamos o método auxiliar charAt passando a possição que queremos.

         Tranformar letras em int

            String letra2 = String.valueOf(idadeInt);         // Utilizamos o método valueOf da classe String para transformar a letra em int

            int idadeInt = Integer.parseInt(letra2);          // Neste caso precisamos utilizar o método auxiliar parseInt da Integer para transformar String em int.




_______________________________________________________________________________________________________





    

    




**/
