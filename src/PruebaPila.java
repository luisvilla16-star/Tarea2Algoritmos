public class PruebaPila {
    private Pila<Character> pila;


    public String invierteCadena(String s) {
        Pila<Character> pila = new Pila<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            pila.Push(s.charAt(i));

        }

        String cadena = "";
        for (int i = 0; i < s.length(); i++) {
            cadena += pila.Pop();
        }
        return cadena;
    }

    public boolean revisarSintaxis(String cadena) {
        Pila<Character> pila = new Pila<>(cadena.length());
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == '(') {
                pila.Push(c);
                contador++;
            }

            if (c == ')') {
                if (contador == 0) {
                    return false;
                }

                pila.Pop();
                contador--;
            }
        }

        return contador == 0;
    }

    public Pila<Integer> ordenarVector(int[] vector) {
        Pila<Integer> pila = new Pila();
        Pila<Integer> auxiliar = new Pila();
        for (int i = 0; i < vector.length; i++) {
            pila.Push(vector[i]);
        }
        int dato = pila.Pop();

        while (!pila.vacia()) {
int nuevodato= pila.Pop();
if(dato<nuevodato) {
    auxiliar.Push(dato);
    dato = nuevodato;

}else{
    auxiliar.Push(nuevodato);
}
        }
        pila.Push(dato);

        while (!auxiliar.vacia()) {
            pila.Push(auxiliar.Pop());
        }

        return pila;
    }
    }
