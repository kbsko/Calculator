import java.util.Stack;

/**
 * Created by Kubish on 26.02.2015.
 */
public interface Cmd {
    void exec(Stack<Double> stack, String[] parts);
}
