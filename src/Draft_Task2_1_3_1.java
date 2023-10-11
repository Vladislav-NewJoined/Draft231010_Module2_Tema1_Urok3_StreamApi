// источник: https://translated.turbopages.org/proxy_u/en-ru.ru.0cc97ead-65264417-972a28c4-74722d776562/https/www.baeldung.com/java-stream-operations-on-strings

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Draft_Task2_1_3_1 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Урок 3. Введение в StreamApi, создание потока данных. Цель задания: Знакомство с методом collect() совершенствование навыков работы с потоками данных в JAVA.\s
                   Задание: Используя Stream вам необходимо объединить данные три строки “I”, “LOVE”, “JAVA” 
                   Dы создаете новый поток из простых строк, а затем собираете их в одну при помощи метода collect()\s

                Решение:\s""");

        String[] array = {"I", "LOVE", "JAVA"};
        System.out.println(Arrays.asList(array)
                .stream()
                .collect(Collectors.joining(" ")));

//        String[] array = {"Java", "Ruuuuussshhh"};
//        Stream<String> streamOfArray = Arrays.stream(array);
//        streamOfArray.map(s -> s.split("")) //Преобразование слова в массив букв
//                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
//                .collect(Collectors.toList()).forEach(System.out::println);







//        String[] array = {"I", "LOVE", "JAVA"};
//        System.out.println(Arrays.asList(array)
//                .stream()
//                //.map(...)
//                .collect(Collectors.joining(" "/*,"[","]"*/)));










/*        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s -> s.split(" ")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream)*//*.distinct() //выравнивает каждый сгенерированный поток в один поток*//*
                .collect(Collectors.toList()).forEach(System.out::print);*/
    }

//    public static String joinWithPrefixPostfix(String[] arrayOfString){
//        return Arrays.asList(arrayOfString)
//                .stream()
//                //.map(...)
//                .collect(Collectors.joining(",","[","]"));
//    }
}
