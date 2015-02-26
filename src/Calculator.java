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
        /*Map<String,Cmd> cmds = new HashMap();
        cmds.put("PUSH", new Push());
        cmds.put("PRINT", new Print());
        cmds.put("ADD", new Add());
        cmds.put("SUB", new Sub());
        cmds.put("QUIT", new Quit());
        cmds.put("DIV", new Div());
        cmds.put("MUL", new Mul());
        cmds.put("DEFINE", new Define());
        cmds.put("SQRT", new Sqrt());*/

        while (true) {
            String line = s.nextLine();
            String[] parts = line.split(" ");
            if (parts[0].equals("PUSH")) {
                Push c = new Push();
                c.setdefstr(def);
                c.setdefzn(def);
                c.exec(stack, parts);
            } else if (parts[0].equals("PRINT")) {
                Cmd c = new Print();
                c.exec(stack, parts);
            } else if (parts[0].equals("ADD")) {
                Cmd c = new Add();
                c.exec(stack, parts);
            } else if (parts[0].equals("SUB")) {
                Cmd c = new Sub();
                c.exec(stack, parts);
            } else if (parts[0].equals("QUIT")) {
                Cmd c = new Quit();
                c.exec(stack, parts);
            } else if (parts[0].equals("DIV")) {
                Cmd c = new Div();
                c.exec(stack, parts);
            } else if (parts[0].equals("MUL")) {
                Cmd c = new Mul();
                def.exec(stack, parts);
            } else if (parts[0].equals("DEFINE")) {
                Cmd c = new Div();
                def.exec(stack, parts);
            } else if (parts[0].equals("SQRT")) {
                Cmd c = new Sqrt();
                c.exec(stack, parts);
            }
        }

    }
}
