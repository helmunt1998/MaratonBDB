# MaratonBDB
Este repositorio contiene tres ejercicios de una prueba técnica realizada en **Java**.
Toda la documentación asociada al proyecto (de forma específica) se puede consultar dentro del código.

@author Helmunt Gómez

## Generalidades

**Versión del IDE Apache Netbeans:** 12.2\
**Versión Java:** 17.0.2 SE

Todos los programas se han realizado en un solo _package_ de java y contienen una _Java Class_ 
principal.\
La estructura de esta documentación se segmenta en el flujo básico de la manipulación de la información, esto es,
la **Entrada**, el **proceso**, y la **salida** del(os) dato(s), que concuerda con el desarrollo **secuencial**
de cada algoritmo.

### EJERCICIO 1

Contiene todo el código dentro del _método_ principal de la clase.

> **Entradas del algoritmo**
> - `Scanner input`. Que define la entrada de datos por consola con la clase Scanner
> - `String entrada`. Define la entrada de un array de datos separados por espacios, o cualquier otro símbolo.

> **Procesos ejecutados**
> 1. Uso del método `.split()` de la clase _String_ para separar la cadena y almacenarla en un array n-dimensional.
> 2. Uso del método `.valueOf()` de la clase _Integer_ para, por medio de un for, transformar el array _String_ a tipo _int_.
> 3. Incorporación del algoritmo de _ordenamiento Burbuja_ para reorganizar el arreglo de forma ascendente.
> 4. Uso de dos estructuras de control; 1) Un `for` para recorrer el array según su tamaño; 2) un `if - else` para 
> separar cada elemento según difiera ded su índice y agregarlo a una _ArrayList_, además, añadir a otra _Arraylist_ 
> el conteo de elementos repetidos por cada índice.
> 5. Uso de un último ciclo `for` para imprimir la salida del valor esperado, además de una división en dos para calcular el
> valor de cada par.

> **Salidas del algoritmo**
> - `ArrayList` con el conteo de la cantidad de pares por cada número.
> - `int` del total de pares que pueden armarse según la entrada de los datos.

### EJERCICO 2

La clase principal están divida en el _método_ main que recolecta y valida los datos ingresados; y en el _método_ `calculaSumas()`, que 
realiza la suma de los máximos y los mínimos de cuatro valores dentro del array.

> **Entradas del algoritmo**
> - `Scanner input`. Que define la entrada de datos por consola con la clase Scanner
> - `ArrayList arrList`. Con un tamaño por defecto de 5, establece un array list de los datos de entrada.

> **Procesos ejecutados**
> 1. El proceso principal se ejecuta en una estructura de control de tipo `do - while` que controla que el array ingresado por el usuario
> coincida con los parámetros de diseño establecidos, es decir, que tengo un tamaño de 5 y solo acepte enteros positivos.
> El ciclo se controla por medio de una bandera (tipo `boolean`) que cambia su estado dependiendo la validación anteriormente descrita.
> 2. La estructura es anidada a una de manejo de excepciones (`try - catch`), que admitirá entradas por medio del _objeto_ Scanner siempre
> y cuando sean solo enteros. Si alguno de los valores del array ingresa es cacarter o símbolo especial, arrojará un `InputMismatchException`
> que será manejado por el catch generando un mensaje por consola y retornando al ciclo otra vez.
> 3. Una estructura decisional `if` que se cumple siempre y cuando el tamaño (del método `.size()`) del _ArrayList_ coincida con 5.
> 4. Un ciclo `for-each` que cuenta la cantidad de coincidencias de cada valor del array que contengan valores enteros positivos. 
> 5. Una estructura `if - else` que valida si todos los datos son positivos. Si no lo son, genera una salida por consola advirtiendo el error,
> usa el método `.removeAll` de la clase _ArrayList_ para eliminar todos los datos de la lista, y retorna al ciclo otra vez.\
> Al entrar en la estructura `if`, se invoca el método `calculaSumas()` con los datos de la lista `arrList` como argumento del mismo.
>> **método `calculaSumas()`** 
>> - declaración de un array tipo `long int[]` de dos posiciones inicializado en 0, para guardar la suma de los valores.
>> - uso de la _Java Class _Collections_, junto con el método `.sort()` para reorganizar la lista en forma ascendente.
>> - un ciclo `for` para recorrer 4 posiciones de la lista. La suma de los primeros 4 datos de la lista reorganizada será la suma mínima
>> buscada, mientras que la suma de los últimos 4 será la suma del máximo valor posible, dado el orden de los datos.\
>> Cada respectivo valor se guarda en una de las posiciones del array `int long[]`.

> **Salidas del algoritmo**
> - La salida del programa es generada desde el método `calculaSumas()` y no desde el _main_.
> - Una variable tipo `long int[]` de longitud 2, que contiene en la posición 1 la suma de los 4 mínimos posibles del array inicial; y, 
> en la posición dos, la suma de los 4 máximos posibles del array inicial.

### EJERCICO 3

La clase principal están divida en el _método_ main que recolecta y valida los datos ingresados; y en el _método_ `findMaximum()`, que 
realiza la operación concreta de calcular la suma del total de valores máximos del array.

> **Entradas del algoritmo**
> - `Scanner input`. Que define la entrada de datos por consola con la clase Scanner
> - `int entrada`. Como parámetro inicial que definirá el tamaño del array posterior.
> - `String stringAlt`. Define la entrada del array que separa cada valor de las "velas" y su longitud esta definida por el valor `entrada`. 

> **Procesos ejecutados**
> 1. El proceso principal se ejecuta en una estructura de control de tipo `do - while` que controla que el array ingresado por el usuario
> coincida con el tamaño definido por el parámetro de `entrada`.
> 2. Uso del método `.split()` de la clase _String_ para separar la cadena y almacenarla en un array n-dimensional.
> 3. Dentro de un condicional `ìf - else` se evalua si el arreglo coincide en longitud a lo esperado y si si, se procede con el programa, si no, 
> vuelve al ciclo para pedir los datos del _array_ nuevamente.
> 4. Uso del método `.valueOf()` de la clase _Integer_ para, por medio de un for, transformar el array _String_ a tipo _int_.
> 5. Llamado a la funcion `findMaximum()` que espera como argumento una variable tipo `int[]`, que no es más que el array de los valores verificados.
>> **método `findMaximum()`** 
>> - por medio de un ciclo `for` se encuentra el valor mínimo del array, en conjunto con el método `.max()` de la clase _Math_, haciendo un intercambio
>> de datos sucesivos entre los valores del array, iniciando con el número 0 (asumiendo que será el valor mínimo ingresado).
>> - Usando otro for, se realiza un conteo del entero máximo encontrado, resultando en el valor buscado.
>> - retorna un _int_ con un conteo de los valores máximos que cumplen la condición del algoritmo, es decir, el valor  esperado de salida.

> **Salidas del algoritmo**
> - Una salida por consola que anida un `int` que no es más que el valor de retorno de la función (_método estático_) `findMaximum()`.

__________________

Mi perfil en GitHub: [Helmunt Gómez](https://github.com/helmunt1998)  :) 
