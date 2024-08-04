import java.util.Objects;

public class MyHashSet {
    int sz=0;
    String[] myHashSet = new String[sz];

    public void putElement(String s) {
        Boolean ok = false;
        for (int i = 0; i < sz; i++)
            if (Objects.equals(myHashSet[i], s)) {
                ok = true;
                break;
            }
        if (!ok) {
            sz++;
            String[] myHashSet1 = new String[sz];
            for (int i = 0; i < sz; i++)
                myHashSet1[i] = myHashSet[i];
            myHashSet = null;
            String[] myHashSet = new String[sz];
            myHashSet = myHashSet1;
            myHashSet1 = null;
        }
    }

    public Boolean containsElement(String s){
        for(int i=0; i<sz; i++)
            if(myHashSet[i]==s) return true;
        return false;
    }

    public void deleteElement(String s){
        if(sz>0) sz--;
        String[] myHashSet1 = new String[sz];
        for(int i=0; i<sz; i++)
            if(myHashSet[i]!=s) myHashSet1[i]=myHashSet[i];
        myHashSet=null;
        String[] myHashSet = new String[sz];
        myHashSet=myHashSet1;
        myHashSet1=null;
    }

    public void iterateMyHashSet(){
        for(int i=0; i<sz; i++) {
            System.out.print(myHashSet[i]);
            System.out.print(" ");
        }
    }
}
