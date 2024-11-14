public class p15 {
    public static void main(String[] args) {
        Car car1 = new Car();

        int number = 1234;
        double gasonline = 20.5;

        car1.setnumgas(number,gasonline);
    }
}

class Car {
    int num;
    double gas;
    
    void setnumgas(int n,double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為：" + num +"汽油量設為；" + gas );
    }
    
    void setgas(double g)
    {
        gas = g;
        System.out.println("將汽油量設為：" + gas);
    }
}