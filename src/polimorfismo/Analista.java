package polimorfismo;

public class Analista extends Funcionario {

    public void quemSou() {
        final String quemSou = "Sou um Analista";
        System.out.println(quemSou);
    }

    public void quantoRecebo() {
        final String quantoRecebo = "Recebo mais que o Desenvolvedor mas menos que o Gerente";
        System.out.println(quantoRecebo);
    }

    public void oQueFaziaAntes() {
        final String oQueFaziaAntes = "Uma vez eu quis trabalhar com TI e aí virei Analista";
        System.out.println(oQueFaziaAntes);
    }
}
