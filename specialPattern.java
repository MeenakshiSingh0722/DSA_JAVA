import java.util.Scanner;

public class specialPattern {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);

        //(1)hollow reactable
//        int rows=sc.nextInt();
//        int cols=sc.nextInt();
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=cols;j++){
//                if(i==1 || i==rows || j==1 ||  j==cols) System.out.print("*");
//                else System.out.print(" ");
//            }System.out.println(" ");
//        }

        //(2)star plus
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==(n/2 +1)||j==(n/2 +1)) System.out.print("*");
//                else System.out.print(" ");
//            }System.out.println();
//        }

        //(3) star cross
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==j || j==n-i+1)System.out.print("*");
//                else System.out.print(" ");
//            }System.out.println();
//        }

        //(4) floyd's triangle 1 23 456
//        int n=sc.nextInt();
//        int a=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(a);
//                a++;
//            } System.out.println();
//        }

        //(5)Binary tree
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(i==j || (i+j)%2==0) System.out.print(1);
//                else System.out.print(0);
//            }System.out.println();
//        }

        //(6) star triangle vertically flipped
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

        //(7)Number triangle vertically flipped
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++) {
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++) {
//                System.out.print(j);
//            }System.out.println();
//        }

        //second method
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i+j>n) System.out.print("*");
//                else System.out.print(" ");
//            }System.out.println();
//        }

        //(8)alphabet triangle vertically flipped
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print((char)(i+64));
//            }System.out.println();
//        }

        //(9)4: 3 spce 4 star, 2 space 4 star , 1 star...Rhombus
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }for (int j=1;j<=n;j++){
//                System.out.print("*");
//            }System.out.println();
//        }

        //(10)5: 5 star, 1 space 4 star
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<i-1;j++){ //n-i
//                System.out.print(" ");
//            }for(int j=1;j<=n-i+1;j++){ //i
//                System.out.print("*");
//            }System.out.println();
//        }

//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i>j) System.out.print(" ");
//                else System.out.print("*");
//            }System.out.println();
//        }

        //pyramid
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }System.out.println();
//        }

        //second method
//        int n=sc.nextInt();
//        int nsp=n-1,nst=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=nsp;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=nst;j++){
//                System.out.print("*");
//            }nsp--; nst+=2; System.out.println();
//        }

        //diamond
//        int n=sc.nextInt();
//        int nsp=n-1,nst=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=nsp;j++){
//                System.out.print(" ");
//            }for(int j=1;j<=nst;j++){
//                System.out.print("*");
//            }nsp--;
//            nst+=2; System.out.println();
//        }
//        nsp=1; nst=2*n-3;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=nsp;j++){
//                System.out.print(" ");
//            }for(int j=1;j<=nst;j++){
//                System.out.print("*");
//            }nsp++;
//            nst-=2; System.out.println();
//        }

        //bridge
//        int n=sc.nextInt();
//        int nsp=1;
//        for(int i=1;i<=2*n-1;i++){
//            System.out.print("*");
//        }System.out.println();
//        for(int i=1;i<=n-1;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print("*");
//            }for(int j=1;j<=nsp;j++){
//                System.out.print(" ");
//            }for(int j=1;j<=n-i;j++){
//                System.out.print("*");
//            }nsp+=2;
//            System.out.println();
//        }

        //zoom
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                //System.out.print(Math.min(i,j));
//                if(i<j) System.out.print(i);
//                else System.out.print(j);
//            }System.out.println();
//        }

        //number spiral
//        int n=sc.nextInt();
//        for(int i=1;i<=2*n-1;i++){
//            for(int j=1;j<=2*n-1;j++){
//                int a=i,b=j;
//                if(i>n) a=2*n-i;
//                if(j>n) b=2*n-j;
//                System.out.print(Math.min(a,Math.min(b,a)));
//            }System.out.println();
//        }
    }
}
