import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// мин 05 28 - разберемся, что здесь произошло
// мин 20 50 в видео - коллекция

//class Person {
//
//    String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                '}';
//    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}

public class Draft_Task2_1_3_0_Whole_Video {
    public static void main(String[] args) {


        String[] array = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList()).forEach(System.out::println);




//        Random random = new Random();
//        System.out.println(IntStream.generate(() -> random.nextInt(10)).limit(10).sum());

//        String[] array = {"I", "LOVE", "JAVA"};
////        System.out.println(Stream.of(array).collect());



//        ArrayList<Person> arrayList = new ArrayList<>();
//        arrayList.add(new Person("Вася"));
//        arrayList.add(new Person("Петя"));
//        arrayList.add(new Person("Саша"));
//        arrayList.stream().collect(new Person("Вася"),
//                new Person("Петя"), new Person("Саша"));



//        ArrayList<Person> arrayList = new ArrayList<>();
//        arrayList.add(new Person("Вася"));
//        arrayList.add(new Person("Петя"));
//        arrayList.add(new Person("Саша"));
//        arrayList.stream().forEach(System.out::println);

//        Stream.of(/*new Person(), new Person(), new Person()*/).forEach(System.out::println);

//        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
//        int summary = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                summary += array[i];
//            }
//        }
//        System.out.println(summary);
//
//        System.out.println(IntStream.of(array).filter((a) -> a > 0).sum());
//        System.out.println(IntStream.of(array).filter((a) -> a > 0).count());
//        System.out.println(IntStream.of(array).filter((a) -> a > 0).max());

//        IntStream.of(10, 11).forEach(System.out::println);
//        IntStream.generate(() -> 1).forEach(System.out::println);
//        IntStream.range(-10, 10).forEach(System.out::println);
//        IntStream.rangeClosed(-10, 10).forEach(System.out::println);


    }
}


