package com.first.app;
import junit.framework.TestCase;
import java.util.List;
import java.util.ArrayList;

public class AppTest extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public void testGetSum()
    {
        List<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        assertEquals( 6, App.getSum(items) );
    }
}
