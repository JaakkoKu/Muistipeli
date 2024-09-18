import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //arvo 7 numeroa
        Random arvonta = new Random();

        //tee lista, jonne arvotut numerot lisätään
        int [] numerot = new int[7];
        

        //arvo 7 numeroa väliltä 1-5
        for (int i = 0; i < numerot.length; i++){

            numerot[i] = arvonta.nextInt(5) + 1;
            
        } //printtaa viesti arvottujen nr jälkeen
        System.out.println("Yritä mnuistaa alla olevat numerot. Näet numerot 3 sekunnin ajan.");
          //väli jokaisen numeron jälkeen
        for (int num : numerot)
          
          {
            System.out.print(num + " ");
        }
        System.out.println();
        try{ //lepo 3 sec
            Thread.sleep(3000);

        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        //printtaa 20 tyhjää riviä
            for (int a = 0; a <20; ++a) System.out.println();

        

            //u = arvatun numero järjestysnumero
            
            Scanner scanner = new Scanner(System.in);
            int numbras [] = new int [7];
            for (int u = 0; u < numbras.length; u++){
            
        System.out.println("Syötä " + (u+1) + ". numero: ");
       numbras [u]= scanner.nextInt();
       
       
            }
            System.out.println("Syöttämäsi numerot ovat:");
            for (int numberot : numbras)
            System.out.print(numberot + " ");
            System.out.println();
            System.out.println("Oikeat numerot olivat:");
            
            for (int num : numbras){
                System.out.print(num + " ");
            }
           
        

        scanner.close();

       }

    }
    