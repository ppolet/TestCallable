
package testcallable;

import static java.lang.Thread.sleep;
import java.util.concurrent.Callable;

public class CallableSample2 implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Task CallableSample2 is processing...");
        for (int i = 0; i<10; i++){
            try {
                Thread.sleep(1500);
                System.out.println("=== (2 **) === i: " + i);
            } catch (InterruptedException ex){
                System.out.println("Exception in sleep (CallableSample2)");
            }
        }
        return "result from CallableSample2";
    }
    
}
