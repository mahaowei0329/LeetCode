package interview;

import java.util.LinkedList;

/**
 * Created by haoweima on 2019/7/4.
 */
public class StackByLinkedList<T extends Comparable> {

    private LinkedList<T> list;
    private T minValue;


    public StackByLinkedList() {
        list = new LinkedList<>();
        minValue = null;
    }

    public T pop(){
        T value = list.getFirst();
        list.remove(value);

        return value;
    }

    public void push(T value){
        list.addFirst(value);

        if(minValue == null){
            minValue = value;
        }else{
            minValue = minValue.compareTo(value) > 0 ? value : minValue;
        }
    }

    public T minValue(){
        return minValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(T t : list){
            sb.append(t + "");
        }

        return sb.toString();
    }
}
