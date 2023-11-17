/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * public class CalculadoraTestes1 {: Isso define uma classe chamada CalculadoraTestes1.
 * O modificador public indica que a classe pode ser acessada de qualquer lugar.
 * O nome da classe começa com uma letra maiúscula por convenção em Java.
 */
public class CalculadoraTestes1 {
    
    /**
     * 
     * public static void main(String[] args) {: Este é o método principal (main) que é o ponto de entrada para a execução do programa Java. 
     * Ele é público (public), estático (static), não retorna nenhum valor (void), e aceita um array de strings como argumento chamado args.
     * Os parâmetros String[] args são usados para fornecer argumentos da linha de comando ao programa.
     */
    
    public static void main (String [] args){
        
        /**
        * Calculadora calc: Declara uma variável chamada calc do tipo Calculadora.
        * Isso significa que calc pode armazenar uma referência para um objeto do tipo Calculadora.
        * No Java, a declaração de variável segue o padrão: <Tipo> <NomeDaVariavel>.
        * 
        * new Calculadora(): Cria uma nova instância (objeto) da classe Calculadora.
        * A palavra-chave new é usada para alocar memória para um novo objeto da classe especificada (Calculadora neste caso).
        * O construtor padrão da classe Calculadora é chamado para inicializar o objeto recém-criado.
        */
        Calculadora calc = new Calculadora();
        
        
        /**
        * Realiza a adição de dois números inteiros.
        * 
        * int somar: Declara uma variável chamada somar do tipo int (inteiro) e atribui a ela o valor retornado pelo método soma.
        * O tipo int é usado porque a adição de dois números inteiros resulta em um número inteiro.
        * 
        * calc.soma(10, 10): Chama o método soma na instância da classe Calculadora associada à variável calc, passando os argumentos 10 e 10.
        * O método soma realiza uma adição dos dois valores e retorna o resultado. 
        */
        int somar = calc.soma(10,10);
        
        /**
         * System.out.println(somar): Imprime o valor armazenado na variável somar no console. O método println é usado para imprimir uma linha no console.
         */
        System.out.println(somar);
       
        
        
        /**
        * Realiza a subtração de dois números inteiros.
        *
        * int subtrair: Declara uma variável chamada subtrair do tipo int (inteiro) e atribui a ela o valor retornado pelo método subt.
        * O tipo int é usado porque a subtração de dois números inteiros resulta em um número inteiro.
        * 
        * calc.subt(10, 10): Chama o método subt na instância da classe Calculadora associada à variável calc, passando os argumentos 10 e 10.
        * O método subt realiza uma subtração dos dois valores e retorna o resultado.
        */
        int subtrair = calc.subt(10,10);
        
        /**
        * System.out.println(subtrair): Imprime o valor armazenado na variável subtrair no console. O método println é usado para imprimir uma linha no console.
        */
        System.out.println(subtrair);
        
        
        
        
        
        /**
        * Realiza a divisão de dois números inteiros.
        *
        * int dividir: Declara uma variável chamada dividir do tipo int (inteiro) e atribui a ela o valor retornado pelo método divi.
        * O tipo int é usado porque a divisão de dois números inteiros resulta em um número inteiro.
        * 
        * calc.divi(10, 10): Chama o método divi na instância da classe Calculadora associada à variável calc, passando os argumentos 10 e 10.
        * O método divi realiza uma divisão dos dois valores e retorna o resultado.
        * 
        * 
        * Sobre o método divi da classe Calculadora:
        * 
        * public int divi(int a, int b): Isso declara um método público chamado divi que aceita dois parâmetros do tipo int (a e b) e retorna um resultado do tipo int.
        * if (b == 0) { throw new ArithmeticException("Não é possível dividir por zero"); }: Esta é uma verificação condicional. 
        * 
        * Se o segundo argumento (b) for igual a zero, o código dentro do bloco if será executado.
        * Neste caso, lança uma exceção do tipo ArithmeticException com a mensagem "Não é possível dividir por zero".
        * Isso é uma prática comum para evitar divisões por zero, que levariam a um erro em tempo de execução.
        * 
        * return a / b;: Se o segundo argumento (b) não for zero, então a divisão de a por b é realizada e o resultado é retornado.
        * Lembre-se de que, se b fosse zero, a execução nunca chegaria a esta linha devido à exceção lançada anteriormente.
        */
        int dividir = calc.divi(10,10);
        
        /**
         * System.out.println(dividir): Imprime o valor armazenado na variável subtrair no console. O método println é usado para imprimir uma linha no console.
         */
        System.out.println(dividir);
        
        
        
        
        
        /**
        * Realiza a multiplicação de dois números inteiros.
        *
        * int multiplicar: Declara uma variável chamada multiplicar do tipo int (inteiro) e atribui a ela o valor retornado pelo método mult. 
        * O tipo int é usado porque a multiplicação de dois números inteiros resulta em um número inteiro.
        * 
        * calc.mult(10, 10): Chama o método mult na instância da classe Calculadora associada à variável calc, passando os argumentos 10 e 10. 
        * O método mult provavelmente realiza uma multiplicação dos dois valores e retorna o resultado.
        */
        int multiplicar = calc.mult(10,10);
        /**
         * System.out.println(multiplicar): Imprime o valor armazenado na variável subtrair no console. O método println é usado para imprimir uma linha no console.
         */
        System.out.println(multiplicar);
        
        
    }
}
