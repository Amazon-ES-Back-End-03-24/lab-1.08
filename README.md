# LAB 1.08 | Java Interfaces y clases abstractas

## Introducción

Acabamos de aprender cómo crear e implementar interfaces, así como cómo crear y extender clases abstractas, así que ahora practiquemos un poco.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

### Operaciones BigDecimal

1. Usando [la documentación de BigDecimal](https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html), crea un método que acepte un `BigDecimal` y devuelva un `double` del número `BigDecimal` redondeado al centésimo más cercano. Por ejemplo, `4.2545` debería devolver `4.25`.
2. Usando [la documentación de BigDecimal](https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html), crea un método que acepte un `BigDecimal`, invierte el signo (si el parámetro es positivo, el resultado debería ser negativo y viceversa), redondea el número a la décima más cercana y devuelva el resultado. Por ejemplo, `1.2345` debería devolver `-1.2` y `-45.67` debería devolver `45.7`.

<br>

### Sistema de inventario de automóviles

1. Supongamos que estás construyendo un sistema de inventario de automóviles. Todos los automóviles tienen un `vinNumber`, `make`, `model` y `mileage`. Pero ningún automóvil es solo un automóvil cualquiera. Cada automóvil puede ser un `Sedan`, un `UtilityVehicle` o un `Truck`.
2. Crea una clase abstracta llamada `Car` y define las siguientes propiedades y comportamientos:
    - `vinNumber`: una `String` que representa el número de VIN del automóvil
    - `make`: una `String` que representa la marca del automóvil
    - `model`: una `String` que representa el modelo del automóvil
    - `mileage`: un `int` que representa el kilometraje del automóvil
    - `getInfo()`: un método que devuelve una `String` que contiene todas las propiedades del automóvil en un formato legible
3. Crea tres clases que extiendan `Car`: `Sedan`, `UtilityVehicle` y `Truck`.
4. Los objetos de `UtilityVehicle` deben tener una propiedad adicional `fourWheelDrive`, un `boolean` que representa si el vehículo tiene tracción en las cuatro ruedas.
5. Los objetos de `Truck` deben tener una propiedad adicional `towingCapacity`, un `double` que representa la capacidad de remolque del camión.

<br>

### Servicio de transmisión de vídeo

1. Supón que está construyendo un servicio de transmisión de vídeo. Todos los videos son series de televisión o películas.
2. Crea una clase abstracta llamada `Video` y define las siguientes propiedades y comportamientos:
    - `title`: un `String` que representa el título del video
    - `duration`: un `int` que representa la duración del video en minutos
    - `getInfo()`: un método que devuelve un `String` que contiene todas las propiedades del video en un formato legible
3. Crea dos clases que extiendan `Video`: `TvSeries` y `Movie`.
4. Los objetos `TvSeries` deben tener una propiedad adicional `episodes`, un `int` que representa el número de episodios en la serie.
5. Los objetos `Movie` deben tener una propiedad adicional `rating`, un `double` que representa la calificación de la película.

<br>

### Interfaz IntList

1. Crea una interfaz `IntList` con los siguientes métodos:
    - `add (int number)`: un método que agrega un nuevo número a la lista
    - `get (int id)`: un método que recupera un elemento por su ID
2. Crea dos implementaciones de `IntList`: `IntArrayList` y `IntVector`.
3. `IntArrayList` debe almacenar números en un array con una longitud de 10 por defecto. Cuando se llama al método `add`, primero debes determinar si el array está lleno. Si lo está, crea un nuevo array que sea el 50% más grande, mueve todos los elementos al nuevo array y agregue el nuevo elemento. (Por ejemplo, un array de longitud 10 aumentaría a 15).
4. `IntVector` debe almacenar números en un arreglo con una longitud de 20 por defecto. Cuando se llama al método `add`, primero debes determinar si el array está lleno. Si lo está, crea un nuevo array que sea el doble del tamaño del array actual, mueve todos los elementos al nuevo array y agrega el nuevo elemento. (Por ejemplo, un array de longitud 10 aumentaría a 20).
5. En su `README.md`, incluye un ejemplo de cuándo `IntArrayList` sería más eficiente y cuándo `IntVector` sería más eficiente.

#### IntArrayList
- IntArrayList es más eficiente en escenarios donde el crecimiento de la lista es moderado o poco predecible. Al crecer solo un 50%, utiliza menos memoria en escenarios donde no es necesario un gran buffer de memoria adicional. Es ideal para casos de uso en los que los incrementos de memoria deben ser más conservadores y el tamaño de la lista no se escala exponencialmente.

#### IntVector
- IntVector es más adecuado para situaciones donde se espera que la lista crezca rápidamente o de manera significativa. Al duplicar su tamaño, reduce el número de veces que se necesita redimensionar, lo cual puede ser beneficioso en términos de rendimiento cuando las operaciones de adición son muy frecuentes y el tamaño final de la lista es considerablemente grande.
<br>

## FAQs (Preguntas frecuentes)

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">Estoy atascado y no sé cómo resolver el problema o por dónde empezar. ¿Qué debo hacer?</summary>

  <!-- ✅ -->

