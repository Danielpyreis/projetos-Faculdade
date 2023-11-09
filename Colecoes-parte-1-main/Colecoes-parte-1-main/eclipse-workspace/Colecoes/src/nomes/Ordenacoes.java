package nomes;
import java.util.ArrayList;
import java.util.Collections;

public class Ordenacoes {

	public static void main(String[] args) {
		
		ArrayList<String> NS = new ArrayList<String>();
		NS.add("Daniel");
		NS.add("Wosley");
		NS.add("Murilo");
		NS.add("Eliezer");
		NS.add("Dimi Alex");
		Collections.sort(NS);
		for (String i : NS) {
		      System.out.println(i);
		    }
		
	}

}
