import java.util.Random;

public class SumValue extends Thread{
	static int sum_value=0;
	static int times=400000;
	static int[] arr;
	static int count=0;
	
	public SumValue(int[] arr){
		SumValue.arr=arr;
	}	
	/*generate array of random numbers*/
	 static void generateRandomArray(int[] arr){
		 int l=arr.length;
		 for(int i=0;i<l;i++) {
			 arr[i]=new Random().nextInt(100);
		 }
	 }
	 /*get sum of an array using 4 threads*/
	 static synchronized long sum(int[] arr){ 
		 for(int i=0;i<4;i++) {
			 Thread t = new SumValue(arr); 
			 t.start();
		 }
	            // 创建10个线程      
	        while(true){
	            if(Thread.activeCount()==1){
	                System.out.println("result:"+sum_value);
	                break;
	            }
	        }
		 return sum_value;
	 }
	 
	 public static void main(String[] args){
		 
	     int[] arr = new int[times];
	     generateRandomArray(arr);  
	     long sum = sum(arr);
	     System.out.println("Sum: " + sum);
	 }
	 
	public void run() {
		// TODO Auto-generated method stub
           
			try {
				synchronized (this) {
				while(count<times) {
					   sum_value+=arr[count];
					   count++;
		        	   System.out.println("线程"+Thread.currentThread().getName()+" "+sum_value+" "+count);
		        		   
		           }
				}
			}
				catch(Exception e){
					System.out.println("Catch Exception!!!");
				}
            
        }
		
}
	
	
  
