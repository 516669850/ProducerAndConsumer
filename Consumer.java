package producer;

public class Consumer extends Thread{
    private House house;
    public Consumer(House house){
        this.house = house;
    }
    public void run(){
        while(true){
            house.remove();
        }
    }
}
