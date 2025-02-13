
package aula011;

public class Aula011 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); não funciona pois é abstrato a classe pessoa.
        /*Visitante v1 = new Visitante();
        v1.setNome("Jose");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(2222);
        a1.setCurso("Informatica");
        a1.setIdade(17);
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setNome("Jurandir");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
    }
    
}
