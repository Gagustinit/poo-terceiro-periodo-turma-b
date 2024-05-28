package segundob.aulas.auladois;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        
        Set<String> nomesSemRepeticao = new HashSet<>(); 

        nomesSemRepeticao.add("Julio");
        nomesSemRepeticao.add("Pedro");
        nomesSemRepeticao.add("Gustavo");
        nomesSemRepeticao.add("Higor");
        nomesSemRepeticao.add("Israel");
        nomesSemRepeticao.add("Gustavo Serapião");

        for (String nome : nomesSemRepeticao) {
            System.out.println(nome);
        }
    }
}
