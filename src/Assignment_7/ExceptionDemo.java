package Assignment_7;

public class ExceptionDemo {
    public static void main(String[] args) {

        MyList list = new MyList();

        for(int i=1; i<=10; i++) {
            list.add(i);
        }

        list.add(120); // Userdefine exception ArrayIndexOutOfBoundsException: Array is Full

        System.out.println(list);

    }
}

class MyList {

    private int arr[];

    int idx = 0;

    MyList() {
        arr = new int[10];
    }

    public void add(int data) {
        if (idx >= 10)
            throw new ArrayIndexOutOfBoundsException("Array is Full");
        else {
            this.arr[idx++] = data;
        }
    }

    public int get(int index) {
        if (index < 0 || index > this.idx)
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        else
            return arr[index];
    }

    public String toString() {
        String str = "";
        for(int i = 0; i < idx; i++)
            str += arr[i] + " ";
        return str;
    }

}