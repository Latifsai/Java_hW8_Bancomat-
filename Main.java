import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int TAKE_MONEYONETIME = 800;
    static final int TAKE_MONEYINONEDAY = 2000;
    static final int OPERATOINSINIMEDAY = 5;

    public static void main(String[] args) {

        int fullSum = 0;
        int operationInThisDay = 0;
        boolean isMoneyTaken = false;
        int balance = 10000;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Какую сумму выхотите снять?");
            int cash = scanner.nextInt();
            if (cash > TAKE_MONEYONETIME) {
                System.out.println("Вы первысили сумму сьема за один раз");
            }else if (fullSum > TAKE_MONEYINONEDAY) {
                System.out.println("Вами был превышен лимит доступных к снятию в день денежных средств");
                break;
            }
            else {

                balance = balance - cash;
                operationInThisDay++;
                fullSum +=cash;
                System.out.println("Ваша операция завершена ваш баланс сейчас составляет " + balance + ",колличество выполненых операций " + operationInThisDay);



            }


            if (operationInThisDay > OPERATOINSINIMEDAY) {
                System.out.println("Колличевто доступных операций в день превышенно");
                break;
            }


        } while (isMoneyTaken == false);


    }
}