package ExerMap;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectvos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares.toString());
        System.out.println("Confira se a tucson esta no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: " +carrosPopulares.get("uno"));
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("Exiba os consumo dos carros");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for(Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoMaisEficiente))modeloMaisEficiente = entry.getKey();


        }
        System.out.println("exiba o modelo mais eficiente "+ modeloMaisEficiente+" - "+(consumoMaisEficiente));
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoMenosEficiente))modeloMenosEficiente = entry.getKey();

        }
        System.out.println("exiba o modelo menos eficiente "+ modeloMenosEficiente+ " - " +(consumoMenosEficiente));

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma=0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("exiba a soma dos consumos "+soma);
        System.out.println("exiba a media dos consumos "+(soma/carrosPopulares.size()));
        System.out.println("remova o modelo com consumo igual a 15.6");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("exiba os carros na ordem que foram informados");

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());
        System.out.println("exiba os carros na ordem do modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares.toString());
        System.out.println("apague o dicionario de carros");

        carrosPopulares.clear();
        System.out.println("confira se o dicionario está vazio "+carrosPopulares.isEmpty());








    }
}
