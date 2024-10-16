public class MonedaExchageRate {
    private ConversionRates conversion_rates; // El JSON tiene un objeto anidado

    // Clase interna para mapear conversion_rates
    public class ConversionRates {
        private double USD;
        private double ARS;
        private double COP;
        private double BRL;


        public double getUSD() { return USD; }
        public double getARS() { return ARS; }
        public double getCOP() { return COP; }
        public double getBRL() { return BRL; }
    }

    public ConversionRates getConversionRates() {
        return conversion_rates;
    }
}