public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1: ");
        int total = 0;
        int income = 15_000;
        short month = 0;
        while (total <= 2_459_000) {
            month++;
            total += income;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Task 2: ");
        byte number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (byte i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task 3: ");
        int population = 12_000_000;
        for (byte year = 1; year <= 10; year++) {
            population = population + (population * 17 / 1000) - (population * 8 / 1000);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println("Task 4: ");
        int capitalOfVasiliy = 15_000;
        for (short i = 1; capitalOfVasiliy <= 12_000_000; i++) {
            capitalOfVasiliy += capitalOfVasiliy / 100 * 7;
            System.out.println("Месяц " + i + ", сумма накоплений " + capitalOfVasiliy + " рублей.");
        }

        System.out.println("Task 5: ");
        int capitalOfVasiliy1 = 15_000;
        for (short i = 1; capitalOfVasiliy1 <= 12_000_000; i++) {
            capitalOfVasiliy1 += capitalOfVasiliy1 / 100 * 7;
            if (i % 6 == 0 || capitalOfVasiliy1 >= 12_000_000) {
                System.out.println("Месяц " + i + ", сумма накоплений " + capitalOfVasiliy1 + " рублей.");
            }
        }

        System.out.println("Task 6: ");
        int capitalOfVasiliy2 = 15_000;
        short monthNumber = 1;
        while (monthNumber / 12 != 9) {
            capitalOfVasiliy2 += capitalOfVasiliy2 / 100 * 7;
            if (monthNumber % 6 == 0 || monthNumber / 12 == 9) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений " + capitalOfVasiliy2 + " рублей.");
            }
            monthNumber++;
        }

        System.out.println("Task 7: ");
        int friday = 3;
        for (byte i = 1; i <= 31; i++) {
            if (i == friday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
                friday += 7;
            }
        }

        System.out.println("Task 8: ");
        short startCalculation = 1825;
        short endCalculation = 2125;
        for (short i = 0; i <= endCalculation; i++) {
            if (i % 79 == 0 && i >= startCalculation) {
                System.out.println(i);
            }
        }
    }
}
