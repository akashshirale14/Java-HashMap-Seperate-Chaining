import java.util.LinkedList;

public class MyMap<K,V> {
    private static Integer DEFAULT_SIZE = 10;

    LinkedList<Entry>[] values;
    private int maxSize;
    private static double loadFactorPercent;
    private int currSize;
    public MyMap(){
        values = new LinkedList[DEFAULT_SIZE];
        maxSize = DEFAULT_SIZE;
        loadFactorPercent = 0.75;
        currSize = 0;
    }

    public void put(K key,V value) {
        int index = getHashCodeIndex(key);
        System.out.println("Index:" +index);
        Entry<K,V> currentEntry = new Entry(key,value);
        LinkedList<Entry> outputValues=values[index];

        if(outputValues==null){
            outputValues = new LinkedList<Entry>();
            outputValues.add(currentEntry);
            values[index]=outputValues;
            currSize++;
        }else{
            boolean flag=true;
            for(int i =0;i<outputValues.size();i++){
                Entry entry = outputValues.get(i);
                if(entry.key == key){
                    flag=false;
                    entry.value = value;
                }
            }
            if(flag){
                outputValues.add(currentEntry);
                currSize++;
            }
        }

    }

    public V get(K  key){
        int index = getHashCodeIndex(key);
        LinkedList<Entry> outputValues=values[index];

        if(outputValues==null){
            return null;
        }else{
            for(int i =0;i<outputValues.size();i++){
                Entry entry = outputValues.get(i);
                if(entry.key == key){
                    return (V) entry.value;
                }
            }
        }

        return null;
    }

    public int getHashCodeIndex(K key) {
        int index = key.hashCode() % maxSize;
        return index;
    }

    public int size(){
        return currSize;
    }

    public boolean remove(K key){
        int index = getHashCodeIndex(key);
        LinkedList<Entry> outputValues=values[index];
        if(outputValues==null) {
            return false;
        }else {
            for(int i =0;i<outputValues.size();i++){
                Entry entry = outputValues.get(i);
                if(entry.key == key){
                    outputValues.remove(entry);
                    currSize = currSize-1;
                    return true;
                }
            }
        }

        return false;
    }

}
