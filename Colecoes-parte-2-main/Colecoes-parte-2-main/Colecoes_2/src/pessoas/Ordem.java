package pessoas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ordem {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> grupos = new HashMap<>();
        grupos.put("Masculino", new ArrayList<>());
        grupos.put("Feminino", new ArrayList<>());

        grupos.get("Masculino").add("Wosley");
        grupos.get("Masculino").add("Daniel");
        grupos.get("Feminino").add("Nadja");
        grupos.get("Feminino").add("Ana Lucia");
        
        for (Map.Entry<String, ArrayList<String>> grupo : grupos.entrySet()) {
            System.out.println("Pessoas do sexo " + grupo.getKey() + ": " + grupo.getValue());
        }
    }
}

