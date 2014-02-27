package com.spring.beans;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


/**Print Data ApplicationDAOTest
 * Created by harsh on 2/20/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:PrintDataTest-context.xml")
public class PrintDataTest {

    @Autowired
    private  PrintData hello=null;

    @Test
    public void testPrint(){
        assertNotNull("Constructor ApplicationDAOTest",hello);
        String msg = hello.printName();
        String expectedData = "Welcome to spring: Harsh";
        assertEquals("PrintData should be:"+expectedData,expectedData,msg);
    }
}
