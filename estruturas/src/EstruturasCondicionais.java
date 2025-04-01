public class EstruturasCondicionais {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSaque = 15.0;

        if(valorSaque <= saldo){
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
        }
        else if(valorSaque > saldo || saldo == 0){
            System.out.println("Saldo insuficiente para realizar o saque.");
        }

        double nota = 7.0;

        String resultado = nota >= 7.0 ? "Aprovado" : nota >= 5.0 ? "Recuperação" : "Reprovado";
        System.out.println("Resultado: " + resultado);


        // Exemplo de switch case
        String sigla = "M";
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("Grande");
            }
            default:{
                System.out.println("INDEFINIDO");
            }

        }



    }
}
