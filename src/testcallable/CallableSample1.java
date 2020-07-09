
package testcallable;

import java.util.concurrent.Callable;

public class CallableSample1 implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Task CallableSample1 is processing...");
        for (int i = 0; i<10; i++){
            try {
                Thread.sleep(1000);
                System.out.println("=== (1 *) === i: " + i);
            } catch (InterruptedException ex){
                System.out.println("Exception in sleep (CallableSample1)");
            }
        }
        return "result from CallableSample1";
    }
    
}
