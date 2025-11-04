import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("===Questionario de Matematica===");
        System.out.println("Responda:");
          System.out.println("Questão 1: 3 + 7 é?");
            var Q1 = scanner.nextInt();
          System.out.println("Questão 2: 18 - 4 é?");
            var Q2 = scanner.nextInt();
          System.out.println("Questão 3: 8 * 9 é?");
            var Q3 = scanner.nextInt();
          System.out.println("Questão 4: 4/2 é?");
            var Q4 = scanner.nextInt();
          System.out.println("Questão 5: Se a pizza foi dividida em três fatias e uma foi retirada, restam duas fatias, A Fração retirada é?");
           System.out.println("A) 2/3, B) 1/3, C) 3/1, D) 3/2, Digite a Letra:");
            scanner.nextLine();
            String Q5 =  scanner.nextLine().toUpperCase();

        var Nota = 0;


        if (Q1 == 10){
            System.out.println("\nQ1:Certa");
            Nota++;
        }else{
            System.out.println("\nQ1:Errada");}
        if (Q2 == 14){
            System.out.println("Q2:Certa");
            Nota++;
        }else{
            System.out.println("Q2:Errada");}
        if (Q3 == 72){
            System.out.println("Q3:Certa");
            Nota++;
        }else{
            System.out.println("Q3:Errada");}
        if (Q4 == 2){
            System.out.println("Q4:Certa");
            Nota++;
        }else{
            System.out.println("Q4:Errada");}
        if (Q5.equals ("A")){
            System.out.println("Q5:Certa");
            Nota++;
        }else{
            System.out.println("Q5:Errada");}



        System.out.printf("\nNOTA: %s", Nota);


    }
}