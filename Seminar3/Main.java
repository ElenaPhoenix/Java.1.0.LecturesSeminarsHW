package Seminar3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Object[] i = new Object[0];
        int u = i.length;

        ArrayList<Integer> list = new ArrayList<>(); // списки - обертки вокруг массива
        ArrayList<Integer> strings = new ArrayList<>();
        strings.addAll(list); //добавление всех элементов из list в strings
        strings.clear();// clear на месте каждого элемента пишет null и удаляет связи 

        list.add(1); // добавление элемента в массив, они все являются объектами, можно добавить любые элементы: строки, буквы, цифры,... если в ArrayList<Integer> list = new ArrayList<>() убрать <>
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.forEach(n -> System.out.print(n+","));//цикл переберет все элементы, даст им локальное имя n и после выполнит указанную операцию System.out.print(n+",")
        System.out.println();
        list.remove(1); // удаление элемента из массива
        list.forEach(n -> System.out.print(n+","));
        System.out.println();
        list.add(list.size()/2, 7);//еще 1 способ добавления элемента в список, подвинет все элементы, можно указать нужный индекс
        list.forEach(n -> System.out.print(n+","));
        System.out.println();
        list.set(list.size()/2, 8);//не подвинет все элементы, а поменяет лежащий под индексом элемент
        list.forEach(n -> System.out.print(n+","));
        System.out.println();
        Collections.sort(list); //сортировка листа
        list.forEach(n -> System.out.print(n+","));
        list.sort(new Comparator<Integer>() {//Comparator - интерфейс. Самим нужно описать работу метода. Можно прописать любую сортировку
            @Override
            public int compare(Integer t0, Integer t1) {
                if ((t1-t0)%2 != 0) return 1;
                else if ((t1-t0)%2 == 0) return -1;
                return 0;
            }
        });
        list.forEach(n -> System.out.print(n+","));
        System.out.println();

        for (int j = 0; j < 5; j++) {//добавление в лист 5 случайных чисел
            list.add(new Random().nextInt(5));
            strings.add(new Random().nextInt(5));
        }

        System.out.println(list);
        System.out.println(strings);
        System.out.println("-".repeat(10));
        list.retainAll(strings);//пересечение множеств
        list.removeAll(strings);//выводит элементы, которых нет во втором списке
        System.out.println(list);

        list.forEach(n -> System.out.println(n)); //foreach имеет 2 вида написания, но функционал одинаковый, не можем менять исходник, только прочесть

        for (int n: list) {
            System.out.println(n);
        }

        Iterator<Integer> iterator = list.iterator(); //итератор - список указателей на данные, которые лежат в списке. всего 3 метода в итераторе. если изменить список - указатель будет нетуда показывать,- ошибка
        while (iterator.hasNext()){ //если есть следующий элемент, то возвращает истину
            int n = iterator.next();//возвращает следующий элемент
            System.out.println(n);
            iterator.remove();//удаляет элемент из списка
        }

        ListIterator<Integer> iterator1 = list.listIterator(list.size());//может идти в разных направлениях в отличие от 1стороннего обычного итератора.
        while (iterator1.hasPrevious()){//позволяет идти с конца в начало
            int n = iterator1.previous();
            System.out.println(n);
        }

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

        LinkedList<Integer> list1 = new LinkedList<>();//появляется 2х-связный список элементов(value,hash,hashNext,hashPrev), каждый блок знает, какой у него предыдущий и следующий. Занимает очень много места. Медленная адресация(можно зайти с начала или с конца, последовательный перебор всех элементов). Но удалить/вставить элемент можно гораздо быстрее, чем в ArrayList
        list1.add(4);
        list1.get(3);//получить значение элемента по индексом
        list1.getFirst();//получить значение первого элемента

    }

}