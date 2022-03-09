package powerpackage;


import org.junit.Test;

public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert PowerFinder.of(1,1) == 1;
    }

    @Test
    public void TwoRaisedToOneIsTwo() {
        assert PowerFinder.of(2,1) == 2;
    }

    @Test
    public void TwoPowerTwoIsFour() {
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void PowerOfToAndThreeIsSix() {
        assert PowerFinder.of(3, 2) == 9;
    }
}
