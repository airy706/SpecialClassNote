public class IntegerNote {
    public static void main(String[] args) {
        Integer a = 1;//Integer a=Integer.intValue(1);自动装箱，小于127加入缓存
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;//缓存中已有3，d c指向同一个对象
        Integer e = 321;//Integer e=Integer.intValue(321);大于127时创建新对象
        Integer f = 321;//大于127，创建新对象
        Long g = 3L;
        Long h = 2L;
        System.out.println(c == d);//均为对象的比较，比较地址true
        System.out.println(e == f);//不同对象false
        System.out.println(c == (a + b));//一边为对象，一边为基本数据类型，或均为对象的运算，进行拆箱，c.intvalue==3，true
        System.out.println(c.equals((a+b)));//a+b先拆箱为3，再装箱，true
        System.out.println(g == (a+b));//g.longvlaue==(long)3,true
        System.out.println(g.equals(a+b));//a+b拆箱再装箱为Integer,类型不同，false
        System.out.println(g.equals(a+h));//true


    }
}
