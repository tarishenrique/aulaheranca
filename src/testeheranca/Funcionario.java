package testeheranca;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void printFuncionario(){
        
        printPessoa();
        System.out.println(
            "\nSetor: " + setor
        );

        if (trabalhando){
            System.out.println("O funcionário está trabalhando\n");
        } else {
            System.out.println("O funcionério não está trabalhando\n");
        }
    }

    

}