Si estás atascado con tu código y no sabes cómo resolver el problema o por dónde empezar, debes dar un paso atrás y tratar de formular una pregunta clara y directa sobre el problema específico que enfrentas. El proceso que seguirás al tratar de definir esta pregunta te ayudará a limitar el problema y a encontrar soluciones potenciales.

Por ejemplo, ¿no entiendes el concepto o estás recibiendo un mensaje de error que no sabes cómo arreglar? Por lo general, es útil intentar formular el problema de la manera más clara posible, incluyendo cualquier mensaje de error que estés recibiendo. Esto puede ayudarte a comunicar el problema a otras personas y, potencialmente, a obtener ayuda de tus compañeros o recursos en línea.

Una vez que tengas una comprensión clara del problema, deberías poder comenzar a trabajar hacia la solución.

</details>

<br>

<details> 
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo creo un proyecto Maven en IntelliJ?</summary>

  <!-- ✅ -->

Para crear un proyecto Maven en IntelliJ, puedes seguir estos pasos:

1. Abre IntelliJ IDEA y haz clic en el botón "Create New Project".
2. En el diálogo "New Project", selecciona "Maven" como el sistema de compilación.
3. Especifica el nombre del proyecto.
4. En la sección "Project Location", especifica una ubicación donde quieres guardar tu proyecto.
5. Selecciona la casilla de verificación "Create Git repository" para inicializar el repositorio git al crear el proyecto.
6. Haz clic en el botón "Create" para crear el proyecto Maven.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo uso "BigDecimal" en Java para manejar números decimales precisos?</summary>

  <!-- ✅ -->

`BigDecimal` es una clase en Java que proporciona soporte para números decimales precisos, lo que permite realizar operaciones aritméticas con precisión arbitraria.

Aquí hay un ejemplo de cómo usar `BigDecimal` en un programa Java:

  ```java
  import java.math.BigDecimal;

  public class BigDecimalExample {
  public static void main(String[] args) {
    BigDecimal a = new BigDecimal("0.1");
    BigDecimal b = new BigDecimal("0.2");
    BigDecimal c = a.add(b);
    System.out.println("a + b = " + c);
  }
  }
  ```

En este ejemplo, se crean objetos `BigDecimal` usando la palabra clave `new` y una representación String del número decimal. Luego se utiliza el método `add` para realizar operaciones aritméticas en los objetos `BigDecimal`, proporcionando resultados precisos.

Es importante tener en cuenta que al crear un objeto `BigDecimal`, se recomienda usar el constructor String en lugar del constructor `double`. El constructor `double` no se recomienda para crear objetos `BigDecimal` porque el tipo de datos `double` tiene una precisión limitada y puede producir resultados inesperados.

Además del método `add`, `BigDecimal` también proporciona otras operaciones aritméticas, como `subtract`, `multiply` y `divide`, así como métodos para redondear y dar formato al número decimal.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo usar "setScale()", "RoundingMode" y "negate()" en Java con "BigDecimal"?</summary>

  <!-- ✅ -->

`setScale()`, `RoundingMode` y `negate()` son métodos en la clase `BigDecimal` en Java que brindan funcionalidad adicional al trabajar con números decimales precisos.

`setScale()` se utiliza para establecer la escala de un objeto `BigDecimal`, lo que determina la cantidad de lugares decimales a mantener. Por ejemplo:

  ```java
  import java.math.BigDecimal;

  public class BigDecimalExample {
      public static void main(String[] args) {
          BigDecimal a = new BigDecimal("1.234567");
          BigDecimal b = a.setScale(4, BigDecimal.ROUND_HALF_UP);
          System.out.println("a: " + a);
          System.out.println("b: " + b);
      }
  }
  ```

En este ejemplo, se usa `setScale()` para establecer la escala de `a` en 4 lugares decimales y el resultado se almacena en un nuevo objeto `BigDecimal`, `b`. El argumento `ROUND_HALF_UP` especifica el modo de redondeo a usar al establecer la escala.

`RoundingMode` es una enumeración en Java que define los diferentes modos de redondeo que se pueden usar con `BigDecimal`. Por ejemplo:

  ```java
  import java.math.BigDecimal;
  import java.math.RoundingMode;

  public class BigDecimalExample {
      public static void main(String[] args) {
          BigDecimal a = new BigDecimal("1.234567");
          BigDecimal b = a.setScale(4, RoundingMode.HALF_UP);
          System.out.println("a: " + a);
          System.out.println("b: " + b);
      }
  }
  ```

En este ejemplo, `RoundingMode.HALF_UP` se usa como el argumento de modo de redondeo en el método `setScale()`.

`negate()` se utiliza para negar el valor de un objeto BigDecimal, convirtiendo un valor positivo en negativo y viceversa. Por ejemplo:

  ```java
  import java.math.BigDecimal;

  public class BigDecimalExample {
      public static void main(String[] args) {
          BigDecimal a = new BigDecimal("1.234567");
          BigDecimal b = a.negate();
          System.out.println("a: " + a);
          System.out.println("b: " + b);
      }
  }
  ```

