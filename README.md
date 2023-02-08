# Ejercicio1
Ejercicio conversor de monedas

##Etapa 01. Descripcion del problema
Se requiere un programa en Java para convertir una cantidad de dinero en otros tipos de monedas 
(al menos a cinco tipos de monedas distintas).

##Etapa 02. Definicion  de la solucion
~~~
-Entrada 
float cantidad
String moneda1, moneada2, moneda3, moneda4, moneda5
double conversion 

-Proceso
solicitar moneda inicial
solicitar cantidad a convertir 
solicitar moneda para procesar conversion

si el monto es mayor o igual que cero entonces se convertira a la moneda deseada
si el monto es menor que cero entonces se cancela la operacion 

-salida

+----------+--------------+--------------------+---------------+
| CANTIDAD |MONEDA ORIGEN |CANTIDAD CONVERTIDA |MONEDA DESTINO |
+----------+--------------+--------------------+---------------+
|       10 |         DLLS |              189.9 |           MXN |
+----------+--------------+--------------------+---------------+
|       10 |         DLLS |            0.00043 |           BTC |
+----------+--------------+--------------------+---------------+
~~~


##Etapa 03. Diseño de la solución
![](https://github.com/rosariohdz1012/Ejercicio1/blob/master/Diagrama%20de%20clases.png)
