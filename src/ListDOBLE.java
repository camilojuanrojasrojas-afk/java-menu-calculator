import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ListDOBLE {  
        private  static Doublelist lista = new Doublelist();
    
    public static void first (){
       
        String elemen1Str = JOptionPane.showInputDialog(null, "Ingrese el elemento a agregar al principio:");
                    int elemento1 = Integer.parseInt(elemen1Str);
                    lista.addprimero(elemento1);
    }
    public static void   end (){
         String elemen2Str = JOptionPane.showInputDialog(null, "Ingrese el elemento a agregar al final:");
                    int elemen2 = Integer.parseInt(elemen2Str);
                    lista.aggultimo(elemen2);
     }
    public static void  inter (){
          String elemen3Str = JOptionPane.showInputDialog(null, "Ingrese el elemento a agregar:");
                    int elemen3 = Integer.parseInt(elemen3Str);
                    String posicion3Str = JOptionPane.showInputDialog(null, "Ingrese la posición donde desea agregar el elemento:");
                    int posicion3 = Integer.parseInt(posicion3Str);
                    lista.aggAt(elemen3, posicion3);
    }
    public static void  eliminar_prin(){
        try {
                        int elimi1 = lista.removeFirst();
                        JOptionPane.showMessageDialog(null, "Se eliminó el elemento " + elimi1 + " al principio.");
                    } catch (NoSuchElementException e) {
                        JOptionPane.showMessageDialog(null, "La lista está vacía.");
                    }
    }
    public static void  eliminar_final(){
        try {
                        int elimi2 = lista.removeLast();
                        JOptionPane.showMessageDialog(null, "Se eliminó el elemento " + elimi2 + " al final.");
                    } catch (NoSuchElementException e) {
                        JOptionPane.showMessageDialog(null, "La lista está vacía.");
                    }
        
    }
    public static void  eliminar_posinter(){
         try {
                        String pos6Str = JOptionPane.showInputDialog(null, "Ingrese la posición del elemento a eliminar:");
                        int pos6 = Integer.parseInt(pos6Str);
                        int elimi3 = lista.removera(pos6);
                        JOptionPane.showMessageDialog(null, "Se eliminó el elemento " + elimi3 + " en la posición " + pos6 + ".");
                    } catch (NoSuchElementException e) {
                        JOptionPane.showMessageDialog(null, "La lista está vacía.");
                    } catch (IndexOutOfBoundsException e) {
                        JOptionPane.showMessageDialog(null, "La posición ingresada es inválida.");
                    }
    } 
    public static void  obtener_primerelem(){
        try {
                        int primero = lista.getFirst();
                        JOptionPane.showMessageDialog(null, "El primer elemento es: " + primero);
                    } catch (
                                        NoSuchElementException e) {
                    JOptionPane.showMessageDialog(null, "La lista está vacía.");
                } 
    }
    public static void  obtener_ultimoelem(){
        try {
                    int ultimo = lista.getLast();
                    JOptionPane.showMessageDialog(null, "El último elemento es: " + ultimo);
                } catch (NoSuchElementException e) {
                    JOptionPane.showMessageDialog(null, "La lista está vacía.");
                }
                
    }
    public static void  obtener_elementoposespeci(){
        try {
                    String posicion9Str = JOptionPane.showInputDialog(null, "Ingrese la posición del elemento que desea obtener:");
                    int posicion9 = Integer.parseInt(posicion9Str);
                    int elemento9 = lista.getAt(posicion9);
                    JOptionPane.showMessageDialog(null, "El elemento en la posición " + posicion9 + " es: " + elemento9);
                } catch (NoSuchElementException e) {
                    JOptionPane.showMessageDialog(null, "La lista está vacía.");
                } catch (IndexOutOfBoundsException e) {
                    JOptionPane.showMessageDialog(null, "La posición ingresada es inválida.");
                }
        
    }
    public static void imprimir_lista (){
          StringBuilder listaStr = new StringBuilder("Lista: ");
                      for (int i = 0; i < lista.tamaño(); i++) {
                      int elemento = lista.getAt(i);
                      listaStr.append(elemento);
                      if (i < lista.tamaño() - 1) {
                      listaStr.append(", ");
                      
     }


    }
     }
    public static void sumar (){
         try {
                    int suma = lista.sum();
                    JOptionPane.showMessageDialog(null, "La suma de los elementos de la lista es: " + suma);
                } catch (NoSuchElementException e) {
                    JOptionPane.showMessageDialog(null, "La lista está vacía.");
                }
    }
    public static void resta (){
         try {
                    int resta = lista.rest();
                    JOptionPane.showMessageDialog(null, "La resta de los elementos de la lista es: " + resta);
                } catch (NoSuchElementException e) {
                    JOptionPane.showMessageDialog(null, "La lista está vacía.");
                }
    }
    public static void multiplicacion (){
        try {
                    int multiplicacion = lista.mul();
                    JOptionPane.showMessageDialog(null, "La multiplicacion de los elementos de la lista es: " + multiplicacion);
                } catch (NoSuchElementException e) {
                    JOptionPane.showMessageDialog(null, "La lista está vacía.");
                }
    }
    public static void division (){
         try {
                    double division = lista.div();
                    JOptionPane.showMessageDialog(null, "La division de los elementos de la lista es: " + division);
                } catch (NoSuchElementException e) {
                    JOptionPane.showMessageDialog(null, "La lista está vacía.");
                } catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre 0.");
                }
     }
    public static void maximo (){
       try {
                    int maximo = lista.findMax();
                    JOptionPane.showMessageDialog(null, "El valor máximo de la lista es: " + maximo);
                } catch (NoSuchElementException e) {
                    JOptionPane.showMessageDialog(null, "La lista está vacía.");
                }  
     }
    public static void minimo () {
         try {
                    int minimo = lista.findMin();
                    JOptionPane.showMessageDialog(null, "El valor mínimo de la lista es: " + minimo);
                } catch (NoSuchElementException e) {
                    JOptionPane.showMessageDialog(null, "La lista está vacía.");
                }
     }
    public static void finalizar (){
         JOptionPane.showMessageDialog(null, "que tengas buen dia");
    
    }




      public static void main(String[] args) {
          
        Interfaz formulario = new Interfaz();

        // Configurar propiedades del formulario
        formulario.setTitle("Mi menu ");
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mostrar el formulario
        formulario.setVisible(true);
    


    }
    public static class Doublelist {
    private Node cab;
    private Node cola;
    private int tamaño;

        private void subtractAll() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void agg(int data, int index) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        void remover(int index) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        int obte(int index) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    private class Node {
        int info;
        Node ant;
        Node sig;

        public Node(int info) {
            this.info = info;
        }
    }

    public Doublelist() {
        cab = null;
        cola = null;
        tamaño = 0;
    }

    public boolean Empty() {
        return tamaño == 0;
    }

    public int tamaño() {
        return tamaño;
    }

    public void addprimero(int info) {
        Node nuevoNode = new Node(info);
        if (Empty()) {
            cola = nuevoNode;
        } else {
            cab.ant = nuevoNode;
        }
        nuevoNode.sig = cab;
        cab = nuevoNode;
        tamaño++;
    }

    public void aggultimo(int info) {
        Node nuevoNode = new Node(info);
        if (Empty()) {
            cab = nuevoNode;
        } else {
            cola.sig = nuevoNode;
            nuevoNode.ant = cola;
        }
        cola = nuevoNode;
        tamaño++;
    }

    public void aggAt(int info, int index) {
        if (index < 0 || index > tamaño) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addprimero(info);
        } else if (index == tamaño) {
            aggultimo(info);
        } else {
            Node current = cab;
            for (int g = 0; g < index - 1; g++) {
                current = current.sig;
            }
            Node nuevoNode = new Node(info);
            nuevoNode.sig = current.sig;
            nuevoNode.sig = current;
            current.sig.ant = nuevoNode;
            current.sig = nuevoNode;
            tamaño++;
        }
    }

    public int removeFirst() {
        if (Empty()) {
            throw new NoSuchElementException();
        }
        int data = cab.info;
        cab = cab.sig;
        tamaño--;
        if (Empty()) {
            cab = null;
        } else {
            cab.ant = null;
        }
        return data;
    }

    public int removeLast() {
        if (Empty()) {
            throw new NoSuchElementException();
        }
        int data = cola.info;
        cola = cola.ant;
        tamaño--;
        if (Empty()) {
            cab = null;
        } else {
            cola.sig = null;
        }
        return data;
    }

    public int removera(int index) {
        if (index < 0 || index >= tamaño) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == tamaño - 1) {
            return removeLast();
        } else {
            Node current = cab;
            for (int i = 0; i < index; i++) {
                current = current.sig;
            }
            int data = current.info;
            current.ant.sig = current.sig;
            current.sig.ant = current.ant;
            tamaño--;
            return data;
        }
    }

    public int getFirst() {
        if (Empty()) {
            throw new NoSuchElementException();
        }
        return cab.info;
    }

    public int getLast() {
        if (Empty()) {
            throw new NoSuchElementException();
        }
        return cola.info;
    }

    public int getAt(int index) {
        if (index < 0 || index >= tamaño) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return getFirst();
        } else if (index == tamaño - 1) {
            return getLast();
        } else {
            Node current = cab;
            for (int i = 0; i < index; i++) {
                current = current.sig;
            }
            return current.info;
        }
    }

    public void printList() {
        Node current = cab;
        while (current != null) {
            System.out.print(current.info + " ");
            current = current.sig;
        }
        System.out.println();
    }
    public int sum() {
    int result = 0;
    Node current = cab;
    while (current != null) {
        result += current.info;
        current = current.sig;      
    }
        System.out.println("la suma es "+ result);
    return result;
       
}
    public int rest() {
    int result = 0;
    Node current = cab;
    while (current != null) {
        result -= current.info;
        current = current.sig;      
    }
        System.out.println("la resta es "+ result);
    return result;
       
}
    public int mul() {
    int result=1;
    Node current = cab;
    while (current != null) {
        result *= current.info;
        current = current.sig;      
    }
        System.out.println("la multiplicaion es "+ result);
    return result;
       
}
    public int div() {
    int result = 1;
    Node current = cab;
    while (current != null) {
        result /= current.info;
        current = current.sig;      
    }
        System.out.println("la divicion es "+ result);
    return result;
       
}
     public int findMax() {
        if (Empty()) {
            throw new NoSuchElementException();
        }
        int max = cab.info;
        Node current = cab;
        while (current != null) {
            if (current.info > max) {
                max = current.info;
            }
            current = current.sig;
        }
         System.out.println("El numero mayor es "+max);
        return max;
    }
      public int findMin() {
        if (Empty()) {
            throw new NoSuchElementException();
        }
        int min = cab.info;
        Node current = cab;
        while (current != null) {
            if (current.info < min) {
                min = current.info;
            }
            current = current.sig;
        }
          System.out.println("El numero menor es "+min);
        return min;
        }
    }
}

