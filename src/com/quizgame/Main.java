package com.quizgame;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result[] = new int[5];
        int answer[] = {1, 2, 3, 3, 1};

        System.out.println("What is the National Bird of India:\n1.Peacock\n2.Cuckoo\n3.Woodpecker\n4.KingFisher");
        System.out.print("Enter u r option:");
        result[0] = scan.nextInt();
        scan.nextLine();

        System.out.println("What is the National Animal of India:\n1.Lion\n2.Tiger\n3.Elephant\n4.Leopard");
        System.out.print("Enter u r option:");
        result[1] = scan.nextInt();
        scan.nextLine();

        System.out.println("Who was the first Prime Minister of India:\n1.Narendra Modi\n2.Mahatma Gandhi\n3.Jawaharlal Nehru\n4.Dr. B.R. Ambedkar");
        System.out.print("Enter u r option:");
        result[2] = scan.nextInt();
        scan.nextLine();

        System.out.println("Which planet is known as the Red Planet:\n1.Earth\n2.Jupiter\n3.Mars\n4.Venus");
        System.out.print("Enter u r option:");
        result[3] = scan.nextInt();
        scan.nextLine();

        System.out.println("What is the capital of Rajasthan:\n1.Jaipur\n2.Udaipur\n3.Jodhpur\n4.Kota");
        System.out.print("Enter u r option:");
        result[4] = scan.nextInt();
        scan.nextLine();

        for (int i=0;i<result.length;i++){
            if(result[i]==answer[i])    System.out.println("Corrrect!");
            else    System.out.println("Wrong!\nCorrrect option is :"+answer[i]);
        }

        scan.close();

    }

}
