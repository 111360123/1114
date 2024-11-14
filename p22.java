public class p22 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setnumgas(1234,20.5);
        car1.show();

        System.out.println("指定不確的汽油量-10看看");

        car1.setnumgas(1234,-10.0);
        car1.show();
    }
}

class Car {
    private int num;
    private double gas;

    public void setnumgas(int n,double g)
    {
        if(g>0&&g<100)
        {
            num=n;
            gas=g;
            System.out.println("將車號重設為"+num+"，將汽油重設為"+gas);
        }
        else
        {
            System.out.println(g+"不是正常的汽油量");
            System.out.println("無法變更汽油量");
        }
    }
    public void show()
    {
        System.out.println("車號是：" + this.num);
        System.out.println("汽油量是：" + this.gas);
    }
    
}