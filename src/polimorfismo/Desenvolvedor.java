package polimorfismo;

public class Desenvolvedor extends Funcionario {

    public void quemSou() {
        final String quemSou = "Sou um Desenvolvedor";
        System.out.println(quemSou);
    }

    public void quantoRecebo() {
        final String quantoRecebo = "Sou sempre o mais pobre, não interessa a empresa";
        System.out.println(quantoRecebo);
    }

    public void oQueFaziaAntes() {
        final String oQueFaziaAntes = "Nasci pra isso";
        System.out.println(oQueFaziaAntes);
    }
}
