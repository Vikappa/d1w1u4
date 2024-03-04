import java.util.Scanner;
public class Main {


    public static int moltiplica(int num1, int num2){
        return num1*num2;
    }

    public static String[] reverseArray(String[] targetArray){
        String[] ritorno = new String[targetArray.length];
        for (int i = 0; i < targetArray.length; i++){
            ritorno[i] = targetArray[targetArray.length - 1 - i];
        }
        return ritorno;
    }

    public static String concatena(int num, String str){
        return num+str;
    }

    public static String[] inserisciInArray(String[] targetArray, String newElement){
        if(targetArray.length!= 5){
            System.out.println("L'array argomento non è valido");
            return targetArray;
        }
        String[] newArray = new String[6];
        newArray[0] = targetArray[0];
        newArray[1] = targetArray[1];
        newArray[2] = newElement;
        newArray[3] = targetArray[2];
        newArray[4] = targetArray[3];
        newArray[5] = targetArray[4];
        return newArray;
    }

    public static double perimetroRettangolo(double lato1, double lato2){
        return lato1*lato2;
    }

    public static int pariDispari(int inspected){
        if(inspected%2==0){
            return 0;
        } else {
            return 1;
        }
    }

    public static double calcolaAreaTriangolo(double latoA, double latoB, double latoC) {
        double semiperimetro = (latoA + latoB + latoC) / 2.0;
        double areaTriangolo = Math.sqrt(semiperimetro * (semiperimetro - latoA) * (semiperimetro - latoB) * (semiperimetro - latoC));

        return areaTriangolo;
    }

    public static void main(String[] args) {


        //////////////////////////////////////////// ESERCIZIO 1 ///////////////////////////////////////////////////////

        System.out.println("Moltiplico 4 e 7 col metodo moltiplica, risultato: " + moltiplica(4,7));
        System.out.println("Concateno 7 e banane, risultato: " + concatena(7,"banane"));

        String[] arrayEsempio = {"Banane", "Lampone", "c'era", "con", "te"};
        System.out.println("Uso il metodo inserisci in array,  dichiaro un array esempio e lo stampo con un ciclo for: ");
        for (int i = 0; i < arrayEsempio.length; i++){
            System.out.println(arrayEsempio[i]);
        }
        System.out.println("Adesso stampo lo stesso array dopo aver usato su di esso il metodo inserisciInArray con la stringa 'Chi'");
        arrayEsempio = inserisciInArray(arrayEsempio, "chi");
        for (int x = 0; x<arrayEsempio.length; x++){
            System.out.println(arrayEsempio[x]);
        };

        //////////////////////////////////////////// ESERCIZIO 2 ///////////////////////////////////////////////////////
        String primaStringa = "";
        String secondaStringa = "";
        String terzaStringa = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita la prima stringa:");
        if (scanner.hasNextLine()) {
            primaStringa = scanner.nextLine();
        } else {
            System.out.println("Errore: non hai inserito una stringa.");
        }

        System.out.println("Digita la seconda stringa:");
        if (scanner.hasNextLine()) {
            secondaStringa = scanner.nextLine();
        } else {
            System.out.println("Errore: non hai inserito una stringa.");
        }

        System.out.println("Digita la terza stringa:");
        if (scanner.hasNextLine()) {
            terzaStringa = scanner.nextLine();
        } else {
            System.out.println("Errore: non hai inserito una stringa.");
        }

        String[] dataCollector = {primaStringa, secondaStringa, terzaStringa};

        String[] esempioUsoMetododo = reverseArray(dataCollector);

        System.out.println("Stampo array origine");

        for (int j = 0; j < dataCollector.length; j++){
            System.out.print(dataCollector[j] + ", ");
        }

        System.out.println("Stampo il nuovo array");

        for (int j = 0; j < esempioUsoMetododo.length; j++){
            System.out.print(esempioUsoMetododo[j] + ", ");
        }

         /////////////////////////////////////////// ESERCIZIO 3 ////////////////////////////////////////////////////////
        double lato1 = 0;
        double lato2 = 0;
        Scanner scannerPerimetroRettangolo = new Scanner(System.in);
        System.out.println("Esercizio sul rettangolo, inserisci i due lati.");

        System.out.println("Inserisci il primo lato del rettangolo in double:");
        if(scannerPerimetroRettangolo.hasNextDouble()){
            lato1 = scannerPerimetroRettangolo.nextDouble();
        } else {
            System.out.println("Numero non valido, inserisci un double");
        }

        System.out.println("Inserisci il secondo lato del rettangolo in double:");
        if(scannerPerimetroRettangolo.hasNextDouble()){
            lato2 = scannerPerimetroRettangolo.nextDouble();
        } else {
            System.out.println("Numero non valido, inserisci un double");
        }

        System.out.println("Output: " + perimetroRettangolo(lato1,lato2));

        Scanner scannerPariDispari = new Scanner(System.in);

        int numeroPerPariDispari = 0;
        System.out.println("Inserisci un numero per pariDispari:");
        if(scannerPerimetroRettangolo.hasNextInt()){
            numeroPerPariDispari = scannerPerimetroRettangolo.nextInt();
        } else {
            System.out.println("Numero non valido, inserisci un int");
        }

        System.out.println("Il numero inserito è " + numeroPerPariDispari + " il suo output nel metodo pariDispari è " +pariDispari(numeroPerPariDispari));

        double latoa = 0;
        double latob = 0;
        double latoc = 0;

        System.out.println("Esercizio sul triangolo, inserisci i tre lati.");

        Scanner scannerEsercizioErone = new Scanner(System.in);

        System.out.println("Inserisci il primo lato del triangolo in double:");
        if(scannerEsercizioErone.hasNextDouble()){
            latoa = scannerEsercizioErone.nextDouble();
        } else {
            System.out.println("Numero non valido, inserisci un double");
        }


        System.out.println("Inserisci il secondo lato del triangolo in double:");
        if(scannerEsercizioErone.hasNextDouble()){
            latob = scannerEsercizioErone.nextDouble();
        } else {
            System.out.println("Numero non valido, inserisci un double");
        }

        System.out.println("Inserisci il terzo lato del triangolo in double:");
        if(scannerEsercizioErone.hasNextDouble()){
            latoc = scannerEsercizioErone.nextDouble();
        } else {
            System.out.println("Numero non valido, inserisci un double");
        }
        scannerEsercizioErone.close();

        System.out.println("L'area del triangolo è " + calcolaAreaTriangolo(latoa, latob, latoc));
    }
}