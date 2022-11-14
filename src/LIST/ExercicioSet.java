package LIST;

import java.util.*;

public class ExercicioSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5,9.3, 5d,7d,0d,3.6));
        System.out.println(notas.toString());
        System.out.println("Confira se a nota 5.0 está no conjunto: "+notas.contains(5.0));
        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));
        System.out.println("Exiba a Soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma =0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("Exiba a Soma dos valores "+soma);
        System.out.println("Exiba a média dos valores "+(soma/notas.size()));
        System.out.println("Remova nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);
        System.out.println("remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while( iterator1.hasNext() ) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("apague todo o conjunto");
        notas.clear();
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto está vazio: " + notas3.isEmpty());












    }
}
