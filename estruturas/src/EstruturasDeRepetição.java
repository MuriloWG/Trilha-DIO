public class EstruturasDeRepetição {
    public static void main(String[] args){

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("Fim do loop for");

        System.out.println("------------------------------------");


        //for no array java

        String alunos[] = {"Lucas", "Ana", "João", "Maria"};
        
        for(int i = 0; i < alunos.length; i++){
            System.out.println(alunos[i]);
        }
        System.out.println("fim alunos");
        
        //************OU************

        for(String aluno : alunos){
            System.out.println(aluno);
        }
    }
}
