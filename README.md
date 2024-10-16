# Conversor de Monedas

Un programa en Java que permite realizar conversiones entre diferentes monedas utilizando datos actualizados de la API [ExchangeRate-API](https://www.exchangerate-api.com/).

## Descripción

Este proyecto es un conversor de monedas que permite convertir entre Dólares (USD), Pesos Argentinos (ARS), Pesos Colombianos (COP) y Reales Brasileños (BRL) utilizando tasas de cambio actuales. La aplicación obtiene los datos de conversión directamente desde una API externa y permite realizar cálculos rápidos a partir de los valores ingresados por el usuario.

## Instalación

Sigue estos pasos para clonar el repositorio y ejecutar el proyecto en tu máquina local:

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/tu-repositorio.git
   
2. Navega al directorio del proyecto:
cd tu-repositorio

3. Asegúrate de tener Java 11 o superior instalado en tu máquina.
4. Ejecuta el proyecto desde tu IDE favorito o compilando y ejecutando desde la terminal:
   javac Principal.java
   java Principal

## Uso
1. Al iniciar el programa, se te presentará un menú con varias opciones de conversión de monedas, como:

* Dólar a Peso Argentino
* Peso Argentino a Dólar
* Dólar a Real Brasileño
* Real Brasileño a Dólar
* Dólar a Peso Colombiano
* Peso Colombiano a Dólar
  
2. Selecciona una opción del menú ingresando el número correspondiente.

3. Ingresa la cantidad de la moneda que deseas convertir y el programa te devolverá el valor convertido.

4. Para salir del programa, selecciona la opción "Salir" en el menú.

## API Utilizada

Este proyecto utiliza la API ExchangeRate-API para obtener tasas de cambio actualizadas. La URL utilizada para obtener los datos es:

https://v6.exchangerate-api.com/v6/tu-api-key/latest/USD

Importante: Necesitas una API key válida para utilizar este servicio. Regístrate en la página de ExchangeRate-API y obtén tu clave gratuita o de pago según el plan que prefieras.

## Ejemplo de Respuesta de la API
{
  "conversion_rates": {
    "USD": 1,
    "ARS": 98.25,
    "COP": 3750.5,
    "BRL": 5.65
  }
}

## Contribuir
Si deseas contribuir a este proyecto:

1. Haz un fork del repositorio.
2. Crea una nueva rama (git checkout -b feature-nueva).
3. Realiza los cambios necesarios y haz un commit (git commit -m 'Añadir nueva característica').
4. Sube los cambios a tu repositorio (git push origin feature-nueva).
5. Abre un Pull Request explicando los cambios que realizaste.

## Licencia
Este proyecto está bajo la licencia MIT. Puedes ver más detalles en el archivo LICENSE incluido en el repositorio.

## Vista Previa

![image](https://github.com/user-attachments/assets/9ef6c749-f100-4a78-af07-4b3ae3d4a239)
![image](https://github.com/user-attachments/assets/ee970c7e-151f-4a06-9821-f78f153121e4)


