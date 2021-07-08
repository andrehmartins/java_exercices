import polimorfismo.Analista;
import polimorfismo.Desenvolvedor;
import polimorfismo.Funcionario;
import polimorfismo.Gerente;

public class Polimorfismo {

    public static void main(String[] args) {
	// write your code here
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        Analista analista = new Analista();
        Desenvolvedor desenvolvedor = new Desenvolvedor();

        funcionario.quemSou();
        funcionario.quantoRecebo();
        funcionario.oQueFaziaAntes();

        gerente.quemSou();
        gerente.quantoRecebo();
        gerente.oQueFaziaAntes();

        analista.quemSou();
        analista.quantoRecebo();
        analista.oQueFaziaAntes();

        desenvolvedor.quemSou();
        desenvolvedor.quantoRecebo();
        desenvolvedor.oQueFaziaAntes();
    }
}
