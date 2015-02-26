import java.util.Stack;

/**
 * Created by Kubish on 26.02.2015.
 */
public class Define implements Cmd {
    private String defstr = "a";
    private double defzn = 0;

    public String getdefstr() {
        return defstr;
    }

    public double getdefzn() {
        return defzn;
    }

    @Override
    public void exec(Stack<Double> stack, String[] parts) {

        defstr = parts[1];
        defzn = Double.parseDouble(parts[2]);


    }
}
