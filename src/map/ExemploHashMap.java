package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

            Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

            // Adiciona os campeoes mundiais fifa no mapa
            campeoesMundiaisFifa.put("Brasil", 5);
            campeoesMundiaisFifa.put("Alemanha", 4);
            campeoesMundiaisFifa.put("Italia", 4);
            campeoesMundiaisFifa.put("Uruguai", 2);
            campeoesMundiaisFifa.put("Argentina", 2);
            campeoesMundiaisFifa.put("Franca", 2);
            campeoesMundiaisFifa.put("Inglaterra", 1);
            campeoesMundiaisFifa.put("Espanha", 1);

            System.out.println(campeoesMundiaisFifa);

            // Atualiza o valor para a chave Brasil
            campeoesMundiaisFifa.put("Brasil", 6);
            System.out.println(campeoesMundiaisFifa);

            // Retorna a Argentina
            System.out.println(campeoesMundiaisFifa.get("Argentina"));

            // Retorna se existe ou nao um campeao na Franca
            System.out.println(campeoesMundiaisFifa.containsKey("Franca"));

            // Remove o campeao Franca
            campeoesMundiaisFifa.remove("Franca");

            // Retorna se existe ou nao um campeao Franca
            System.out.println(campeoesMundiaisFifa.containsKey("Franca"));

            // Retorna se existe ou nao alguma selecao hexa campea
            System.out.println(campeoesMundiaisFifa.containsValue(6));

            // Retorna o tamanho do mapa
            System.out.println(campeoesMundiaisFifa.size());

            System.out.println(campeoesMundiaisFifa);

            // Navega nos registros do mapa -- pouco performatica
            for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()){
                System.out.println(entry.getKey() + " -- " + entry.getValue());
            }

            // Navega nos registros do mapa
            for (String key : campeoesMundiaisFifa.keySet()){
                System.out.println(key + " --- " +campeoesMundiaisFifa.get(key));
            }
              System.out.println(campeoesMundiaisFifa);


    }
}
