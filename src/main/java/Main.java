import java.util.*;

public class Main {
    /*
+    В бесконечном цикле считывать номера этажей до тех пор, пока не будет введен нулевой этаж.
+    Перед каждым вводом запросить номер следующего этажа - вывести сообщение "Ожидаю ввода этажа: (для завершения введите 0)", чтобы пользователь понимал, что ему вводить.
+    Добавить проверку: если введенный этаж входит в диапазон допустимых значений 0-25, продолжить работу программы; а если не входит, то вывести на экран сообщение: "Такого этажа нет в доме".
+    Добавить проверку: если введенный этаж = 0, нужно выйти из цикла "чтение данных из консоли".
+    Если введенный этаж входит в диапазон 0-25, то нужно добавить значение в очередь и запросить ввод данных повторно.
+    Для вывода информации на экран, используя метод интерфейса Queue poll, прочитать последовательно все значения и вывести на экран.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stages = new ArrayDeque<>();

        while (true){
            System.out.println("Введите номер этажа (1-25). Для завершения введите 0.");
            int stage = scanner.nextInt();
            if (stage < 0 || stage > 25) {
                System.out.println("Такого этажа нет в доме");
            } else if (stage == 0) break;
                else {
                stages.add(stage);
            }
        }

        int waitDoorsInSeconds = 10;         // - количество секунд, которое потребуется на закрытие/открытие дверей;
        int waitMoveInSeconds = 5;           // - количество секунд, затрачиваемое лифтом на движение между этажами;
        int totalSeconds = 0;                // - всего потрачено времени на движение и остановки лифтом;
        int previousFloor = -1;              // - переменная для хранения предыдущей остановки.

        Integer town;
        while ((town = stages.poll()) != null) {
            System.out.println(town);
        }

    }
}
