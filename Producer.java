package producer;

public class Producer extends Thread{
    private House house;
    public Producer(House house){
        this.house = house;
    }
    public void run(){
        while(true){
            house.add();
        }
    }
}
