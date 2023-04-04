package Seminar5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {//точка входа
        HashMap<Integer, String> hashMap=new HashMap<>(); //у MAPов нет индексов. HashMap работает как словарь- ключ: значение
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, String.valueOf(i)); //заполнили hashMap
            hashMap.putIfAbsent(i, String.valueOf(i)+"!");//складывает ключ, если такого нет
        }
        System.out.println(hashMap);//посмотреть hashMap, перебор в этом методе неудобен
        hashMap.forEach((k, v) -> System.out.println(k +"="+ v+", "));//перебор, нельзя изменить/удалить, можно только считать данные, использовать условия. lambda-выражение, более компактная запись
        
        Set<Integer> keys=hashMap.keySet();//возвращает множество - список из неповторяющихся элементов
        for (Integer k: keys) {//простейший перебор по ключам, добрались до индекса (аналог индекса), по которым можем пробежаться, нельзя удалить
            System.out.print(hashMap.get(k)+", "); //получить значение
        }

        Iterator<Integer> iterator=keys.iterator();
        while (iterator.hasNext()) {
            String v=hashMap.get(iterator.next());
            System.out.println(v+", ");
            iterator.remove();//таким способом можно удалить из map элемент с соответствующим ключом

        hashMap.remove(5);//можно удалить элемент по конкретному ключу

        System.out.println(hashMap);
        Collection<String> str = hashMap.values();
    }
    }}
