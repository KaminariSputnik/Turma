import java.util.Scanner;
    /*1º - criar aluno ok
    2º - listar todos os alunos
    3º - ler as informações de um aluno específico
    4º - deletar um aluno específico
    5º - alterar a idade de um aluno
     */

    public class Aluno{
        private String nome;
        private int idade;
        private int matricula;

        public Aluno(String nome, int idade, int matricula){
            this.nome = nome;
            this.idade = idade;
            this.matricula = matricula;
        }

        public static Aluno[] aluno = new Aluno[100];

        public static void criarAluno(int qtd){
            Scanner scanner = new Scanner(System.in);
            String nome;
            int idade, matricula;

            System.out.println("Digite o nome: ");
            nome = scanner.nextLine();

            System.out.println("Digite a idade: ");
            idade = scanner.nextInt();

            System.out.println("Digite a matrícula: ");
            matricula = scanner.nextInt();

            for (int i = 0; i < qtd; i++){
                if(aluno[i].matricula == matricula && aluno[0] != null){
                    while(matricula == aluno[i].matricula){
                        System.out.println("Matrícula já utilizada. Digite novamente: ");
                        matricula = scanner.nextInt();
                    }
                }
            }

            aluno[qtd] = new Aluno(nome, idade, matricula);
            retornaQtd(qtd);

        }

        public static int retornaQtd(int qtd) {
            qtd++;
            return qtd;
        }

        public static void listarAlunos(){
            for (int i = 0; i < aluno.length; i++){
                if(aluno[i] != null)
                    System.out.println(aluno[i].nome);
            }
        }

        public static void exibirDados(int matricula){
            boolean flag = false;
            for (int i = 0; i < aluno.length - 1; i++){
                if (aluno[i] != null){
                    if(aluno[i].matricula == matricula){
                        System.out.println("Nome: " + aluno[i].nome);
                        System.out.println("Idade: " + aluno[i].idade);
                        System.out.println("Matrícula: " + aluno[i].matricula);
                        flag = true;
                    } if (i == aluno.length-1 && !flag){
                        System.out.println("Não foi encontrado nenhum aluno com essa matrícula.");
                    }
                }
            }
        }

        public static int deletarAluno(int matricula, int qtd){
            boolean flag = false;
            for (int i = 0; i < qtd; i++){
                if(aluno[i].matricula == matricula){
                    flag = true;
                    for (int a = i; a < qtd - 1; a++){
                        aluno[a] = aluno[a+1];
                    }
                }
                else if(i == qtd - 1 && flag == false){
                    System.out.println("Não foi encontrado nenhum aluno com essa matrícula. ");
                }
            }
            if (flag == true){
                aluno[qtd-1] = null;
                qtd = qtd--;
            }
            return qtd;
        }

        public static void alterarIdade(int matricula){
            Scanner scanner = new Scanner(System.in);
            boolean flag = false;
            for (int i = 0; i< aluno.length; i++){

                if (aluno[i] != null){
                    if (aluno[i].matricula == matricula){
                        flag = true;
                        System.out.println("Digite a nova idade: ");
                        int nova_idade = scanner.nextInt();
                        aluno[i].idade = nova_idade;
                    }
                }

                if (i == aluno.length-1 && !flag){
                    System.out.println("Não foi encontrado nenhum aluno com essa matrícula. ");
                }
            }

        }
    }