import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n");

        System.out.println("Введите первый вес: ");
        int first = new Scanner(System.in).nextInt();

        System.out.println("Введите второй вес: ");
        int second = new Scanner(System.in).nextInt();

        System.out.println("Введите третий вес: ");
        int third = new Scanner(System.in).nextInt();


        int greatest = 0;
        int average = 0;
        int smallest = 0;

        //todo дописать логику программы ниже.

        if (first > second && first > third){
            greatest = first;
        } else if (second > first && second > third) {
            greatest = second;
        } else {
            greatest = third;
        }

        if (first < second && first < third){
            smallest = first;
        } else if (second < first && second < third) {
            smallest = second;
        } else {
            smallest = third;
        }

        if ((first > second && first < third) || (first < second && first > third)){
            average = first;
        } else if ((second > first && second < third) || (second < first && second > third)){
            average = second;
        } else {
            average = third;
        }

        //todo

        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);

    }
}
