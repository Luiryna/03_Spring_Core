package task1.bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Salary {
    @NotNull
    @Min(value = 150, message = "Crisis, you know")
    private double amount;

    public Salary() {

    }

    public Salary(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salary salary = (Salary) o;

        return Double.compare(salary.amount, amount) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(amount);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                '}';
    }
}
