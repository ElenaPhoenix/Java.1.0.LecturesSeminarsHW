// 1. Реализовать алгоритм сортировки списков компаратором.
// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
// 4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
// 5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
// 6. Повторить пятый пункт но с LinkedList.
// 7. Сравнить время работы пятого и шестого пунктов.

package HomeworkAfterSeminar3;

import java.util.*;

public class Main {


    public static void main(String[] args) {//точка входа
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("s");
        list1.add("apple");
        list1.add("window");
        list1.add("fruits");
        list1.add("shadows");
        list1.forEach(n -> System.out.println(n+" "));
        System.out.println();

        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("1. Сортировка списка компаратором: "+list1);
        System.out.println();


        ArrayList<Integer> list2 = new ArrayList<>();
        for (int j = 0; j < 10; j++) {//добавление в лист 5 случайных чисел
            list2.add(new Random().nextInt(10));
        }
        System.out.print("2. Рандомный список целых чисел: ");
        list2.forEach(n -> System.out.print(n+" "));
        System.out.println();
        Iterator<Integer> listIterator = list2.iterator();
        while (listIterator.hasNext()){ 
            Integer n = listIterator.next();
            if (n%2==0){
                listIterator.remove();
            }
            }
        System.out.println("После удаления четных чисел список выглядит так: "+list2);
        System.out.println();


        System.out.println("3. Максимальное значение списка: "+Collections.max(list2));
        System.out.println("Минимальное значение списка: "+Collections.min(list2));           
        System.out.println("Среднее значение списка: "+list2.stream().mapToInt(a -> a).average().orElse(0));
        System.out.println();


        ArrayList<Integer> list3 = new ArrayList<>();
        for (int j = 0; j < 7; j++) {
            list3.add(new Random().nextInt(10));
        }
        System.out.print("4. Первый список целых чисел: ");
        list3.forEach(n -> System.out.print(n+" "));
        System.out.println();

        ArrayList<Integer> list4 = new ArrayList<>();
        for (int j = 0; j < 7; j++) {
            list4.add(new Random().nextInt(10));
        }
        System.out.print("Второй список целых чисел: ");
        list4.forEach(n -> System.out.print(n+" "));
        System.out.println();

        list4.removeAll(list3);
        list3.addAll(list4);
        System.out.println("Объединенный список, не допуская уже встречающиеся в первом элементы второго списка: "+list3);
        System.out.println();


        ArrayList<Integer> list5 = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            list5.add(new Random().nextInt(10));
        }
        System.out.println("5. Создан целочисленный список: "+list5);

        ArrayList<String> list6 = new ArrayList<>();
        list6.add(0, "0".repeat(10000));
            for (Integer myInt : list5) { 
            list6.add(String.valueOf(myInt)); 
        }
        System.out.println("Добавлен нулевой элемент (0, повторенный 10000 раз): "+ list6);
        System.out.println();
            

        LinkedList<Integer> linkList1 = new LinkedList<>();
        for (int j = 0; j < 5; j++) {
            linkList1.add(new Random().nextInt(10000));
        }
        System.out.println("6. Создан целочисленный список LinkedList: "+linkList1);

        LinkedList<String> linkList2 = new LinkedList<>();
        linkList2.add(0, "0".repeat(10));
            for (Integer myInt : linkList1) { 
                linkList2.add(String.valueOf(myInt)); 
        }
        System.out.println("Добавлен нулевой элемент (0, повторенный 10000 раз): "+ linkList2);
        System.out.println();


        String strArList = " ";
        String resArList = String.join(strArList, list6);
        //System.out.println(resArList); 
        long begin1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            resArList+= Character.getName(i); // возвращает букву
        }
        long end1 = System.currentTimeMillis();
        long operSpeed1;
        operSpeed1=end1 - begin1;
        System.out.println("7. Скорость ArrayList: " + operSpeed1);

        String strLinkList = " ";
        String resLinkList = String.join(strLinkList, linkList2);
        //System.out.println(resLinkList); 
        long begin2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            resLinkList+= Character.getName(i); // возвращает букву
        }
        long end2 = System.currentTimeMillis();
        long operSpeed2;
        operSpeed2=end2 - begin2;
        System.out.println("Скорость LinkedList: " + operSpeed2);
        System.out.println("LinkedList быстрее ArrayList на: "+(operSpeed1-operSpeed2));

        }
}
