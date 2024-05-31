package stringLesson4;

public class StringFormat {

    public static void main(String[] args) {

        String name = "Vasiliy";
        String gender = "male";
        int age = 20;
        double salary = 5000.50;

        System.out.println("The name is " + name + ", gender is " + gender + ", age is " + age + ", salary is " + salary);

        System.out.println(String.format("The name is %s, gender is %s, age is %d, salary is %f", name, gender, age, salary));




    }
}
