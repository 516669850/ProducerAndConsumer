package producer;

public class Main {
    public static void main(String[] args){
        House house = new House(8);
        Thread producer1 = new Producer(house);
        Thread producer2 = new Producer(house);
        Thread consumer1 = new Consumer(house);
        Thread consumer2 = new Consumer(house);

        producer1.setName("producer1");
        producer2.setName("producer2");
        consumer1.setName("consumer1");
        consumer2.setName("consumer2");

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}
