package Test;

import Bean.Hero;
import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class MyTest {
    @Test
    public void test01()
    {
        Hero hero1=new Hero(1,"rose",100,200);
        Hero hero2=new Hero(2,"derrick",100,200);
        System.out.println(hero1.isEqual(hero2));
    }

    public static void main(String[] args) {
        System.out.println("hello,git");
    }
}
