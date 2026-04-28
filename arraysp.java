import java.util.ArrayList;
import java.util.Collections;

public class arraysp {
    public static void main(String [] args) {

        //second max
//        int[]x={23,56,3,8,6};
//        int max=Integer.MIN_VALUE;
//        int smax=Integer.MIN_VALUE;
//        for(int i=0;i<x.length;i++){
//            if(x[i]>max) max=x[i];
//        }
//        for(int i=0;i<x.length;i++){
//            if(x[i]>smax && x[i]!=max) smax=x[i];
//        } System.out.println("max element is "+max+" second max element is "+smax);

        //for each loop
//        int []arr={1,2,5,63,6};
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }

        //reverse array
//        int []x={23,9,5,23,7,9};
//        int n=x.length;
//        int i=0,j=n-1;
//        while(i<j){
//            int temp=x[i];
//            x[i]=x[j];
//            x[j]=temp;
//            i++;j--;
//        }for(int ele:x){
//            System.out.print(ele+" ");
//        }

        //using for loop
//        for(int i=0;i<n/2;i++){
//            int temp=x[i];
//            x[i]=x[n-i-1];
//            x[n-i-1]=temp;
//        }for(int ele:x){
//            System.out.print(ele+" ");
//        }

        //rotate array
//        int []arr={23,5,6,8,9,2};
//        int d=2;
//        int n = arr.length;
//        reverse(arr, 0, d - 1);
//        reverse(arr, d, n - 1);
//        reverse(arr, 0, n - 1);
//    }public static void reverse(int[]arr, int i,int j){
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;}

        //missing in array
//        int n=arr.length+1;
//        int sum=n*(n+1)/2;
//        int arrSum=0;
//        for(int ele:arr){
//            arrSum+=ele;
//        }return sum-arrSum;

        //segregate 0s and 1s
        //wave array

        //arraylist and vector in java
//        ArrayList<Integer>arr=new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        System.out.println(arr.get(2));
//        arr.set(2,40);
//        System.out.println(arr.get(2));
//        System.out.println(arr);
//
//        for(int i=0;i<arr.size();i++) {
//            System.out.print(arr.get(i)+" ");
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        arr.remove(arr.size()-1);
//        System.out.println(arr);
//        //reverse
//        Collections.reverse(arr);
//        System.out.println(arr);
//
//        int i=0,j=arr.size()-1;
//        while(i<j){
//            int temp=arr.get(i);
//            arr.set(i,arr.get(j));
//            arr.set(j,temp);
//            i++;
//            j--;
//        }

        //merge sort
//        int []a={2,4,7,9};
//        int[]b={1,3,5,6,8};
//        int[]c=new int[a.length+b.length];
//        for(int ele:c) System.out.print(ele+" ");
//        System.out.println();
//        merge(c,a,b);
//        for(int ele:c) System.out.print(ele+" ");
//        System.out.println();
//    }
//
//    public static void merge(int[]c,int[]a,int[]b){
//        int i=0,j=0,k=0;
//        while(i<a.length && j<b.length){
//            if(a[i]<b[j]){
//                c[k]=a[i];//c[k++]=a[i++]
//                i++;
//            }else{
//                c[k]=b[j];
//                j++;
//            }k++;
//        }if(i==a.length){
//            while(j<b.length){
//            c[k++]=b[j++];
//            }
//        }else{
//            while(i<a.length){
//                c[k++]=a[i++];
//            }
//        }

    }

}
