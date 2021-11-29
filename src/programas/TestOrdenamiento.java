package programas;

import datos.DatosDesordenados;
import datos.DatosOrdenados;
import javax.swing.JOptionPane;

public class TestOrdenamiento {
    public static void main(String[] args) {
        
        DatosDesordenados m;
        //DatosOrdenados datosOrd;
        int n, s; 
        long t, t1, t2;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos datos son?"));
        s = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el valor máximo?"));
        
        System.out.println("=====================");
        System.out.println("Número de datos: " + n);
        System.out.println("Valor de los datos: de 0 hasta " + s);
        
        m = new DatosDesordenados(s, n);
        m.generarValores();
        System.out.println("" + m);
        
        //bubbleSort (Descendente)
        t1 = System.nanoTime();   // start
        DatosOrdenados mob = m.bubbleSortDescendente();
        t2 = System.nanoTime();   // stop
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Burbuja(Descendente) = " + mob);
        
        System.out.println("=====================");
        
        //bubbleSort (Descendente reordenamiento)
        t1 = System.nanoTime();   // start
        mob = m.bubbleSortDescendente();
        t2 = System.nanoTime();   // stop
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Burbuja(Descendente reordenamiento) = " + mob);
        
        System.out.println("=====================");
        
        //bubbleSort (Ascendente)
        t1 = System.nanoTime();   // start
        mob = m.bubbleSortAscendente();
        t2 = System.nanoTime();   // stop
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Burbuja(Ascendente) = " + mob);
        
        System.out.println("=====================");
        
        /*
        //insertSort
        t1 = System.nanoTime();   // start
        DatosOrdenados moi = m.insertSort();
        t2 = System.nanoTime();   // stop
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Inserción = " + moi);
        
        System.out.println("=====================");
        */
        
        //quickSort (Descendente)
        t1 = System.nanoTime();   // start
        DatosOrdenados moq = m.quickSortDescendente();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Rápido (Descendente) = " + moq);
        
        System.out.println("=====================");
        
        //quickSort (Descendente reordenamiento)
        t1 = System.nanoTime();   // start
        moq = m.quickSortDescendente();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Rápido (Descendente reordenamiento) = " + moq);
        
        System.out.println("=====================");
        
        //quickSort (Ascendente)
        t1 = System.nanoTime();   // start
        moq = m.quickSortAscendente();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Rápido (Ascendente) = " + moq);
        
        System.out.println("=====================");
        
        /*
        //mergeSort
        
        t1 = System.nanoTime();   // start
        DatosOrdenados mom = m.mergeSort();
        t2 = System.nanoTime();   // stop
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Merge = " + mom);
        
        System.out.println("=====================");
        */
    }
}
