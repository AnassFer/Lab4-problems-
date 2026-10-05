package problem2;

public class IntegerList
{
    int[] list;//values in the list
    int capacity;
    int size;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        this.size = size;
        this.capacity = size;
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);

    }

    void increaseSize(){
        int[] temp = new int[2*list.length];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        list = temp;
        capacity = 2*capacity;
    }

    void addElement(int newVal){
        if(size == capacity){
            increaseSize();
            list[size] = newVal;
            size++;
        } else {
            list[size] = newVal;
            size++;
        }
    }

    void removeFirst(int newVal){
        for (int i = 0; i < list.length; i++) {
            if(list[i] == newVal){
                for (int j = i+1; j < list.length; j++) {
                    list[j-1] = list[j];
                }
                list[list.length-1]=0;
                size--;
                break;
            }
        }
    }

    void  removeAll(int newVal){
        for (int i = 0; i < size; i++) {
            if(list[i] == newVal){
                for (int j = i+1; j < size; j++) {
                    list[j-1] = list[j];
                }
                size--;
                i--;
            }
        }
    }
}