public class Main {
    public static void main(String[] args){
       Pila pila = new Pila();
       System.out.println(pila.estaVacia());

        for (int i = 1; i <= 8; i++) {
            pila.insertar(i);
        }
        pila.mostrar();

        pila.eliminar();
        pila.eliminar();
        pila.eliminar();

        pila.mostrar();
    }
}