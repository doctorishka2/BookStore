package lesson5IntermJ_DtStrct;

import java.util.HashMap;

//The online Toys store has 5 different products – Batmobile (ID12), Light Saber(ID45), Wonder Woman (ID6), Hello Kitty Bag(ID201), and Junior QA Analyst Doll (ID56).
// Each product has its own unique ID. Please create a Method “public String getToyById(int id)” which will build the hashmap of ids/products described above
// (Hashmap<Integer, String>) and return the name of the toy by ID. For example, calling getToyById(6) from the main method will return and print “Wonder Woman”.
//Additional requirement:
//If there is no product with an id specified in the call, return “No such Toy” String instead. For example, calling getToyById(999) will return and print “No such Toy”.
//Optional task:
//Instead of providing the id, get the user output by using the Scanner. Here is an example:
//Get user input of id using Scanner class
//example:
//Scanner scanner = new Scanner(System.in);
//// ask the question in console
//System.out.print("Enter the Toy ID: ");
//// get  input as a String
//int id = Integer.parseInt(scanner.next());
//Find the toy name by id as you did before and return it 😊
//Good luck!
public class HomeWork5_2 {

    public void getToyById() {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(12, "Baltimore");
        hashMap.put(45, "Light Saber");
        hashMap.put(6, "Wonder Woman");
        hashMap.put(201, "Hello Kitty Bag");
        hashMap.put(56, "Junior QA Analyst Doll");

        getValue(900, hashMap);
        getValue(6, hashMap);

//        if (hashMap.containsKey(12)) {
//            System.out.println(hashMap.get("Baltomore"));
//        } else if (hashMap.containsKey(45)) {
//            System.out.println("Light Saber");
//        } else if (hashMap.containsKey(6)) {
//            System.out.println("Wonder Woman");
//        } else if (hashMap.containsKey(201)) {
//            System.out.println("Hello Kitty Bag");
//        } else if (hashMap.containsKey(56)) {
//            System.out.println("Junior QA Analyst Doll");
//        } else {
//            System.out.println("No such number");
//        }
        //System.out.println(hashMap.get(6));


    }

    public void getValue(Integer key, HashMap<Integer, String> map)
    {
        String value = map.get(key);

        if (value == null) {
            System.out.println("No such number");
            return;
        }

        System.out.println(value);
    }

}
