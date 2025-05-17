import java.util.Random;

public class App {
    
    public static void main(String[] args){
        
        Random rand = new Random();
        Long randint = 1000000000 + rand.nextLong(9999999999L); // here 10000 is starting value and 99999 is ending value so it generates a 5 digit random no
        System.out.println(randint);

    }
}
