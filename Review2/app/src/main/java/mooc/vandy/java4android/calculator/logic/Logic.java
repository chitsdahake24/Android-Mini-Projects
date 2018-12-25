package mooc.vandy.java4android.calculator.logic;

import android.content.Context;
import android.widget.Toast;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;
import mooc.vandy.java4android.calculator.ui.MainActivity;

import static android.widget.Toast.LENGTH_LONG;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {

    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation){

        if(operation == ADDITION) {
            Add a = new Add(argumentOne, argumentTwo);
            mOut.print(a.toString());
        }
        else if(operation == SUBTRACTION) {
            Subtract s = new Subtract(argumentOne, argumentTwo);
            mOut.print(s.toString());
        }
        else if (operation == MULTIPLICATION) {
            Multiply m = new Multiply(argumentOne, argumentTwo);
            mOut.print(m.toString());
        }
        else {
            if(argumentTwo==0) {
                mOut.print("Can't Divide by Zero");
            } else{
                Divide d = new Divide(argumentOne, argumentTwo);
                mOut.print(d.toString());
            }

        }

    }
}