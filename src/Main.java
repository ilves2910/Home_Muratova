import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите наименование товара: ");
        String prodname = scanner.nextLine();

        System.out.print("Введите количество товара: ");
        int quan = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String num = scanner.nextLine();


        System.out.print("Введите адрес доставки: ");
        String adress = scanner.nextLine();

        System.out.printf("\n Ваш заказ принят. \n Товар: %s в количестве %d шт прибудет к вам в ближайшее время.\n " +
                "Товар доставим по адресу: %s. Ваш контактный номер: %s.\n ", prodname, quan, adress, num);
        scanner.close();
        /* Д/з: создать приложение запрашивающее у пользователя наименование товара,
        * количество, телефон пользователя и адрес. В консоль выводит информацию о заказе, в виде:
        *  Ваш заказ принят. Товар <Наименование товара> в количестве <количество> прибудет к вам в
        *  ближайшее время. Товар доставим по адресу: <адрес>. Ваш контактный номер: <телефон>.*/

    }
}