package vendingMachine;

import java.util.Objects;

public class Coin {
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    private String name;
    private int value;

    public Coin(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public Coin printName() {
        System.out.println(this.getName());
        return this;
    }

    public Coin printValue() {
        System.out.println(this.getValue());
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return value == coin.value &&
                name.equals(coin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
