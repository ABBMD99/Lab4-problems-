package problem2;

public class IntegerList
{
    int[] list;//values in the list
    private int size;
    private int numOfElements;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        this.size=size;
        this.numOfElements=size;

    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<numOfElements; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numOfElements; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void increaseSize(){
        this.size=list.length*2;
        int[] temp=new int[size];
        for(int i=0;i<list.length;i++){
            temp[i]=list[i];
        }
        list=temp;

    }
    public void addElement(int newVal){
        if(numOfElements==list.length){
            this.increaseSize();
        }
        list[numOfElements]=newVal;
        numOfElements++;
    }

    public void removeFirst(int newVal){
        int indexFirstOcc=-1;
        for(int i=0;i<numOfElements;i++){
            if(list[i]==newVal){
                indexFirstOcc=i;
                break;
            }
        }
        if(indexFirstOcc==-1){
            System.out.println(newVal +" does not exist on list!");
            return;
        }
        for(int j=indexFirstOcc;j<numOfElements-1;j++){
            list[j]=list[j+1];
        }
        list[numOfElements - 1] = 0;
        numOfElements--;

    }

    public void removeAll(int newVal){
        int k=0;
        for(int i=0;i<numOfElements;i++){
            if(list[i]!=newVal){
                list[k]=list[i];
                k++;
            }
        }

        //le reste est mis a 0

        for(int i=k;i<numOfElements;i++){
            list[i]=0;
        }
        numOfElements=k;
    }
}