import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        final int CONSTANT = 0; //создание константы

        System.out.println("\t\t------Switch_Case------\n");

        Scanner scanner = new Scanner(System.in);
        int age = 0;
        switch(age){
            case 0:
                System.out.println("age = 0\n");
                break;
            case 2:
                System.out.println("age = 2\n");
        }

        System.out.println("\t\t------Arrays------");
        int number = 10;
        int[] numbers = new int[5]; //create array
        int[] Arr = {1,2,3,4,5}; //array create and filling
        int[][] matrice = {{1,2,3},{4,5,6},{7,8,9}}; //two-dimensional array
    }
}