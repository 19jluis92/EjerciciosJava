package example.java.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AnalyzeString {

    Stack pila = new Stack();

    public static void main (String [] pps) {

            new AnalyzeString("{(){}([])()}");

    }


    public AnalyzeString (String linea) {
        for (int i = 0; i < linea.length(); i++) {
            if (linea.charAt(i) == '(') pila.push(new Character(')'));
            else if (linea.charAt(i) == '{') pila.push(new Character('}'));
            else if (linea.charAt(i) == '[') pila.push(new Character(']'));
            else if (linea.charAt(i) == ')') validate(')');
            else if (linea.charAt(i) == '}') validate('}');
            else if (linea.charAt(i) == ']') validate(']');
        }

        if (pila.empty())
            System.out.println("Parentesis balanceados");
        else
            System.out.println("Parentesis NO balanceados");
    }


    private void validate (char c) {
        if (pila.empty()) {
            System.out.println("Parentesis NO balanceados");
            System.exit(0);
        } else {
            Character s = (Character) pila.pop();
            if (c != s.charValue()) {
                System.out.println("Parentesis NO balanceados");
                System.exit(0);
            }
        }
    }
}
