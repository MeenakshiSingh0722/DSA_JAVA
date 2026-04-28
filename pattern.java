import java.util.Scanner;

public class pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
//         int rows=sc.nextInt();
//         int cols=sc.nextInt();
//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=cols;j++){
//                 System.out.print("* ");
//             }System.out.println();//
//             }

        //(1)print square
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print("* ");
//            }System.out.println();
//        }

        //(2)take n and then :4 ,1234 4 times
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(j);
//            }System.out.println();
//        }

        //(3)take n and then print ABCD
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print((char)(j+64));
//            }System.out.println();
//        }

        //(4) take n: 4,1111 2222 3333 4444
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(i);
//            }System.out.println();
//        }

        //(5)take n: AAAA BBBB CCC....
//        int n =sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print((char)(i+64));
//            }System.out.println();
//        }

        //(6)take n: aaaa BBBB cccc DDDD
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i%2==0) System.out.print((char)(i+64));
//                else System.out.print((char)(i+96));
//            }System.out.println();
//        }

        //(7)triangle
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }System.out.println();
//        }

        //(8)for number triangle
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }System.out.println();
//        }

        //(9)char for alphabet
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print((char)(j+64));
//            }System.out.println();
//        }

        //(10)take n: 1 AB 123 ABCD
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(i%2==0) System.out.print((char)(j+64));
//                else System.out.print(j);
//            }System.out.println();
//        }

        //(11)inverted triangle
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print("*");
//            }System.out.println();
//        }

        //second method by using another variable
//        int n=sc.nextInt();
//        int a=n;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=a;j++){
//                System.out.print("*");
//            }a--; System.out.println();
//        }


        //(12) print 54321 5432 543 54 5
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=n;j>=i;j--){
//                System.out.print(j);
//            }System.out.println();
//        }

        //(13)alphabet triangle horizontally flipped
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print((char)(j+64));
//            }System.out.println();
//        }

        //(14) AAAA BBB CC D
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print((char)(i+96));
//            }System.out.println();
//        }

        //for small letter we use j+96
        //for capital letter we use j+64

    }
}