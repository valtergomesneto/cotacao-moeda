package br.com.cotacao.dominio;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Util {
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString =  "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}
