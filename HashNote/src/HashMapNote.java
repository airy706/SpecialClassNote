import java.util.HashMap;
import java.util.HashSet;

public class HashMapNote {
    /*
    提高读写效率，解决hash冲突
    hash冲突：不同的元素散列到相同的值，通过拉链法解决冲突，将散列到同一值得不同元素保存到一个表上
    Entry[] table;(entry:key,value,hash,next;hash值和next链)
    size;
    装载因子
    阈值
    容量
    最大容量
    put(key,value)
    判断容量是否大于等于阈值，需要扩容
    判断key是否为空，为空时在数组头部添加元素
    不为空，根据key的hashcode计算hash值，在计算索引下标，确定在数组中的位置，在下标对应的链表中判断key是否存在，存在
    则修改内容，不存在添加在链表头部
    get(key)
    计算下标，遍历下标对应的链表，key相等时返回值
    delete(key)
    计算下标，遍历链表，查找节点，删除节点
    扩容
    扩大为原来的两倍，将原来数组元素全部放置到新数组中，重新计算索引
     */
    HashMap<Integer,Integer> map=new HashMap<>();
    HashSet<Integer> set=new HashSet<>();
    /*
    hashset里面为一hashmap类型的成员变量，对元素的读写均通过map中对key的读写
     */
}
