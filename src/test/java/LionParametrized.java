import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrized {
    Feline feline;

    private final String gender;
    private final boolean expected;

    public LionParametrized(String gender, boolean expected) {
        this.gender = gender;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void shouldBeMane() throws Exception {
        Lion lion = new Lion(feline, gender);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}