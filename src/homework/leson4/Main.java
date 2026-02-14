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
        Phone ph4 = new Phone(95543241, "IPhone" , 246);
        System.out.println(ph4.model +" " + ph4.number + " " + ph4.weight);
        ph4.receiveCall("Петя", 65879056);
        ph4.sendMessage(65879056, 65879057, 65879058);
    }
}
