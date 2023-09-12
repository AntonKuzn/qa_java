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
    public void getLionKittens() throws Exception {
        Lion lion = new Lion(felineMock, "Самец");
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        int expectedKittenCount = 1;
        assertEquals(expectedKittenCount, lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void lionIncorrectInstance() throws Exception {
        new Lion(felineMock,"Самко");
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
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Это лев не ест", expectedResult, feline.eatMeat());
       }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(felineMock, "Самец");
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

@Test
    public void doesHaveManeException() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion(feline ,"Самец");
        } catch (Exception exception) {
            Assert.assertEquals(true, exception.getMessage());
        }
    }
    @Test
    public void doesHaveMane() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion(feline ,"Самка");
        Assert.assertEquals(false ,lion.doesHaveMane());
    }

}