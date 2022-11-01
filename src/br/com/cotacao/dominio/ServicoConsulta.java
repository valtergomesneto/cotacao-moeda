package br.com.cotacao.dominio;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServicoConsulta {
    static String webService = "https://economia.awesomeapi.com.br/last/";
    static int codigoSucesso = 200;

    public static Money buscaMoeda(String moedaPrincipal, String moedaConvertida) throws Exception {
        String urlParaChamada = webService + moedaPrincipal + "-" + moedaConvertida;

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converteJsonEmString(resposta);

            Gson gson = new Gson();
            Money money = gson.fromJson(jsonEmString, Money.class);

            return money;
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }

}
