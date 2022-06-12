import org.junit.Test;
import vendingMachine.Coin;

public class FluentCoinTest {
    private Coin createCoin(String name, int value) {
        return new Coin(name, value);
    }

    @Test
    public void TestObject() {
        Coin coin = createCoin("Pound", 1)
                .printName()
                .printValue();
    }
}
