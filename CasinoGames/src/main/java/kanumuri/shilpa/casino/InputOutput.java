package kanumuri.shilpa.casino;

import java.util.Scanner;

/**
 * Created by shilpakanumuri on 1/28/17.
 */
public class InputOutput {

    public double readDoubleValues(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }

    public String readStringValues(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
 }
