import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        Calculos calculoMoneda = new Calculos(); // Inicializar aquí, antes del ciclo

        while (true) {
            System.out.println("****************************************");
            System.out.println("Sea Bienvenido/a al Conversor de Moneda =] ");
            System.out.println("****************************************");
            String direccion = "https://v6.exchangerate-api.com/v6/774576dd4167aeaca05b7797/latest/USD";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Gson gson = new Gson();
            MonedaExchageRate miMonedaExchange = gson.fromJson(json, MonedaExchageRate.class);


            Moneda miMoneda = new Moneda(miMonedaExchange);


//            System.out.println("Valor en dólares: " + miMoneda.getDolar());
//            System.out.println("Valor en pesos argentinos: " + miMoneda.getPesoArgentino());
//            System.out.println("Valor en pesos colombianos: " + miMoneda.getPesoColombiano());
//            System.out.println("Valor en reales brasileños: " + miMoneda.getRealBrasileno());





 //           System.out.println("Moneda ya convertida: " + miMoneda.realBrasileno);

            Menu menu = new Menu();
            System.out.println(menu.menu());
            try {
            int opcion = teclado.nextInt();
            double monedaIngresad;
            double valorConstante;



                switch (opcion) {
                    case 1:

                        System.out.println("Escriba el valor en dolares");
                        monedaIngresad = teclado.nextDouble();
                        valorConstante = miMoneda.pesoArgentino; // Convertir de USD a ARS
                        System.out.println("Resultado: " + String.format("%.2f",(calculoMoneda.calculoMoneda(monedaIngresad, valorConstante)))+" ARS");
                        break;

                    case 2:
                        System.out.println("Escriba el valor en pesos argentinos");
                        monedaIngresad = teclado.nextDouble();
                        valorConstante = 1 / miMoneda.pesoArgentino; // Convertir de pesos argentinos a dólares
                        System.out.println("Resultado: " + String.format("%.2f",(calculoMoneda.calculoMoneda(monedaIngresad, valorConstante))) +" USD");
                        break;

                    case 3:
                        System.out.println("Escriba el valor en dolares");
                        monedaIngresad = teclado.nextDouble();
                        valorConstante = miMoneda.realBrasileno; // Convertir de USD a BRL
                        System.out.println("Resultado: " + String.format("%.2f",(calculoMoneda.calculoMoneda(monedaIngresad, valorConstante)))+" BRL");
                        break;

                    case 4:
                        System.out.println("Escriba el valor en reales brasileños");
                        monedaIngresad = teclado.nextDouble();
                        valorConstante = 1 / miMoneda.realBrasileno; // Convertir de BRL a USD
                        System.out.println("Resultado: " + String.format("%.2f",(calculoMoneda.calculoMoneda(monedaIngresad, valorConstante)))+" USD");
                        break;

                    case 5:
                        System.out.println("Escriba el valor en dolares");
                        monedaIngresad = teclado.nextDouble();
                        valorConstante = miMoneda.pesoColombiano; // Convertir de USD a COP
                        System.out.println("Resultado: " + String.format("%.2f",(calculoMoneda.calculoMoneda(monedaIngresad, valorConstante)))+" COP");
                        break;

                    case 6:
                        System.out.println("Escriba el valor en pesos colombianos");
                        monedaIngresad = teclado.nextDouble();
                        valorConstante = 1 / miMoneda.pesoColombiano; // Convertir de COP a USD
                        System.out.println("Resultado: " + String.format("%.2f",(calculoMoneda.calculoMoneda(monedaIngresad, valorConstante)))+" USD");
                        break;

                    case 7:
                        System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                        System.exit(0);  // Salir del programa
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            }catch (InputMismatchException e){
                System.out.println("Ocurrio un error: Carácter no admitido ");
                break;
            }
        }
    }
}