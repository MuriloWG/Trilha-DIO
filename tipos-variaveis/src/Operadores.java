public class Operadores {
    
    public static void main(String[] args){
         // Operadores em Java

        // Operadores de Atribuição
        int a = 10; // Atribui o valor 10 à variável 'a'
        a += 5; // Adiciona 5 ao valor de 'a' (a = a + 5)
        a -= 3; // Subtrai 3 do valor de 'a' (a = a - 3)
        a *= 2; // Multiplica o valor de 'a' por 2 (a = a * 2)
        a /= 4; // Divide o valor de 'a' por 4 (a = a / 4)
        a %= 3; // Calcula o resto da divisão de 'a' por 3 (a = a % 3)

        // Operadores de Comparação
        int b = 10, c = 20;
        boolean isEqual = b == c; // Verifica se 'b' é igual a 'c'
        boolean isNotEqual = b != c; // Verifica se 'b' é diferente de 'c'
        boolean isGreater = b > c; // Verifica se 'b' é maior que 'c'
        boolean isLess = b < c; // Verifica se 'b' é menor que 'c'
        boolean isGreaterOrEqual = b >= c; // Verifica se 'b' é maior ou igual a 'c'
        boolean isLessOrEqual = b <= c; // Verifica se 'b' é menor ou igual a 'c'

        // Operadores Lógicos
        boolean cond1 = true, cond2 = false;
        boolean andResult = cond1 && cond2; // Retorna true se ambas as condições forem verdadeiras
        boolean orResult = cond1 || cond2; // Retorna true se pelo menos uma das condições for verdadeira
        boolean notResult = !cond1; // Inverte o valor lógico de 'cond1'

        // Operadores Aritméticos
        int x = 15, y = 4;
        int sum = x + y; // Soma: 15 + 4 = 19
        int difference = x - y; // Subtração: 15 - 4 = 11
        int product = x * y; // Multiplicação: 15 * 4 = 60
        int quotient = x / y; // Divisão: 15 / 4 = 3 (divisão inteira)
        int remainder = x % y; // Resto da divisão: 15 % 4 = 3

        // Exibindo os resultados
        System.out.println("Operadores de Atribuição:");
        System.out.println("a = " + a);

        System.out.println("\nOperadores de Comparação:");
        System.out.println("b == c: " + isEqual);
        System.out.println("b != c: " + isNotEqual);
        System.out.println("b > c: " + isGreater);
        System.out.println("b < c: " + isLess);
        System.out.println("b >= c: " + isGreaterOrEqual);
        System.out.println("b <= c: " + isLessOrEqual);

        System.out.println("\nOperadores Lógicos:");
        System.out.println("cond1 && cond2: " + andResult);
        System.out.println("cond1 || cond2: " + orResult);
        System.out.println("!cond1: " + notResult);

        System.out.println("\nOperadores Aritméticos:");
        System.out.println("x + y: " + sum);
        System.out.println("x - y: " + difference);
        System.out.println("x * y: " + product);
        System.out.println("x / y: " + quotient);
        System.out.println("x % y: " + remainder);
    }
}
