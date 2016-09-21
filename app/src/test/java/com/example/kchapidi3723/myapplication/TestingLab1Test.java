package com.example.kchapidi3723.myapplication;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kchapidi3723 on 9/21/2016.
 */
public class TestingLab1Test {
    TestingLab1 test;
    @Before
    public void setUp() throws Exception {
        test=new TestingLab1();
    }

    @Test

    //Test Identifier: 1.1
    //Test Description: Dividing 25 by 5
    //Method of execution: Automated
    //Input Data: 25,5
    //Expected Output: 5.0
    //Observed Output:Passed
    //Action : Report test are failed
    public void testDivision1() throws Exception {
        //1.Arrange
        double i=25;
        double j=5;
        //2.Act
        double result=test.Division(i,j);

        //3.Assert
        Assert.assertEquals(5,result,0.10);
    }
    @Test

    //Test Identifier: 1.1
    //Test Description: Adding 10 by 10
    //Method of execution: Automated
    //Input Data: 10,10
    //Expected Output: 20
    //Observed Output:Passed
    //Action : Report test are failed
    public void testAddition() throws Exception {
        //1.Arrange
        double i=10;
        double j=10;
        //2.Act
        double result=test.Add(i,j);

        //3.Assert
        Assert.assertEquals(20,result,0.10);
    }
    @Test

    //Test Identifier: 1.1
    //Test Description: Dividing 25 by 5
    //Method of execution: Automated
    //Input Data: 25,5
    //Expected Output: 5.0
    //Observed Output:Passed
    //Action : Report test are failed
    public void testDivision3() throws Exception {
        //1.Arrange
        double i=25;
        double j=5;
        //2.Act
        double result=test.Division(i,j);

        //3.Assert
        Assert.assertEquals(5,result,0.10);
    }
    @Test

    //Test Identifier: 1.1
    //Test Description: Dividing 25 by 5
    //Method of execution: Automated
    //Input Data: 25,5
    //Expected Output: 5.0
    //Observed Output:Passed
    //Action : Report test are failed
    public void testDivision4() throws Exception {
        //1.Arrange
        double i=25;
        double j=5;
        //2.Act
        double result=test.Division(i,j);

        //3.Assert
        Assert.assertEquals(5,result,0.10);
    }
    @Test

    //Test Identifier: 1.1
    //Test Description: Dividing 25 by 5
    //Method of execution: Automated
    //Input Data: 25,5
    //Expected Output: 5.0
    //Observed Output:Passed
    //Action : Report test are failed
    public void testDivision5() throws Exception {
        //1.Arrange
        double i=25;
        double j=5;
        //2.Act
        double result=test.Division(i,j);

        //3.Assert
        Assert.assertEquals(5,result,0.10);
    }
}