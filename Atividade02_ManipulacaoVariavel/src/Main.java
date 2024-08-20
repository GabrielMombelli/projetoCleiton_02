public class Main {
    public static void main(String[] args) {
        String nome = "Gabriel";
        int idade = 15;
        double salario = 1500.00;
        int mesesTrabalhados = 4;
        int produtosComprados = 7;
        double salarioAnualBru = 1500.00 * 12;
        double valorGastoProdutos = 4500.00;

        double dinheiroGanho = salario * mesesTrabalhados;
        double salarioAnualLiq = salarioAnualBru - 500;
        double mediaPrecosProdutos = valorGastoProdutos / produtosComprados;


        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(mesesTrabalhados);
        System.out.println(produtosComprados);
        System.out.println(salarioAnualBru);
        System.out.println(valorGastoProdutos);
        System.out.println(salarioAnualLiq);
        System.out.println(mediaPrecosProdutos);
        System.out.println(dinheiroGanho);
        System.out.println(nome + " o seu salário anual é: " + salarioAnualLiq);
        

    }
}