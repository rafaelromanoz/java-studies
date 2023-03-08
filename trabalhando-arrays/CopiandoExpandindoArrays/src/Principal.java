import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        int[] numerosDeJogo1 = {25, 11, 7, 6, 8, 44};

        int[] numerosDeJogo2 = Arrays.copyOf(numerosDeJogo1, numerosDeJogo1.length + 1);

        System.out.println(Arrays.toString((numerosDeJogo2)));

        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";
        turmaB.alunos = new Aluno[3];
        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "Rafael";
        turmaB.alunos[0].idade = 3;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 4;

        turmaB.alunos[1] = aluno1;
        turmaB.adicionarAluno(aluno1);
        turmaB.imprimirListaDeAlunos();
    }
}
