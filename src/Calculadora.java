public class Calculadora {
    private double valor;

    public double sumar(int a){
        return valor = valor + a;
    }
    public double restar(int a){
        return valor = valor - a;
    }
    public double multiplicar(int a){
        return valor = valor * a;
    }
    public double getResultado(){
        return valor;
    }
    public double clear(){
        return valor = 0;
    }
    public double potencia(int exponente){
        return valor = Math.pow(valor, exponente);
    }
    public static void main(String[] args) {
        Calculadora calculo = new Calculadora();
        calculo.sumar(20);
        calculo.restar(25);
        calculo.multiplicar(2);
        calculo.potencia(2);
        double resultado = calculo.getResultado();
        System.out.println(resultado);

}
 }