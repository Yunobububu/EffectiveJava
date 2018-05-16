package test.Chapter2; 

import Chapter2.DoubleCheckedSingleton;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* DoubleCheckedSingleton Tester. 
* 
* @author <Authors name> 
* @since <pre>五月 16, 2018</pre> 
* @version 1.0 
*/ 
public class DoubleCheckedSingletonTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getSingleton() 
* 
*/ 
@Test
public void testGetSingleton() throws Exception { 
//TODO: Test goes here...
    for(int i = 0;i < 4;i++){
    System.out.println(DoubleCheckedSingleton.getSingleton()    );
    }
} 


} 
