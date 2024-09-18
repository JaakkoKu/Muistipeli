import java.util.Random;


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
       

       }

    }
    


