import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class EstruturasExepcionais {
    
    static String verificaCpf(String cpf) throws CpfInvalidoException{
        if(cpf.length() != 14){
             throw new CpfInvalidoException();
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            

            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Qual a sua altura?");
            double altura = scanner.nextDouble();

            System.out.println("O meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + altura + " metros.");
        }
        catch(InputMismatchException e){
            System.err.println("Os campos idades e alturas devem ser numéricos");
        }

        try{
            System.out.println("Digite o seu CPF:");
           String cpf = verificaCpf(scanner.next());
           System.out.println("Cpf valido");
        }
        catch(CpfInvalidoException e){
            System.out.println("Cpf invalido xxx.xxx.xxx-xx");
        
        }
        scanner.close();
    }
}


