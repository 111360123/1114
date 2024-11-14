public class p17 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setnumgas(1234,20.5);

        int number=car1.getnum();
        double gasonline = car1.getgas();

        System.out.println("調查樣品匙得知");
        System.out.println("車號是"+number+"汽油量是"+gasonline);
    }
}

class Car {
    int num;
    double gas;
    
    int getnum()
    {
        System.out.println("調查車號");
        return num;
    }
    double getgas()
    {
        System.out.println("調查汽油量");
        return gas;
    }

    void setnumgas(int n,double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為：" + num +"汽油量設為；" + gas );
    }
    
}