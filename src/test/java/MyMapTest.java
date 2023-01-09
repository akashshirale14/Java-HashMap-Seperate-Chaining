import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyMapTest {
    MyMap<Integer,String> myMap;

    @Before
    public void initializerMethodforEachTest(){
        System.out.println("Initializing Method");
        myMap = new MyMap<Integer, String>();
        myMap.put(14,"Akash");
        myMap.put(24,"Vijay");
        myMap.put(2,"Mummy");
    }


    @Test
    public void testPut(){
        System.out.println("Testing Put Method");
        Assert.assertEquals("Akash",myMap.get(14));
        Assert.assertEquals("Vijay",myMap.get(24));
        Assert.assertEquals("Mummy",myMap.get(2));
        Assert.assertEquals(3,myMap.size());
    }

    @Test
    public void testGet(){
        System.out.println("Testing Get Method");
        Assert.assertEquals("Akash",myMap.get(14));
        Assert.assertEquals("Vijay",myMap.get(24));
        Assert.assertEquals("Mummy",myMap.get(2));
        Assert.assertEquals(null,myMap.get(56));
        Assert.assertEquals(3,myMap.size());
    }

    @Test
    public void testRemove(){
        System.out.println("Testing Remove Method");
        Assert.assertEquals(true,myMap.remove(14));
        Assert.assertEquals(true,myMap.remove(24));
        Assert.assertEquals(true,myMap.remove(2));
        Assert.assertEquals(false,myMap.remove(2));
        Assert.assertEquals(0,myMap.size());
    }

}
