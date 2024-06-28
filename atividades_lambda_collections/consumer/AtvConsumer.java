package atividades_lambda_collections.consumer;



import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AtvConsumer {
    public static void main(String[] args) {
        System.out.println("############ - ############ - ############");
        System.out.println("01- Imprimir todos os elementos de uma lista de strings.");
        List<String> pessoas = Arrays.asList("Raquel", "Paula", "Luana", "Patricia", "Elizabeth");
        Consumer<String> nomes = n -> System.out.println(n);
        pessoas.forEach(nomes);

        System.out.println("############ - ############ - ############");
        System.out.println("02- Converter todos os elementos de uma lista de strings para maiúsculas e imprimir.");
        List<String> carros = Arrays.asList("Onix", "Corolla", "Civic", "Gol", "HB20", "Fit");
        Consumer<String> paraMaiuscula = n -> System.out.println(n.toUpperCase());
        carros.forEach(paraMaiuscula);

        System.out.println("############ - ############ - ############");
        System.out.println("03- Adicionar \"!\" ao final de cada string em uma lista e imprimir.");
        List<String> listPessoas = Arrays.asList("Raquel", "Paula", "Luana", "Patricia", "Elizabeth");
        Consumer<String> adcSimbPessoa = n -> System.out.println(n + "!");
        listPessoas.forEach(adcSimbPessoa);

        System.out.println("############ - ############ - ############");
        System.out.println("04- Imprimir o quadrado de cada número em uma lista de inteiros:");
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        System.out.println("São Eles: " + numeros);
        Consumer<Integer> quadrado = n -> System.out.println(n*n);
        numeros.forEach(quadrado);

        System.out.println("############ - ############ - ############");
        System.out.println("05- Imprimir a concatenação de duas strings de uma lista.");
        List<String> pessoasApresentacao = Arrays.asList("Raquel", "Paula", "Luana", "Patricia", "Elizabeth");
        Consumer<String> apresentacao = n -> System.out.printf("Esta é a "+ n + " formada neste ano de 2024.");
        pessoasApresentacao.forEach(apresentacao);

        System.out.println("############ - ############ - ############");
        System.out.println("06- Imprimir o comprimento de cada string em uma lista.");
        List<String> carros2 = Arrays.asList("Onix", "Corolla", "Civic", "Gol", "HB20", "Fit");
        Consumer<String> tamanho = n -> System.out.printf(n +" {"+ String.valueOf(n.length())+ "} | ");
        carros.forEach(tamanho);

        System.out.println("############ - ############ - ############");
        System.out.println("07- Imprimir o cubo de cada número em uma lista de inteiros.");
        List<Integer> numerosDiferentes = Arrays.asList(20, 10, 40, 5, 15);
        System.out.println("numeros: " + numerosDiferentes);
        Consumer<Integer> oCubo = n -> System.out.println(Math.pow(n,3));
        numerosDiferentes.forEach(oCubo);




    }
}
