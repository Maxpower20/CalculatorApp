import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IOUtil {

    static String readTheExpression() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    static void printToConsole(String expression){
        System.out.print(expression);
    }
    static void blankRow(){
        System.out.println();
    }

    static void printEquals(){
        System.out.print(" = ");
    }

}
