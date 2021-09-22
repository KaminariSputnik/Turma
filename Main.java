import java.util.Scanner;

/*1º - criar aluno ok
   2º - listar todos os alunos ok
   3º - ler as informações de um aluno específico
   4º - deletar um aluno específico
   5º - alterar a idade de um aluno
    */

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] aluno = new Aluno[100];
        int qtd = 0;
        int escolha;
        int matricula;

        do {
            System.out.println("1 - Criar aluno\n2 - Listar aluno\n3 - Ler as informações de um aluno específico.\n" +
                    "4 - Deletar aluno.\n5 - Alterar idade do aluno.\n0 - Sair.");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                case 1:
                    System.out.println("Criar aluno: ");
                    Aluno.criarAluno(qtd);
                    qtd = Aluno.retornaQtd(qtd);
                    System.out.println("Aluno criado.");
                    break;
                case 2:
                    System.out.println("Listar aluno: ");
                    Aluno.listarAlunos();
                    break;
                case 3:
                    System.out.println("Ler as informações de um aluno: ");
                    System.out.println("Digite a matrícula: ");
                    matricula = scanner.nextInt();
                    Aluno.exibirDados(matricula);
                    break;
                case 4:
                    System.out.println("Deletar um aluno: ");
                    System.out.println("Digite a matrícula: ");
                    matricula = scanner.nextInt();
                    Aluno.deletarAluno(matricula, qtd);
                    System.out.println("Aluno deletado.");
                    break;
                case 5:
                    System.out.println("Alterar idade de um aluno: ");
                    System.out.println("Digite a matrícula: ");
                    matricula = scanner.nextInt();
                    Aluno.alterarIdade(matricula);
                    System.out.println("Idade alterada");
                    break;
                default:
                    System.out.println("Comando não reconhecido. Digite novamente. ");
                    break;
            }
        } while(escolha != 0);
    }




}