package Chapter3;

public class Example3 {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 10000;
        days = 100;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.println("Зa" + days);
        System.out.println("дней свет пройдет около");
        System.out.println(distance + "миль");
    }
}
