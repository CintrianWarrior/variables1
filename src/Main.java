public class Main {
    public static void main(String[] args) {
       var workingHours = 640;
       var personalWorkingHours = 8;
       var workers = workingHours / personalWorkingHours;
        System.out.println("Всего работников в компании " + workers + " человек");
        workers = workers + 94;
        workingHours = workers * personalWorkingHours;
        System.out.println("Если в компании работает " + workers + " человека, то всего " + workingHours + " часа работы может быть поделено между сотрудниками");


    }
}