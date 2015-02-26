import java.util.Stack;

/**
 * Created by Kubish on 26.02.2015.
 */
public class Push implements Cmd {
    private String defstr="a";
    private double defzn=0;
    public void setdefstr(Define def) {
        defstr=def.getdefstr();


    }
    public void setdefzn(Define def) {
        defzn=def.getdefzn();
    }
    @Override
    public void exec(Stack<Double> stack, String[] parts) {

        if (parts[1].equals(defstr)) {
          stack.push(defzn);
        } else stack.push(Double.parseDouble(parts[1]));

    }
}
