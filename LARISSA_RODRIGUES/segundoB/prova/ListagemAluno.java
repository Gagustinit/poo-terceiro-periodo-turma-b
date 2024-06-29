package LARISSA_RODRIGUES.segundoB.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

public class ListagemAluno {
    public static void listagemAluno() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/students");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            JOptionPane.showMessageDialog(null, response, "Listagem de alunos", 1);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), null, 0);
            return;
        }
    }
}
