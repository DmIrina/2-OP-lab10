import task1.Counter;
import task1.FourDoubleInterface;
import task2.Person;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        System.out.println("Lab 10: lambda-expressions and functional interfaces\n");

        // task 1

        FourDoubleInterface task7 = (a, b, c, d) -> Counter.calc7(a, b, c, d);
        FourDoubleInterface task8 = (a, b, c, d) -> Counter.calc8(a, b, c, d);
        FourDoubleInterface task9 = (a, b, c, d) -> Counter.calc9(a, b, c, d);

//        FourDoubleInterface task7 = Counter::calc7;
//        FourDoubleInterface task8 = Counter::calc8;
//        FourDoubleInterface task9 = Counter::calc9;

        System.out.println("-------Task 1-------\n");
        test(task7, -3.45, 2.34, 1.45, 0.83, "Task 7");
        test(task8, 0.345, -2.25, 2.65, 3.99,"Task 8");
        test(task9,-2.98, 5.55, 0.045, 0.129,"Task 9");

        //task 2

        System.out.println("-------Task 2-------\n");

        Person john = new Person(67, "John", "doctor");
        Person mary = new Person(23, "Mary", "translator");
        Person levi = new Person(32, "Levi", "military");
        Person anna = new Person(20, "Anna", "software engineer");

        ArrayList<Person> people = new ArrayList<>();
        people.add(john);
        people.add(mary);
        people.add(levi);
        people.add(anna);

        people.forEach(person -> System.out.println(person));
        //people.forEach(System.out::println);
    }

    static void test(FourDoubleInterface lb, double a, double b, double c, double d, String taskName){
        System.out.println(taskName);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("Result = " + lb.applyAsDouble(a, b, c, d));
        System.out.println();
    }
}
