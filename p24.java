public class p24 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setnumgas(1234,20.5);
        car1.show();

        System.out.println("只變更車號");
        car1.setnumgas(2345);
        car1.show();

        System.out.println("只變更汽油量");
        car1.setnumgas(30.5);
        car1.show();

    }
}

class Car {
    private int num;
    private double gas;

    public void setnumgas(int n)
    {
        num = n;
        
        System.out.println("將車號變更為"+num);
    }
    public void setnumgas(double  g)
    {
        gas = g;
        
        System.out.println("將油量變更為"+gas);
    }
    public void setnumgas(int n,double  g)
    {
        gas = g;
        num = n;
        System.out.println("將車號變更為"+num+"將油量變更為"+gas);
    }
    public void show()
    {
        System.out.println("車號是"+this.num);
        System.out.println("汽油量是"+this.gas);

    }
}