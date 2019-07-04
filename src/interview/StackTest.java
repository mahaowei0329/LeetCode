package interview;

/**
 * Created by haoweima on 2019/7/4.
 */
public class StackTest{

    public static void main(String[] args) {
        StackByLinkedList<TestObject> stack = new StackByLinkedList<>();
        stack.push(new TestObject(1));
        System.out.println(stack);
        stack.push(new TestObject(2));
        System.out.println(stack);
        stack.push(new TestObject(3));
        System.out.println(stack);
        stack.push(new TestObject(4));
        System.out.println(stack);
        System.out.println(stack.pop());
        stack.push(new TestObject(5));
        System.out.println(stack);
        stack.push(new TestObject(6));
        System.out.println(stack);
    }


    static class TestObject implements Comparable<TestObject>{

        private int number;

        public TestObject(int number) {
            this.number = number;
        }

        @Override
        public int compareTo(TestObject o) {
            return Integer.compare(this.number, o.number);
//            return this.number > o.number ? 1 : (this.number == o.number ? 0 : -1);
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return this.number + " ";
        }
    }
}
