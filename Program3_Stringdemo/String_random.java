/*Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
package program3;

import java.util.Random;
import java.util.Scanner;

public class lab10 {
	public static String generateRandomString(int length) {
        String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random=new Random();
        String result="";

        for (int i=0;i<length;i++) {
            int index = random.nextInt(characters.length());
            result += characters.charAt(index);
        }
return result;
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the desired length of the random string: ");
        int length = sc.nextInt();

        String randomStr = generateRandomString(length);
        System.out.println("Generated Random String: " + randomStr);
    }
}



