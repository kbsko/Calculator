import java.util.Stack;

/**
 * Created by Kubish on 26.02.2015.
 */
public class Print implements Cmd {

    @Override
    public void exec(Stack<Double> stack, String[] parts, Define def) {
        System.out.println(stack);
    }
}
