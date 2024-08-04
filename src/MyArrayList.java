public class MyArrayList {
    int sz=100;
    int currEl=0;
    int[] myArrayList = new int[sz];

    public void initializeMyArrayListWithZeros(){
        for(int i=0; i<sz; i++)
            myArrayList[i]=0;
    }

    public void putValue(int x){
        if(currEl>=sz){
            int[] myArrayList1 = new int[sz];
            myArrayList1=myArrayList;
            myArrayList=null;
            sz*=2;
            int[] myArrayList = new int[sz];
            for(int i=0; i<sz; i++)
                myArrayList[i]=myArrayList1[i];
            myArrayList1=null;
        }
        myArrayList[currEl]=x;
        currEl++;
    }

    public int getValue(int index){
        if(index<0 && index>currEl){
            System.out.println("Wrong index number!");
            return -1;
        }
        return myArrayList[currEl];
    }

    public void deleteValue(int index){
        if(index<0 && index>currEl) {System.out.println("Wrong index number!"); }
        for(int i=index+1; i<currEl; i++)
            myArrayList[i]=myArrayList[i-1];
        myArrayList[currEl]=0;
        currEl--;
    }

    public void resizeMyArrayList(int siz){
        int[] myArrayList1 = new int[siz];
        for(int i=0; i<siz; i++)
            myArrayList1[i]=myArrayList[i];
        myArrayList=null;
        sz=siz;
        int[] myArrayList = new int[siz];
        myArrayList=myArrayList1;
        myArrayList1=null;
    }
}
