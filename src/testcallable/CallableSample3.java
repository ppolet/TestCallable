
package testcallable;

import static java.lang.Thread.sleep;
import java.util.concurrent.Callable;

public class CallableSample3 implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Task CallableSample3 is processing...");
        for (int i = 0; i<10; i++){
            try {
                Thread.sleep(700);
                System.out.println("=== (3 ***) === i: " + i);
            } catch (InterruptedException ex){
                System.out.println("Exception in sleep (CallableSample3)");
            }
        }
        return "result from CallableSample3";
    }
    
}
