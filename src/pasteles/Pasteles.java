/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasteles;

/**
 *
 * @author Margarita
 */
public class Pasteles {

    private final String sabor;
    private final int porciones;
    private String frutas;
    private String relleno;
    private String cobertura;

    public Pasteles(pastelesBuilder builder) {
        this.sabor = builder.sabor;
        this.porciones = builder.porciones;
        this.frutas = builder.frutas;
        this.relleno = builder.relleno;
        this.cobertura = builder.cobertura;
    }

    public String getFrutas() {
        return frutas;
    }

    public void setFrutas(String frutas) {
        this.frutas = frutas;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public static class pastelesBuilder {

        private final String sabor;
        private final int porciones;
        private String frutas;
        private String relleno;
        private String cobertura;

        public pastelesBuilder(String sabor, int porciones) {
            this.sabor = sabor;
            this.porciones = porciones;

        }

        public pastelesBuilder frutas(String frutas) {
            this.frutas = frutas;
            return this;

        }

        public pastelesBuilder relleno(String relleno) {
            this.relleno = relleno;
            return this;

        }

        public pastelesBuilder cobertura(String cobertura) {
            this.cobertura = cobertura;
            return this;

        }

        public Pasteles build() {
            return new Pasteles(this);
        }
    }
}
