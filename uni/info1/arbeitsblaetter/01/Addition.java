import java.util.InputMismatchException;
import java.util.Scanner;

public class Addition {

    
    
    //Blackbox
    private final static Scanner scanner = new Scanner(System.in);


    //hier werden die alle Variablen, die für die Aufgabe nötig sind deklariert.
    //deklarieren einer Variable bedeutet, dass man der Variable einen Namen und einen Typ zuweist,
    //mit denen sie dann im Arbeitsspeicher gespeichert wird und man zu späterer Zeit durch aufrufen
    //des Variablennamens auf diesen Speicherplatz zugreifen kann.
    //nicht initialisierte Variablen des Typs Integer (int) haben in Java immer den Wert 0.
    
    private static int eingabe1;
    
    private static int eingabe2;
    
    private static int summe;
    
    
    
    public static void main(String[] args) {

        //hier werden die vorher deklarierten Variablen nun initialisiert.
        //Initialisieren einer Varible beudeutet, dass man ihr einen ihrem Typ entsprechenden Wert zuweist.
        //Man füllt somit den Speicherplatz, auf den die Variable zeigt.
         
        eingabe1 = readIntFromConsole();
        
        eingabe2 = readIntFromConsole();
        
        summe = eingabe1 + eingabe2;
        
        
        //printing num1 onto the consol
        System.out.println("Eingabe1: " + eingabe1);
        
        //printing num2 onto the consol
        System.out.println("Eingabe2: " + eingabe2);
    
        //printing sum onto the consol
        System.out.println("Summe: " + summe); 
    
    }

    /**
     * Blackbox-Methode zum Einlesen aus der Konsole. Bei einer fehlerhaften Eingabe wird zu einer
     * erneuten Eingabe aufgefordet,
     *
     * @return Bei korrekter Eingabe, die Eingabe als int
     */
    public static int readIntFromConsole() {

        System.out.print("Please insert an integer: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("[Error] Input is not a whole number!");
            scanner.next();
        }

        return readIntFromConsole();
    }
}
