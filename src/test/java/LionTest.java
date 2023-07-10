import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline felineMock;
    // получить количество котят
    @Test
    public void getLionKittens() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion(feline ,"Самец");
        System.out.println(lion.getKittens());
    }

    @Test
    public void isHasManeExceptionTest() {
        try {
            Lion lion = new Lion(felineMock, "Не самец и не самка");
        } catch (Exception exception) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }

    @Test
    public void shouldBeTwoKittensMeaningEquals() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline ,"Самец");
        int actual = lion.getKittens();
        assertEquals("Должно возвращаться 1", 1, actual);
    }

    @Test
    public void getLionFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline ,"Самец");
        System.out.println(feline.eatMeat());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(felineMock, "Самец");
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testFood() throws Exception {
        felineMock.getFood("Хищник");
        Mockito.verify(felineMock).getFood("Хищник");
    }

    @Test
    public void doesHaveManeException() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion(feline ,"Самец");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
    @Test
    public void doesHaveMane() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion(feline ,"Самка");
        System.out.println(lion.doesHaveMane());
    }
}