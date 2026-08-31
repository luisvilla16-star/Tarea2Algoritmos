
void main() {

    Pila pila = new Pila();

    pila.Push("Numero");
    pila.Push("Algoritmos");
    pila.Push("Luis");
    pila.Push("Pedro");


    System.out.println(pila.Pop());
    System.out.println(pila.llena());
    System.out.println(pila.vacia());


    PruebaPila pila1 = new PruebaPila();

    String texto1 = "Hola";

    System.out.println("texto original: " + texto1);
    System.out.println("texto invertido: " + pila1.invierteCadena(texto1));

    PruebaPila pila2= new PruebaPila();
    int []vector={10,4,6,1};
    Pila<Integer> resultado = pila2.ordenarVector(vector);
    while(!resultado.vacia()){
        System.out.println(resultado.Pop());
    }

}
