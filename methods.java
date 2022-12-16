import java.util.Scanner;

public class methods {
    static int inputNum(String msg) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print(msg);
        int num = iScanner.nextInt();
        iScanner.close();
        return num;
    }

    static void tower(int num, String start, String finish, String help) {
        if(num > 0){
            tower(num - 1, start, help, finish); // Перекладываем сначала стопку из num - 1 элементов на вспомогательный стержень, стержень-приёмник играет пока роль вспомогательного.
            System.out.printf("%s >> %s\n", start, finish); // Перекладываем самый большой диск из стержня-источника на стержень-приёмник.
            tower(num - 1, help, finish, start); // Перекладываем стопку из num - 1 элементов уже на стержень-приёмник, а стержень-источник играет пока роль вспомогательного.
        }
    }
}
