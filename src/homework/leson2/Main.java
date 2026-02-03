package homework.leson2;

public class Main {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day.getRusName());
        System.out.println(day.isWeekend());
        day = Day.FRIDAY;
        System.out.println(day.getRusName());
        System.out.println(day.isWeekend());
        day = Day.SUNDAY;
        System.out.println(day.getRusName());
        System.out.println(day.isWeekend());
    }
}
