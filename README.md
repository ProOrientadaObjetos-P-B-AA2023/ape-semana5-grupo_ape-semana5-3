# taller05

PROBLEMA 1 - APLICANDO IF
=========================
Desarrolla un programa que automatice la venta de X productos. El programa debe permitir al usuario ingresar el precio de un producto y determinar el descuento aplicable según las siguientes reglas:

* Si el precio del producto es mayor o igual a $1000, y el número de productos al menos 10, se aplica un descuento del 10%.

* Si el precio del producto es menor a $1000, se aplica un descuento del 5%, independientemente del número de productos.

Una vez determinado el descuento, el programa debe calcular y mostrar el precio final la la compra después de aplicar el descuento.

El programa debe implementar una clase respectiva base que contenga al menos los métodos:

* Un método llamado "calcularDescuento" que tome como parámetro el precio y número de productos y devuelva el descuento correspondiente.
* Un método llamado "calcularPrecioFinal" que devuelva el precio final después de aplicar el descuento.

Además, el programa debe solicitar al usuario ingresar el precio y número de productos y utilizar los métodos de la clase para calcular y mostrar el descuento aplicado y el precio final. No olvide que la clase de prueba (que contiene el método main), es quien realiza la gestión de ingreso de datos y/o visualización de resultados.


PROBLEMA 2 - APLICANDO CICLOS
=============================

Desarrolla un programa que permita gestionar una lista de empleados de una empresa y su nómina de pagos. El programa debe permitir al usuario realizar las siguientes acciones:

1.	Agregar un empleado: El usuario debe ingresar el nombre, el salario y la edad del empleado. El programa debe crear un objeto de la clase "Empleado" con esta información y agregarlo a la lista de empleados.
2.	Mostrar información de los empleados: El programa debe mostrar en pantalla la información de todos los empleados registrados, incluyendo su nombre, salario y edad.
3.	Calcular aumento de salario: El programa debe solicitar al usuario ingresar un porcentaje de aumento salarial. Luego, para cada empleado cuyo salario sea menor al salario promedio de todos los empleados, se debe aplicar el aumento correspondiente y mostrar en pantalla el nuevo salario.

La clase "Empleado" debe tener los siguientes atributos:
•	Nombre: nombre del empleado (cadena de caracteres).
•	Salario: salario del empleado (número decimal).
•	Edad: edad del empleado (entero).

**Además**, la clase "Empleado" debe tener un método llamado "mostrarInformacion" (toString) que imprima en pantalla la información del empleado.
