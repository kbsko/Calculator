import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Kubish on 26.02.2015.
 */
public class Define implements Cmd {

    public Map<String, String> defi = new HashMap();

    @Override
    public void exec(Stack<Double> stack, String[] parts, Define def) {
        def.defi.put(parts[1], parts[2]);
    }
}
