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

    Passar tipos dos dados, indicar que é um array com [] e dar o nome á variável.

    int[] numeros = {1, 2, 3, 4, 5};

    




**/


public class Main {

    public static void main(String[] args){
        var nome = "William";
        
    

    }
}
