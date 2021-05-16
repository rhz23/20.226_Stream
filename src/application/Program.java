package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = lista.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        //função de iteração, gera uma stream cujo o primeiro elemento é o apontado no primeiro parametro e no segundo parametro é colocado a função que gera os demais)
        Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
        //a função acima é infinita, para utilizar ela, é necessário definir o ponto de parada:
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //sequencia de fibonacci usando Stream:
        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(50).toArray()));


    }
}
