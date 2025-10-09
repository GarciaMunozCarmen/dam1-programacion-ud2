public class GestorTareas {
    public static void Bienvenida(){
        System.out.println("Bienvenido al programa");
    }
    public static int Duración(int a, int b){
        return a+b;
    }
    public static void ConversorMinutos(int a){
        int horas = a/60;
        int minutos = a%60;
        System.out.printf("Son %d horas y %d minutos%n", horas, minutos);
    }
    public static void Recordatorio(String tarea, int prioridad){
        if ((prioridad == 1) || (prioridad == 2) || (prioridad == 3)){
            System.out.printf("📌 [Prioridad %d] %s%n", prioridad, tarea);
        }else{
            System.out.println("Prioridad no válida");
        }
    }
    public static String EstadoTareas(boolean estado){
        if(estado){
            return"✅ Completada";
        }else{
            return "⏳ Pendiente";
        }
    }
    public static double Productividad(int totalTareas, double completadas){
        return (completadas/totalTareas)*100;
    }
    public static void Mensaje(){
        System.out.println("Hola crack");
    }
    public static void Mensaje(String usuario, int tareasCompletadas){
        System.out.printf("Hola %s completaste %d tareas%n", usuario, tareasCompletadas);
    }
    public static String Planificación(String tarea, int minutosDuracion){
        int horas = minutosDuracion/60;
        int minutos = minutosDuracion%60;
        return "La tarea " + tarea + " durará aproximadamente " + horas + " horas y " + minutos + " minutos.";
    }
    public static void main(String[] args) {
        
        // ================================
        // EJERCICIO 1: Bienvenida
        // ================================
        // Crea un método llamado que muestre un mensaje de bienvenida al programa.
        // No necesita devolver nada, solo imprimir por consola.

        // Tu código aquí ↓
        
        Bienvenida();

        // ================================
        // EJERCICIO 2: Duración total
        // ================================
        // Crea un método que reciba la duración (en minutos) de dos tareas
        // y devuelva el total de minutos.
        // Llama al método con 45 y 30 y muestra el resultado en consola.

        // Tu código aquí ↓
        
        System.out.println(Duración(45, 30) + " minutos");

        // ================================
        // EJERCICIO 3: Conversión de tiempo
        // ================================
        // Crea un método que reciba una cantidad de minutos
        // y muestre en pantalla cuántas horas y minutos son.
        // Ejemplo: 150 minutos → "Son 2 horas y 30 minutos".
        // No tiene que devolver nada.

        // Tu código aquí ↓

        ConversorMinutos(150);

        // ================================
        // EJERCICIO 4: Recordatorios
        // ================================
        // Crea un método que reciba el nombre de una tarea y una prioridad (1–3)
        // y muestre un mensaje como:
        // "📌 [Prioridad 2] Revisar correo".
        // Solo muestra el mensaje, no devuelve nada.

        // Tu código aquí ↓
        
        Recordatorio("Hacer deberes", 3);

        // ================================
        // EJERCICIO 5: Estado de tareas
        // ================================
        // Crea un método que reciba un valor booleano que indique si la tarea está completada.
        // Debe devolver un texto: "✅ Completada" o "⏳ Pendiente".
        // Muestra el resultado de llamar al método con ambos casos.

        // Tu código aquí ↓
        
        System.out.println(EstadoTareas(false));
        System.out.println(EstadoTareas(true));

        // ================================
        // EJERCICIO 6: Productividad
        // ================================
        // Crea un método que reciba el número total de tareas y las completadas
        // y devuelva el porcentaje de avance (por ejemplo, 70.0 si 7/10).
        // Muestra el resultado en consola.

        // Tu código aquí ↓
        
        System.out.println(Productividad(10, 5));

        // ================================
        // EJERCICIO 7: Sobrecarga
        // ================================
        // Crea dos métodos con el mismo nombre:
        // - uno sin parámetros, que muestre un mensaje genérico (ejemplo: "Hola crack";
        // - otro con parámetros (nombre de usuario, número de tareas completadas) "Hola {usuario} completaste {numero} de tareas"
        //   que muestre un resumen personalizado.
        // Llama a ambos desde main.

        // Tu código aquí ↓
        
        Mensaje();
        Mensaje("Carmen", 5);

        // ================================
        // EJERCICIO 8: Bonus - Planificación
        // ================================
        // Crea un método que reciba el nombre de una tarea y su duración en minutos,
        // y devuelva un texto con la planificación:
        // "La tarea [nombre] durará aproximadamente X horas y Y minutos."
        // Muestra el texto en pantalla.

        // Tu código aquí ↓
        
        System.out.println(Planificación("deberes", 120));
    }

    // Aquí debéis crear los métodos fuera del main ↓↓↓

}