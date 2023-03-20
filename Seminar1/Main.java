package Seminar1;

import java.util.Random;

/**
 * main
 */
public class main { //все классы по договоренности с заглавной буквы пишутся. класс должен быть публичным. название класса должно соответствовать названию файла
//снаружи класса - вакуум, внутри класса:
//1 - поле данных  
//2- или метод. (функция обязательно должна что-то возвращать)
//в java всю программу можно писать только в теле методов, в теле класса код писать нельзя. в теле класса только можно что-то объявлять

//объявляем переменные через ; - примитивный тип данных, дефолтные значения (по умолчанию)=0:
    static int i=1; //32 bit - основной используемый. можно записать 'd'- будет хранить индекс d
    static long l; //64 bit - еще один основной используемый
    byte b; //8 bit
    short sh;   //16 bit
    float f; //32 bit floating point
    double d; //64 bit floating point
    static boolean aBoolean; //по умолчанию ложь
    char aChar=65; //16 bit  без знака, хранит индекс буквы в таблице ASCII

    String string = "Привет мир!"; //String - класс(объект, ctrl+клик - описание). ссылочная переменная
    String tmps=new String(); //конструктор всегда называется также как класс
    String sstring="";//объявление пустой строки

    static int[] ints=new int[4]; //массив - объект, под него нужно выделить определенное место. самые быстрые, используются для производительности. по умолчанию заполняются нулями
    public static void Mainn(String[] args) {//для работы обязательна точка входа
        int[] tmp=new int[ints.length*2+1];

        Random random = new Random();
        
        for (int j = 0; j < ints.length; j++) {
            tmp[j] = ints[j]+random.nextInt(100);//заполнение массива
        }
        tmp[5]=5;
        ints=tmp;//увеличение длины массива ints
        
        if (aBoolean){
            getInt(String.valueOf(12)); //к статическим методам можно обращаться из класса Main, чтобы обращаться к динамическим нужно создавать объект
        //чтобы добраться по переменной i из статического метода, переменная тоже должна быть статической
        }else if (l>i){
            getInt(String.valueOf(13));
        }else{
            getInt(String.valueOf(14));
        }
        
        // for (int i=ints){
        //     System.out.println(i);//цикл foreach сам понимает, что нужно перебрать каждый элемент массива. может только считать данные, не можем обращаться к отдельному элементу массива
        // }
    }
    
    static int getInt(String strToInt){// в java метод обязательно что-то возвращает
        int i=0;
        main.l=i;//this- отсылка к классу
        return Integer.parseInt(strToInt);
    }

    static void print(String str){
        System.out.println(str);        
    }

}