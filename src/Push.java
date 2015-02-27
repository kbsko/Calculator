import java.util.Map;
import java.util.Stack;

/**
 * Created by Kubish on 26.02.2015.
 */
public class Push implements Cmd {


    @Override
    public void exec(Stack<Double> stack, String[] parts, Define def) {

        boolean flag = true;

        for (Map.Entry<String, String> entry : def.defi.entrySet())
            if (parts[1].equals(entry.getKey())) {
                flag = false;
                stack.push(Double.parseDouble(entry.getValue()));
            }
        if (flag) {
            stack.push(Double.parseDouble(parts[1]));
        }


    }
}
