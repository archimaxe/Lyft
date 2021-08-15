# Lyft
* В бесконечном цикле считывать номера этажей до тех пор, пока не будет введен нулевой этаж.
* Перед каждым вводом запросить номер следующего этажа - вывести сообщение "Ожидаю ввода этажа: (для завершения введите 0)", чтобы пользователь понимал, что ему вводить.
* Добавить проверку: если введенный этаж входит в диапазон допустимых значений 0-25, продолжить работу программы; а если не входит, то вывести на экран сообщение: "Такого этажа нет в доме".
* Добавить проверку: если введенный этаж = 0, нужно выйти из цикла "чтение данных из консоли".
* Если введенный этаж входит в диапазон 0-25, то нужно добавить значение в очередь и запросить ввод данных повторно.
* Для вывода информации на экран, используя метод интерфейса Queue poll, прочитать последовательно все значения и вывести на экран.
