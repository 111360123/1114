public class p51 {
    public static void main(String[] args) {

        
        Car[] car1=new Car[3];

        for(int i=0;i<car1.length;i++)
        {
            car1[i]=new Car();
        }
        car1[0].setcar(1234,20.5);
        car1[1].setcar(2345,30.5);
        car1[2].setcar(3456,40.5);

        for(int i=0;i<car1.length;i++)
        {
            car1[i].show();
        }
    }
}

class Car {
    
    private int num;
    private double gas;

    public Car()
    {
        num=0;
        gas=0.0;
        System.out.println("生產了車子");
    }
    public void setcar(int n,double g)
    {
        num = n;
        gas = g;
        System.out.println("車號設為" + num+"汽油量設為" + gas);
    }

    public void show()
    {
        System.out.println("車號是"+num);
        System.out.println("汽油量是"+gas);

    }
}