package hw3q8;

public class Hw3Q8 {

    public static int printCollatz(int sayi) {

        System.out.println(sayi);
        
        while (sayi > 1) {
            switch (sayi % 2) {
                case 1:
                    sayi = (sayi * 3) + 1;
                    System.out.println(sayi);
                    break;
                case 0:
                    sayi = sayi / 2;
                    System.out.println(sayi);
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        printCollatz(72543);
    }

}
