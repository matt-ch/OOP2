import java.util.Scanner;
public class Input {

    public static void main (String[]args){

        System.out.println("Enter size:");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        //new instance
        CharPattern cp = new CharPattern(size);

        cp.setSize(size);
        cp.getSize();
        System.out.println("Size: " + cp.charSize);

        cp.printPattern(cp.charSize);
    }
}
