package producer;

public class House {
    private final int MAX_SIZE; //仓库最大容量
    private int count;//仓库当前货物数量
    public House(int n){
        MAX_SIZE = n;
        count = 0;
    }
    //添加货物方法
    public synchronized void add(){
        try {
            while (count >= MAX_SIZE) {
                System.out.println("已经满了");
                wait();
            }
            count++;
            System.out.println(Thread.currentThread().toString() + " put " + count);
            Thread.sleep(1000);
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //取走货物
    public synchronized void remove(){
            try {
                while (count <= 0) {
                    System.out.println("仓库已空");
                    wait();
                }
                count--;
                System.out.println(Thread.currentThread().toString() + " get " + count);
                Thread.sleep(1500);
                notify();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
    }
}

