import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciacionReferenciaYComparacion {
    public static void main(String[] args) {
        // ================================
        // EJERCICIO 1: Crear objetos con new
        // ================================
        // 1. Crea un objeto Cancion (c1) usando el constructor por defecto.
        // 2. Crea otro objeto Cancion (c2) usando el constructor parametrizado,
        //    por ejemplo: "Clocks", "Coldplay".
        // 3. Muestra por consola ambas canciones con System.out.println().
        // 4. Observa qué valores se imprimen en cada caso.

        // Tu código aquí ↓

        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Yellow","Coldplay");
        System.out.println(c1);
        System.out.println(c2);


        // ================================
        // EJERCICIO 2: Comparación con ==
        // ================================
        // 1. Crea dos objetos Cancion (c3 y c4) distintos, con los mismos valores.
        // 2. Imprime el resultado de (c3 == c4).

        // Tu código aquí ↓

        Cancion c3 = new Cancion("Clocks","Coldplay");
        Cancion c4 = new Cancion("Clocks", "Coldplay");
        System.out.println(c3 == c4);


        // ================================
        // EJERCICIO 3: Comparación con equals()
        // ================================
        // 1. Usando los mismos objetos c3 y c4 del ejercicio anterior,
        //    imprime el resultado de (c3.equals(c4)).

        // Tu código aquí ↓

        System.out.println(c3.equals(c4));


        // ================================
        // EJERCICIO 4: Comparación en Pelicula
        // ================================
        // 1. Crea dos objetos Pelicula (p1 y p2) con el mismo título y año.
        // 2. Imprime ambas películas por consola.
        // 3. Imprime (p1 == p2).
        // 4. Imprime (p1.equals(p2)).

        // Tu código aquí ↓

        Pelicula p1 = new Pelicula("Pixels",2015);
        Pelicula p2 = new Pelicula("Pixels",2015);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));


        // ================================
        // EJERCICIO 5: Referencias
        // ================================
        // 1. Crea un objeto Cancion (c5) con el constructor parametrizado.
        // 2. Declara otra variable Cancion (c6) y haz que apunte al mismo objeto que c5.
        // 3. Imprime (c5 == c6).
        // 4. Cambia el título de la canción desde c6.
        // 5. Imprime c5 de nuevo.

        // Tu código aquí ↓

        Cancion c5 = new Cancion("Animals", "Imagine Dragons");
        Cancion c6 = c5;
        System.out.println(c5 == c6);
        c6.setTitutlo("Believer");
        System.out.println(c5);


        // ================================
        // EJERCICIO 6: null
        // ================================
        // 1. Declara una variable Pelicula (p3) y asígnale null.
        // 2. Imprime p3 por consola.
        // 3. Ahora intenta acceder a un método de p3 (ejemplo p3.getTitulo()).
        //    Comenta la línea después de probar, porque lanzará un error.

        // Tu código aquí ↓

        Pelicula p3 = new Pelicula();
        System.out.println(p3);
        //p3.getTitulo();

    }

}
// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué diferencia hay entre el constructor por defecto y el parametrizado?
// Respuesta: En el por defecto está establecido que se ponga titulo y autor desconocido pero en el parametrizado le damos valor a titulo y autor

// Ejercicio 2: ¿Por qué da false al comparar con == dos objetos con los mismos datos?
// Respuesta: Porque el == compara los objetos y son diferentes objetos

// Ejercicio 3: ¿Qué diferencia hay entre == y equals()? ¿Por qué ahora sí devuelve true?
// Respuesta: Porque compara el contenido y no el objeto

// Ejercicio 4: ¿Por qué en Pelicula equals no funciona como en Cancion?
// Respuesta: ...

// Ejercicio 5: ¿Qué ocurre cuando modificas el objeto a través de c6? ¿Qué demuestra?
// Respuesta: Se cambia el titulo también en c5 demuestra que c5 y c6 son el mismo objeto

// Ejercicio 6: ¿Qué error aparece al acceder a un método de p3 siendo null?
// ¿Qué significa realmente que una variable valga null?
// Respuesta: ...

