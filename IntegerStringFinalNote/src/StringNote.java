public class StringNote {
    /*
    常量池、堆
    编译器已知的字符串放在常量池，String s="a";
    zifu
     */
    public static void main(String[] args) {
        String a="abc";//搜索常量池有无abc,此时无abc,在常量池创建一个字符串对象abc,将地址返回给变量a
        String b="abc";//搜索常量池有无abc,此时已有abc，将常量池中abc的地址返回给变量b
        String c=new String("abc");//创建1对象，常量池中已有abc,在堆中复制常量池中abc创建一个新对象abc
        String d=new String("abc");//在堆中再创建一个对象abc,
        String e=new String("xxx");//创建2对象，常量池无xxx，先在常量池创建xxx，再将常量池中xxx复制到堆中创建新对象
        System.out.println(a==b);//true,常量池中同一内容
        System.out.println(a==c);//false，常量池与堆
        System.out.println(c==d);//false，堆中两个对象
        System.out.println(c.equals(d));//true，内容相同
    }
}
