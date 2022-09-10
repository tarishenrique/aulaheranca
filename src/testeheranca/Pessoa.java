
package testeheranca;

public class Pessoa {
    protected String nome;
    private int idade;
    private char sexo;
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void printPessoa(){

        System.out.print(
            "Nome:" + nome +
            "\nIdade: " + idade + 
            "\nSexo: " + sexo );
    }

    public double fazerAniversario(){
        idade = idade + 1;
        return idade;
    }

    
}
