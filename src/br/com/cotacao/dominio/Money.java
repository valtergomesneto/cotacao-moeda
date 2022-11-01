package br.com.cotacao.dominio;

public class Money {
    String code;
    String codein;
    String name;
    String ask;

    public String getCode() {
        return code;
    }

    public String getCodein() {
        return codein;
    }

    public String getName() {
        return name;
    }

    public String getAsk() {
        return ask;
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "code='" + code + '\'' +
                ", codein='" + codein + '\'' +
                ", name='" + name + '\'' +
                ", ask='" + ask + '\'' +
                '}';
    }
}
