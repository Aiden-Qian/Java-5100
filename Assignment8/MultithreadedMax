import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultithreadedMax {
	public static int max(int[] data) throws ExecutionException, InterruptedException {
        if (data.length == 1) {
            return data[0];
        } else if (data.length == 0) {
            throw new IllegalArgumentException("data.length == 0");
        }
        FindMax task1 = new FindMax(data, 0, data.length / 2);
        FindMax task2 = new FindMax(data, data.length / 2, data.length); 
        ExecutorService service = Executors.newFixedThreadPool(2); 
        Future<Integer> f1 = service.submit(task1);
        Future<Integer> f2 = service.submit(task2);
        return Math.max(f1.get(), f2.get());
    }
	
	 public static void main(String[] args) throws ExecutionException, InterruptedException {	    	
	        int[] data = {364,4857,8374,2667,2873,9082,172,1627,3892,99999,873847,909273,21234,7639,263,22222,120101,2,0,999999999};
	        int max = max(data);
	        System.out.println("Max= "+ max);
	    }
}