En este ejemplo, se utiliza `negate()` para negar el valor de `a` y almacenar el resultado en un nuevo objeto `BigDecimal`, `b`.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Qué es una clase abstracta en Java y cómo se utiliza?</summary>

  <!-- ✅ -->

Una clase abstracta en Java es una clase que no se puede instanciar y se destina a ser heredada por otras clases. Las clases abstractas pueden contener métodos abstractos, que son métodos que se declaran pero no tienen un cuerpo.

Una clase abstracta se utiliza como una clase base para proporcionar una interfaz y una implementación común a sus subclases. Las subclases de una clase abstracta deben implementar los métodos abstractos definidos en la clase abstracta.

Aquí hay un ejemplo de una clase abstracta en Java:

  ```java
  abstract class Shape {
      int x, y;
      // abstract method that subclasses must implement
      abstract void draw();
  }

  class Circle extends Shape {
    @Override
      void draw() {
          System.out.println("Drawing a circle");
      }
  }

  class Square extends Shape {
    @Override
      void draw() {
          System.out.println("Drawing a square");
      }
  }
  ```

En este ejemplo, la clase `Shape` es una clase abstracta que contiene un método abstracto `draw()`. Las clases `Circle` y `Square` son subclases de Shape e implementan el método `draw()`.

Cuando una subclase implementa los métodos abstractos de su clase abstracta, hereda las propiedades y métodos de la clase abstracta, lo que facilita la implementación de funcionalidades comunes en múltiples clases.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo implemento una interfaz en Java?</summary>

  <!-- ✅ -->

En Java, una interfaz es un plano que describe los métodos que una clase debe implementar. Para implementar una interfaz, es necesario crear una clase que implemente la interfaz y proporcione una implementación para cada uno de sus métodos.

Aquí hay un ejemplo de cómo implementar una interfaz en Java:

  ```java
  interface Shape {
      void draw();
  }

  class Circle implements Shape {
    @Override
      public void draw() {
          System.out.println("Drawing a circle");
      }
  }

  class Square implements Shape {
    @Override
      public void draw() {
          System.out.println("Drawing a square");
      }
  }
  ```

En este ejemplo, la interfaz `Shape` define un solo método `draw()`. Las clases `Circle` y `Square` implementan la interfaz Shape proporcionando una implementación para el método `draw()`.

Cuando una clase implementa una interfaz, debe implementar todos los métodos definidos en la interfaz. Si una clase no implementa todos los métodos, no se compilará. Las interfaces se pueden utilizar para imponer un conjunto común de métodos en un grupo de clases, lo que facilita la escritura de código que es intercambiable entre diferentes clases que implementan la misma interfaz.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es el propósito de "System.arraycopy()" en Java y cómo lo usamos?</summary>

  <!-- ✅ -->

El método `System.arraycopy()` en Java se utiliza para copiar elementos de una array a otro. Es parte de la clase `System` y proporciona una alternativa más rápida al método tradicional de bucle for para copiar arrays. El método tiene la siguiente firma:

  ```java
  public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
  ```

Aquí hay un ejemplo de cómo puede usar `System.arraycopy()`:

  ```java
  int[] sourceArray = new int[] {1, 2, 3, 4, 5};
  int[] destinationArray = new int[5];
  System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

  System.out.println(Arrays.toString(destinationArray));
  ```

En este ejemplo, se utiliza `System.arraycopy()` para copiar los elementos de `sourceArray` a `destinationArray`. El primer argumento `src` es el array fuente, el segundo argumento `srcPos` es la posición de inicio en el array fuente, el tercer argumento `dest` es el array destino, el cuarto argumento `destPos` es la posición de inicio en el array destino y el quinto argumento `length` es la cantidad de elementos que se deben copiar. El resultado de este ejemplo sería `[1, 2, 3, 4, 5]`.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">No puedo enviar cambios a mi repositorio. ¿Qué debo hacer?</summary>

  <!-- ✅ -->

Si no puedes enviar cambios a tu repositorio, aquí hay algunos pasos que puedes seguir:

1. Verifica tu conexión a internet: Asegúrate de que tu conexión a internet sea estable y funcione.
2. Verifica la URL de tu repositorio: Asegúrate de estar usando la URL correcta de tu repositorio para enviar tus cambios.
3. Revisa tus credenciales de Git: Asegúrate de que tus credenciales de Git estén actualizadas y correctas. Puedes revisar tus credenciales usando el siguiente comando:

  ```bash
  git config --list
  ```

4. Actualiza tu repositorio local: Antes de enviar cambios, asegúrate de que tu repositorio local esté actualizado con el repositorio remoto. Puedes actualizar tu repositorio local usando el siguiente comando:

  ```bash
  git fetch origin
  ```

5. Revisa posibles conflictos: Si hay conflictos entre tu repositorio local y el repositorio remoto, resuélvelos antes de enviar cambios.
6. Envía cambios: Una vez que hayas resuelto los conflictos y actualizado tu repositorio local, puedes intentar enviar cambios nuevamente usando el siguiente comando:

  ```bash
  git push origin <branch_name>
  ```

</details>