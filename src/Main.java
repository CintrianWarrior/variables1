public class Main {
    public static void main(String[] args) {
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        var differenceWeigh = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница между весами бойцов " + differenceWeigh + " кг");
        var firstMethod = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами бойцов " + firstMethod + " кг");
        var secondMethod = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Второй боец весит больше на " + secondMethod + " кг");


    }
}