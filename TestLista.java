public class TestLista {
    public static void main(String[] args) {
        // prueba del tda lista
        Lista listaNumeros = new Lista();
        listaNumeros.insertarElemento(5);
        listaNumeros.insertarElemento(7);
        listaNumeros.insertarElemento(21);
        listaNumeros.insertarElemento(10);
        listaNumeros.insertarElemento(14);
        listaNumeros.insertarElemento(11);
        listaNumeros.insertarElemento(17);
        listaNumeros.insertarElemento(30);
        listaNumeros.insertarElemento(7);
        // boolean estaVacia = listaNumeros.estaVacia();
        // System.out.println(estaVacia);
        // String listaString = listaNumeros.toString();
        // System.out.println(listaString);

        // clase en la que se programo el metodo recorrer lista
        // prbando metodo recorrido :)
        String recorridoString = listaNumeros.recorrerLista();
        System.out.println(recorridoString);
        //int elementoaBuscar=7;
        //boolean encontrado=listaNumeros.seEncuentraElemento(elementoaBuscar);
        
    }
}
