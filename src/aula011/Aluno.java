
package aula011;

public class Aluno extends Pessoa {
    private int Matricula;
    private String curso;
    public  void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
