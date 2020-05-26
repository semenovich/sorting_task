# Сортировка таблиц

java -jar sorting_task-1.0.jar "путь"

Сделано допущение, что, т.к. данные табличные, то число табуляций в каждой строке должно быть одинаково.
Все whitespace'ы (кроме табуляции и переноса строки) считаются символами в строке. Пустой столбец считается выше, чем любой символ (не число).
Если правильно понял уточнения во время интервью, сортировка должна быть похоже на то, как linux сортирует файлы в директории.

#Условие:

Создайте java-приложение, которое будет считывать данные из источника
(файл in.txt) и выполнять их сортировку. Данные имеют табличную структуру.
Строки разделены переносом строки. Столбцы – знаком табуляции.
Данные необходимо отсортировать и вывести в файл out.txt.
Сортировка производится сначала по первой колонке строк, потом по второй
(если строки или числа в первой колонке совпадают) и т.д.. Данные относящиеся
к одной строке в гриде должны быть также в одной строке.
При этом: любое число в колонке выше любого не числа, числа отсортированы по
возрастанию, строки в лексикографическом порядке.
