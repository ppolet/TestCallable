//// https://www.ibm.com/developerworks/ru/library/l-java_universe_multithreading_tasks/index.html

package testcallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class TestCallable {
    public static void main(String[] args) {
        //При объявлении меньшего кол-ва пулов, чем задач, "неубравшиеся" задачи ждут освобождения нити и запускаются после этого
        ExecutorService es1 = Executors.newFixedThreadPool(2);
        
        //поместить задачу (1) в очередь на выполнение
        Future<String> f1 = es1.submit(new CallableSample1());

        //поместить задачу (2) в очередь на выполнение
        Future<String> f2 = es1.submit(new CallableSample2());

        //поместить задачу (2) в очередь на выполнение
        Future<String> f3 = es1.submit(new CallableSample3());

        while(!f1.isDone()){
            //System.out.println("MAIN");
            //ждем, пока задача не выполнится
        }
        try{
            //получить результат выполнения задачи
            System.out.println("Task has been complited: " + f1.get());
        } catch (InterruptedException ie){
            System.out.println("InterruptedException: " + ie.getMessage());
        } catch (ExecutionException ee){
            System.out.println("ExecutionException: " + ee.getMessage());
        }

        while(!f2.isDone()){
            //ждем, пока задача не выполнится
        }
        try{
            //получить результат выполнения задачи
            System.out.println("Task has been complited: " + f2.get());
        } catch (InterruptedException ie){
            System.out.println("InterruptedException: " + ie.getMessage());
        } catch (ExecutionException ee){
            System.out.println("ExecutionException: " + ee.getMessage());
        }

        while(!f3.isDone()){
            //ждем, пока задача не выполнится
        }
        try{
            //получить результат выполнения задачи
            System.out.println("Task has been complited: " + f3.get());
        } catch (InterruptedException ie){
            System.out.println("InterruptedException: " + ie.getMessage());
        } catch (ExecutionException ee){
            System.out.println("ExecutionException: " + ee.getMessage());
        }
        
        es1.shutdown();
    }
    
}
