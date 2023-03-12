

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.matricula = 1;
        aluno.nome = "Douglas Groff";
        aluno.telefone = "6699999-9999";
        aluno.cpf = "000.000.000-00";
        aluno.rg = "0000000-0";
        aluno.data_nascimento = "15/07/1996";
        aluno.endereco = "Rua dos martirios 123";
        aluno.bairro = "Jardim das lagoas";
        aluno.nome_mae = " Nome da mãe";
        aluno.nome_pai = " Nome do pai";
        aluno.cadCompleto();
        aluno.dizerMatricula();
        System.out.println(aluno.dizerMatricula());
        System.out.println(aluno.cadCompleto());
    }
}
