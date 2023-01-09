public class Main {
    public static void main(String[] args) {
        MyMap<Integer,String> hashMap =new MyMap<>();

        hashMap.put(3,"Akash");
        hashMap.put(5,"Mummy");
        hashMap.put(13,"Daddy");
        hashMap.put(17,"Tanu");
        String ans= hashMap.get(5);
        System.out.println(ans);
        System.out.println(hashMap.size());
        hashMap.put(13,"Shrikant");
        ans= hashMap.get(13);
        System.out.println(ans);
        hashMap.remove(13);
        ans= hashMap.get(13);
        System.out.println(ans);

    }
}