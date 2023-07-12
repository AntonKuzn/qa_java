import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();


    @Test
    public void getNameFamily() {
        Feline feline = new Feline();
        System.out.println(feline.getFamily());
    }

    @Test
    public void shouldBeTwoNamesFamilyEquals() {
        Feline feline = new Feline();
        assertEquals("Неверное значение! Должно быть семейство кошачьих", "Кошачьи", feline.getFamily());
    }

    @Test
    public void checkArgumentsMock() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }


    @Test
    public void getListWhoEatMeat() throws Exception{
        Feline feline = new Feline();
        System.out.println(feline.eatMeat());
    }

    @Test
    public void shouldBeTwoListWhoEatMeatEquals() throws Exception {
        Feline feline = new Feline();
        assertEquals("Хищники относятся к семейству кошачьих", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int expectedCount = 9;
        int actualCount = feline.getKittens(expectedCount);
        assertEquals(expectedCount, actualCount);
    }
}