import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Kubish on 26.02.2015.
 */
public class Calculator {
    public static void main(String[] argc) {
        System.out.println("Calculator:");
        Scanner s = new Scanner(System.in);
        Stack<Double> stack = new Stack<Double>();
        Define def = new Define();
        Map<String, Cmd> cmds = new HashMap();
        cmds.put("PRINT", new Print());
        cmds.put("ADD", new Add());
        cmds.put("SUB", new Sub());
        cmds.put("QUIT", new Quit());
        cmds.put("DIV", new Div());
        cmds.put("MUL", new Mul());
        cmds.put("SQRT", new Sqrt());
        cmds.put("PUSH", new Push());
        cmds.put("DEFINE", new Define());
        while (true) {
            String line = s.nextLine();
            String[] parts = line.split(" ");
            for (Map.Entry<String, Cmd> entry : cmds.entrySet())
                if (parts[0].equals(entry.getKey())) {
                    Cmd c = entry.getValue();
                    c.exec(stack, parts, def);
                }

        }
    }
}
