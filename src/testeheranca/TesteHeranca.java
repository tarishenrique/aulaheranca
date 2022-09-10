package testeheranca;
public class TesteHeranca {
    public static void main(String[] args) {
        
        Aluno a = new Aluno();
        a.setNome("Pedro");
        a.setIdade(20);
        a.setSexo('M');
        a.setMatricula(1235688);
        a.setCurso("Informática");

        Professor p1 = new Professor();
        p1.setNome("Zegui");
        p1.setIdade(25);
        p1.setSexo('M');
        p1.setEspecialidade("Informatica");
        p1.setSalario(10000);

        Funcionario f1 = new Funcionario();
        f1.setNome("José da Silva");
        f1.setIdade(60);
        f1.setSexo('M');
        f1.setSetor("Portaria");
        f1.setTrabalhando(true);

        a.printAluno();
        System.out.println("Idade atualizada: "+ a.fazerAniversario()+ "\n");

        p1.printProfessor();
        f1.printFuncionario();


    }
    
}
