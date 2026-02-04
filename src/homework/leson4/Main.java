package homework.leson4;

public class Main {
    public static void main(String[] args) {
        Phone ph1 = new Phone();
        Phone ph2 = new Phone();
        Phone ph3 = new Phone();
        System.out.println(ph1.model +" " + ph1.number + " " + ph1.weight);
        System.out.println(ph2.model +" " + ph2.number + " " + ph2.weight);
        System.out.println(ph3.model +" " + ph3.number + " " + ph3.weight);
        ph1.receiveCall("Игорь");
        ph1.getNumber();
    }
}
