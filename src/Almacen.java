import java.util.Stack;

public class Almacen {
    public Stack<Character> almacenTemporal;
    public Stack<Character> almacen1;
    public Stack<Character> almacen2;

    public Almacen() {
        almacenTemporal=new Stack<Character>();
        almacenTemporal.push('A');
        almacenTemporal.push('B');
        almacen1=new Stack<Character>();
        almacen1.push('X');
        almacen2=new Stack<Character>();
        almacen2.push('C');
    }
    public boolean pilaVacia(Stack pila){
        return pila.empty();
    }
    public void enviarAlamcenTemporal (Stack<Character> pila) throws Exception {
        if(pilaVacia(pila)){
            throw new Exception("LA PILA ESTA VACIA");
        }
        almacenTemporal.push(pila.pop());
    }
    public void sacarDeAlmacenTemporal (Stack pila) throws Exception {
        if (pilaVacia(almacenTemporal)){throw new Exception("El almacen temporal esta vacia");}
        pila.push(almacenTemporal.pop());
    }
    public void agregarAlmacen(String dato, Stack pila){
        pila.push(dato);
    }

    public String toString(Stack<Character> pila) {
        String listarAlmacen="======ALMACENAMIENTO DISPONIBLE======";
        for (int i=pila.size()-1;i>=0;i--){
            listarAlmacen+="\n"+pila.get(i);
        }
        return listarAlmacen;
    }
}
