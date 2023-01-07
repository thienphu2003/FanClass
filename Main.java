public class Main {
    public static void main(String[] args) {
        FanClass fan1= new FanClass();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOnOff(true);
        FanClass fan2= new FanClass();
        fan2.setSpeed(fan2.medium);
        fan2.setColor("blue");
        fan2.setOnOff(false);
        fan2.setRadius(5);
        System.out.println("Tình trạng của fan1 là : ");
        System.out.println(fan1.toString());
        System.out.println("Tình trạng của fan2 là : ");
        System.out.println(fan2.toString());


    }
}
