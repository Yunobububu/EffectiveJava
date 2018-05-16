package test.Chapter2; 

import Chapter2.NutritionFactsWithBuilder;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* NutritionFactsWithBuilder Tester. 
* 
* @author <Authors name> 
* @since <pre>五月 16, 2018</pre> 
* @version 1.0 
*/ 
public class NutritionFactsWithBuilderTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getServingSize() 
* 
*/ 
@Test
public void testGetServingSize() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getServings() 
* 
*/ 
@Test
public void testGetServings() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getCalories() 
* 
*/ 
@Test
public void testGetCalories() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getFat() 
* 
*/ 
@Test
public void testGetFat() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getSodium() 
* 
*/ 
@Test
public void testGetSodium() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getCarbohydrate() 
* 
*/ 
@Test
public void testGetCarbohydrate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: calories(int val) 
* 
*/ 
@Test
public void testCalories() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: fat(int val) 
* 
*/ 
@Test
public void testFat() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: sodium(int val) 
* 
*/ 
@Test
public void testSodium() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: carbohydrate(int val) 
* 
*/ 
@Test
public void testCarbohydrate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: build() 
* 
*/ 
@Test
public void testBuild() throws Exception { 
//TODO: Test goes here...
    NutritionFactsWithBuilder nutritionFactsWithBuilder =
            new NutritionFactsWithBuilder.
                    Builder(20,10).
                    fat(20).carbohydrate(2000).calories(13).build();
    System.out.println(nutritionFactsWithBuilder);
} 


} 
