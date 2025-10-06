import utilidades.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        // ================================
        // EJERCICIO 1: Uso de atributos
        // ================================
        // 1. Intenta acceder directamente al atributo saldo:
        //    System.out.println(cuenta.saldo);
        // 2. Observa el error de compilación.
    
        // Tu código aquí ↓

        // System.out.println(cuenta.saldo);


        // ================================
        // EJERCICIO 2: Métodos públicos
        // ================================
        // 1. Ingresa 100€ usando depositar().
        // 2. Retira 30€ usando retirar().
        // 3. Imprime el saldo con getSaldo().

        // Tu código aquí ↓

        cuenta.depositar(100);
        cuenta.retirar(30);
        System.out.println(cuenta.getSaldo());


        // ================================
        // EJERCICIO 3: Métodos privados
        // ================================
        // 1. Intenta llamar al método registrarOperacion("Hackeo", 9999).
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        
       // cuenta.registrarOperacion("Hackeo",9999);


       // ================================
        // EJERCICIO 4: Libre
        // ================================
        // Puedes hacer pruebas adicionales con los métodos disponibles
        // para asegurarte de que comprendes la diferencia entre public y private.

        cuenta.depositar(10);
        cuenta.retirar(100); //Al no tener suficiente saldo no se realiza esta operación
        System.out.println(cuenta.getSaldo());
    }
}
// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: No se puede acceder al saldo porque es un atributo privado

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()?
// Respuesta: Porque esos métodos son públicos

// Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()?
// Respuesta: Significa que ese método es privado

// Ejercicio 4: 
// - ¿Qué ventajas tiene que saldo sea private?
// - ¿Qué pasaría si saldo fuera public?
// - ¿Por qué registrarOperacion es private en lugar de public?
// Respuesta: 
// - Al ser privado el saldo no se puede modificar 
// - Si fuera público se podría ver en la terminal y también podría modificarse
// - Porque es un método que solo se puede utilizar dentro de la clase