public class Moneda implements Comparable<Moneda> {
    public double dolar;
    public double pesoArgentino;
    public double pesoColombiano;
    public double realBrasileno;


    public Moneda(MonedaExchageRate miMonedaExchange) {

        this.dolar = miMonedaExchange.getConversionRates().getUSD();
        this.pesoArgentino = miMonedaExchange.getConversionRates().getARS();
        this.pesoColombiano = miMonedaExchange.getConversionRates().getCOP();
        this.realBrasileno = miMonedaExchange.getConversionRates().getBRL();
    }

    // Getters y Setters
    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getPesoArgentino() {
        return pesoArgentino;
    }

    public void setPesoArgentino(double pesoArgentino) {
        this.pesoArgentino = pesoArgentino;
    }

    public double getPesoColombiano() {
        return pesoColombiano;
    }

    public void setPesoColombiano(double pesoColombiano) {
        this.pesoColombiano = pesoColombiano;
    }

    public double getRealBrasileno() {
        return realBrasileno;
    }

    public void setRealBrasileno(double realBrasileno) {
        this.realBrasileno = realBrasileno;
    }


    @Override
    public int compareTo(Moneda otraMoneda) {
        return Double.compare(this.dolar, otraMoneda.getDolar());
    }
}