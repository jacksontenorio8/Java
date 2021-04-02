package one.digitalinnovation.enums;

public enum Status {
    OPEN( cod: 13, texto: "Aberto"),
    CLOSE(cod:02, texto:"Fechado");

    private int cod;
    private String texto;

    Status(final int cod, final String texto) {

        this.cod = cod;
        this.texto = texto;
    }

    public int getCod() { return cod; }

    public String getTexto() { return texto;}
}
