package EIE3320_HW1;
//Lam Ching Yiu 21093734D
//VS Code

import java.util.Scanner;

class HW1{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        
        int input = myObj.nextInt();
        System.out.println("Hello: Lam Ching Yiu");

        int number = 0;

        for(int i = 0; i < input; i++)
        {
            System.out.println();
            for(int j = 0; j < input - 1 - i; j++)
            {
                System.out.print(" ");
                System.out.print(" ");
                System.out.print(" ");
            }
            number = i + 1;
            for(int k = 0; k < i + 1; k++)
            {                
                System.out.print(String.format("%1$3s", number));
                number--;
            }
            number = 2;
            for(int l = 0; l < i; l++)
            {                
                System.out.print(String.format("%1$3s", number));
                number++;
            }
        }
    }
}