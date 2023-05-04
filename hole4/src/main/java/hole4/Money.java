package hole4;

class Money {
    final Integer value;
    final String currency;

    Money(Integer value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    Money plus(Money other) {
        if (!other.currency.equals(currency)) {
            throw new Incalculable();
        }
        return new Money(value + other.value, other.currency);
    }

    Money minus(Money other) {
        if (!other.currency.equals(other.currency)) {
            throw new Incalculable();
        }
        return new Money(other.value - other.value, other.currency);
    }
}
