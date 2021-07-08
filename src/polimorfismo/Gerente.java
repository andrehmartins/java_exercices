package polimorfismo;

public class Gerente extends Funcionario {

    public void quemSou() {
        final String quemSou = "Sou um Gerente";
        System.out.println(quemSou);
    }

    public void quantoRecebo() {
        final String quantoRecebo = "Recebo mais que o Developer";
        System.out.println(quantoRecebo);
    }

    public void oQueFaziaAntes() {
        final String oQueFaziaAntes = "Eu não programava bem e nem analisava bem por isso sobrou virar Gerente";
        System.out.println(oQueFaziaAntes);
    }
}
