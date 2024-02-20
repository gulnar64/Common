import java.io.Serializable;

@FunctionalInterface
public interface Func1Interface extends Cloneable, Serializable {
    void add1(int a, int b);
}
