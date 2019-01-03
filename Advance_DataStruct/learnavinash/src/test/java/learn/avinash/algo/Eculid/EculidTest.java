package learn.avinash.algo.Eculid;

import learn.avinash.algo.eculid.Eculid;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EculidTest {
    Eculid e = null;

    @Before
    public void init(){
        e = new Eculid();
    }

    @Test
    public void gcdTest(){
        Assert.assertEquals(2, e.gcd(10,2));
        Assert.assertEquals(2,e.gcd(22,6));
    }

    @Test
    public void gcdTest2(){
        Assert.assertEquals(2, e.gcd2(10,2));
        Assert.assertEquals(2,e.gcd2(22,6));

    }
    @Test
    public void gcdVsgcdTest2(){
        Assert.assertEquals(e.gcd(10,2), e.gcd2(10,2));

    }
}
