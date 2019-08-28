public class FinalNote {
    /*
    修饰类：所有成员方法为fianl
    修饰方法：父类中方法不可被子类重写，父类中private方法不能被继承
    修饰字段：基本数据类型不能修改，引用数据类型不可以改变指向的地址，必须初始化
    使用final关键字，如果编译器能够在编译阶段确定某变量的值，那么编译器就会把该变量当做编译期常量来使用。
    如果需要在运行时确定，那么编译器就不会优化相关代码
     */
    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));//true
        System.out.println((a == e));//false
    }
}
