package arrays;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ScoreCollectionTest extends TestCase {

    @Test
    public void testArithmeticMean() throws Exception {
        // Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(()-> 15);
        collection.add(()-> 7);

        // Act
        int actualTest = collection.arithmeticMean();

        // Assert

        assertThat(actualTest, equalTo(6));
    }
}