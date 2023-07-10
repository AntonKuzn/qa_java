import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Feline felineMock;


    @Test
    public void getNameFamily() {
        Feline feline = new Feline();
        System.out.println(feline.getFamily());
    }

    @Test
    public void shouldBeTwoNamesFamilyEquals() {
        Feline feline = new Feline();
        Assert.assertEquals("Неверное значение! Должно быть семейство кошачьих", "Кошачьи", feline.getFamily());
    }

    @Test
    public void checkArgumentsMock() {
        felineMock.getFamily();
        Mockito.verify(felineMock).getFamily();
    }

    @Test
    public void getListWhoEatMeat() throws Exception{
        Feline feline = new Feline();
        System.out.println(feline.eatMeat());
    }

    @Test
    public void shouldBeTwoListWhoEatMeatEquals() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Хищники относятся к семейству кошачьих", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        System.out.println(feline.getKittens());
    }
}