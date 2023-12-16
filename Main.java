import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cadastro();
        verificarsequerdenovo();
    }
    public static void Cadastro(){
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> Senhas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastro");
       System.out.println("Digite seu nome");
       String nome= scan.nextLine();
       System.out.println("Digite sua senha");
       int Senha = scan.nextInt();

       if (nome != "" &&  Senha != 0000){
           System.out.println("Cadastro realizado!! Seja Bem-vindo " + nome );
           System.out.println("O seu nome e senha são: " + nome + "" + Senha);
       }else {
           System.out.println("Acho que esqueceu de alguma informação, favor corrigir");
       }
    nomes.add(nome);
    Senhas.add(Senha);
    System.out.println("Lista de nomes e senhas");
    for(int i=0; i < nomes.size(); i++){
     System.out.println("Nome: " + nomes + "   " + "Senha: "+Senha);
    }
       }

    public static void verificarsequerdenovo(){
        do {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Quer continuar?(Sim/Não)");
            String resposta = scan2.nextLine();
            if (resposta.equals("Sim") ){

                ArrayList<String> nomes = new ArrayList<>();
                ArrayList<Integer> Senhas = new ArrayList<>();
                Scanner scan = new Scanner(System.in);
                System.out.println("Cadastro");
                System.out.println("Digite seu nome");
                String nome= scan.nextLine();
                System.out.println("Digite sua senha");
                int Senha = scan.nextInt();

                if (nome != "" &&  Senha != 0000){
                    System.out.println("Cadastro realizado!! Seja Bem-vindo " + nome );
                    System.out.println("O seu nome e senha são: " + nome + "" + Senha);
                }else {
                    System.out.println("Acho que esqueceu de alguma informação, favor corrigir");
                }
                nomes.add(nome);
                Senhas.add(Senha);
                System.out.println("Lista de nomes e senhas");
                for(int i=0; i < nomes.size(); i++){
                    System.out.println("Nome: " + nomes + "   " + "Senha: "+Senha);
                }
            }else{
                System.out.println("Saindo! Até mais!");
                break;
            }//O operador == compara referências de objetos, não seus conteúdos.
            // Portanto, ao comparar strings, o método equals() deve ser utilizado para verificar se os conteúdos
            // são iguais.
        }while(true);

        }
    }
