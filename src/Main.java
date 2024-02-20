import java.io.Serializable;
import java.rmi.Remote;
import java.util.Arrays;
import java.util.function.*;

public class Main implements Teacher.TeacherInterface , FuncInterface{
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        int a = 3;
        int b = 5;
        System.out.println("a = " + a + ", b = " + b);
       // System.out.println("result = " + add(a, b));
        System.out.println("a = " + a + ", b = " + b);

        String str = "str";
        String str1 = new String("str");
        System.out.println(str);
        System.out.println(sayHello(str));
        System.out.println(str);

        Student student = new Student(1, "Gulnar");
        System.out.println("student = " + student);
        changeStudent(student);
        System.out.println("student = " + student);

        String[] arr = new String[1];
        arr[0] = "main method";
        System.out.println("1 = " + Arrays.toString(arr));

        System.out.println("2 = " + Arrays.toString(changeArr(arr)));
        System.out.println("3 = " + Arrays.toString(arr));


        Student student1 = new Student(1, "Gulnar");
        System.out.println("student1" + student1);
        StudentRecord studentRecord = new StudentRecord(1, "Gulnar", "Salehova");
        studentRecord.id();
        System.out.println("studentRecord" + studentRecord);
        studentRecord.recordMethod();
        StudentRecord.recordMethodStatic();
        studentRecord.recordMethod();


//        Person person1 = new Student();
//        Person person2 = new Teacher(subject);
//        person1.getResponsibility(person1);
//        person2.getResponsibility(person2);
//
//
//        Subject subject = new Subject("math");
        Teacher teacher = new Teacher();
        teacher.clone();
        Consumer<String> consumer = value -> System.out.println(value);
        consumer.accept("hello");
        IntConsumer consumer1 = value -> System.out.println(value);
        consumer1.accept(5);
        BiConsumer<Integer, String> biConsumer = (value1, value2) -> System.out.println(value1 + ", " + value2);
        biConsumer.accept(1, "Gulnar");
        Predicate<Integer> predicate = (value) -> {
            System.out.println(value);
            return value % 2 == 0;
        };
        IntPredicate intPredicate;
        BiPredicate<Integer, String> biPredicate = (value1, value2) -> {
            return true;
        };
        Function<String, Integer> function = value -> {
            System.out.println("vfgbgf");
            return 5;
        };
        BiFunction<Integer, Integer, Integer> biFunction = (value1, value2) -> value1 + value2;
        function.apply("5");
        System.out.println(biFunction.apply(5, 13));

        UnaryOperator<Integer> unaryOperator = value -> value;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = (value1, value2) -> value1 + value2;
        System.out.println(binaryOperator.apply(7, 89));
        Supplier<String> supplier = () -> "testascd";
        System.out.println(supplier.get());


//        teacher.setId(5);
//        teacher.setSubject(subject);
        Main main = new Main();
        main.method();

    }

 //   public static int add(int a, int b) {
//        a = 14;
//        b = a;
//        return a + b; //called callee
//    }

    public static String sayHello(String text) {
        text = " say hello method ";
        return text;
    }

    public static void changeStudent(Student student2) {
        student2 = new Student();
        student2.setId(111);
        student2.setName("XXX");
    }

    public static String[] changeArr(String[] str) {
        str[0] = "change method";
        return str;
    }

    @Override
    public void method() {
        System.out.println("teacher interface method");
    }

    @Override
    public void add1(int a, int b) {

    }

    @Override
    public void add(int a, int b) {

    }
}