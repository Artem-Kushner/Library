package homework.leson4;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " Номер телефона: " + number);
    }

    public void sendMessage(int... numbers) {
        System.out.println("Отправляю сообщения на номера ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
