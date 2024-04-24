package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsTriangleRACC {
    //Test in this JUnit, that satisfy RACC coverage is 1, 2, 3, 5
    //1: (T, T, T) = T
    //2: (T, T, F) = F
    //3: (T, F, T) = F
    //5: (F, T, T) = F
    IsTriangle isTriangle;
    public IsTriangleRACC() {
    }
    @Before
    public void setUp(){
        this.isTriangle=new IsTriangle();
    }
    @Test
    public void test1() throws Exception{
        Assert.assertTrue(this.isTriangle.isTriangle(3, 5, 4)); //1: T T T
    }
    @Test
    public void test2() throws Exception{
        Assert.assertFalse(this.isTriangle.isTriangle(7, 4, 3)); //2: T T F

    }
    @Test
    public void test3() throws Exception{
        Assert.assertFalse(this.isTriangle.isTriangle(2, 8, 5)); //3: T F T

    }
    @Test
    public void test5() throws Exception{
        Assert.assertFalse(this.isTriangle.isTriangle(4, 5, 10)); //4: F T T
    }


}
