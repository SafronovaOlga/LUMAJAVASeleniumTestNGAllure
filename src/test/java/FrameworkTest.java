import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FrameworkTest{
    
    @Test
    public void testUserHappyPath(){
        
        Assert.assertTrue(true);
    }
    
    @Ignore
    @Test
    public void testUser(){

        Assert.assertTrue(false);
    }
}

