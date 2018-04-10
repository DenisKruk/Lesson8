import java.util.InputMismatchException;
import java.util.Scanner;

public class Recurtion {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int min = 1;
        int max = 5;

        getUserInput(min, max);
        createArray();

    }

    private static int getUserInput(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от " + min + " до " + max);
            int result;
            try {
                result = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" Вы ввели не числою");
                return getUserInput( min, max);
            }
            if (result < min || result > max) {
                System.out.println("Число не от " + min + " до "+ max);
                return getUserInput(min,max);
            }
            return result;
        }


    private  static  int[] createArray(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int length= scan.nextInt();
        int array[]= new int [length];
        if(length==0 || length >=10){
            System.out.println("длинна должна быть от 1 до 10");
            array=createArray();
        }
        System.out.println("последний элемент "+array[array.length-1]);
        return array;
        }
    }


