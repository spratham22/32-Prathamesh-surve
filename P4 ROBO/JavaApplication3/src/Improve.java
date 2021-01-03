class one{
    void calculate(double x){
        System.out.println(x*x);
    }
    void calculate(double x,double y){
        System.out.println(x*y);
        
    }
}
class two extends one{
    void calculate(double x){
        System.out.println(x*x*x);
    }

}
class Improve{
    public static void main(String args[]){
        one o=new one();
        o.calculate(5);
        o.calculate(5,10);
        two t =new two();
        t.calculate(2);
        
    }
}