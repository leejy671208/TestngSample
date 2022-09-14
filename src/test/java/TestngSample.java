import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngSample {

    @Test
    public void TestEmailGenerator() {
        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generator();
        Assert.assertNotNull(email);
        Assert.assertEquals(email, "longfan.li@ericsson.com");
    }
}
