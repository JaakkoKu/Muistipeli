import java.util.Random;

public class App {
    public static void main(String[] args) {

        //arvo 7 numeroa
        Random arvonta = new Random();

        //tee lista, jonne arvotut numerot lisätään
        int [] numerot = new int[7];
        

        for (int i = 0; i < numerot.length; i++){

            numerot[i] = arvonta.nextInt(5) + 1;
            
        }
        System.out.println("Yritä mnuistaa alla olevat numerot. Näet numerot 3 sekunnin ajan.");
          for (int num : numerot)
          
          {
            System.out.print(num + " ");
        }
            
            
           
        

       

       
    }
}

