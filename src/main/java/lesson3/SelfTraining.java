package lesson3;

public class SelfTraining {

    public static void main(String[] args) {

//        Given an int n, print true if it is within 10 of 100. Note:
//        nearHundred(93) → true
//        nearHundred(90) → true
//        nearHundred(89) → false

        //public void nearHundred (int n) {}

        SelfTraining printN = new SelfTraining();
        printN.checkScore("Name", 99, 100);

        SelfTraining checkS = new SelfTraining();
        checkS.piloton("John", 111);

        SelfTraining watchingTV = new SelfTraining();
        watchingTV.theNews("CP24", "Tue. Apr.02, 2024", "Samsung", 75, "inch");


    }

    private void theNews(String chanel, String date, String brand, int size, String unitOfLenght) {
        System.out.println("I'm watching " + chanel + " on " + date + " using " + brand + " " + size + " " + unitOfLenght);
    }

    private void piloton(String fName, int j) {
        System.out.println(fName + j);
    }

    private void checkScore(String name, int i, int j) {
        System.out.println(name + " " + i);
    }

}
