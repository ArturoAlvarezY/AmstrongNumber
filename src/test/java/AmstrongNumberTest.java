import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*; 

import dev.arturo.models.AmstrongNumber;

public class AmstrongNumberTest {

    AmstrongNumber amstrongNumber = new AmstrongNumber();

    @Test
    void testCalcIfIsAmstrongNumber() {
        assertThat(amstrongNumber.calcIfIsAmstrongNumber(371), is("371 Is an Armstrong Number!!!"));
        assertThat(amstrongNumber.calcIfIsAmstrongNumber(422), is("Not an Armstrong Number"));
    }
}
