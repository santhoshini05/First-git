public class arrayinsertion {
   public static void main(String[] args) {
    int[]arr=new int[10];
    arr[0]=10;arr[1]=20;arr[2]=30;arr[4]=40;
    int n=4;
    int pos=2,value=25;
    System.out.println("Before insertion");
    for(int i=0;i<n;i++)
    System.out.print(arr[i]+ " ");
    for(int i=n;i>pos;i--){
        arr[i]=arr[i-1];        
    }
    arr[pos]=value;
    n++;
    System.out.println("/n");
    System.out.println("After insertion");
    for(int i=0;i<n;i++)
    System.out.print(arr[i]+ " ");
    }
   } 
    

