public class EqualHashCodeNote {
    /*
    object中对hashcode的规范要求：
    在同一次程序调用中，同一对象的多次hashcode方法返回值应该相同，不同次程序调用可以不同
    两个对象equal为true,则其hashcode值必须相同
    对象不等，hash值可以相同

    object中：equals():相当于==，比较两个对象的内存地址是否相同。
              hashcode():返回与对象内存地址相关的整形值
    若一个类重写了equals方法，则必须改写hashcode方法，保证一致性
    在hashset,hashmap等集合中更为明显。
     */
}
