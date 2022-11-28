// Вводится строка в формате dd.MM.yyyy. Определить является ли год високосным.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) throws Exception {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String tempDate = reader.readLine();
            boolean dateValidity = IsDateValid.isDateValid(tempDate);
            if (dateValidity) {
                String[] dateParts = tempDate.split("\\.");
                int year = Integer.parseInt(dateParts[2]);
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
                {
                    System.out.println(year + " високосный год.");
                } else
                    System.out.println(year + " не високосный год.");
                break;
            }
            else {
                System.err.println("Такой даты не существует и/или формат неверный. Введите заново.");
            }
        }
    }
}
