import java.util.*;
public class tictactoe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b=0;
        //int a=0;;
        String a[][] = new String[3][3];
        int aa[][] = new int[3][3];
        int w=1;
        for (int i = 2; i >=0; i--) {
            for (int j = 0; j < 3; j++) {
                aa[i][j]=w;
                w++;
            }
        }
        System.out.println("Take inputs as follows:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]=".";
                System.out.print(a[i][j]+"("+aa[i][j]+")"+"\t");
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
        while(b<=0){
            System.out.print("Entry for player 1 (X): ");
            int n=sc.nextInt();
            if(n==1)
                a[2][0]="X";
            if(n==2)
                a[2][1]="X";
            if(n==3)
                a[2][2]="X";
            if(n==4)
                a[1][0]="X";
            if(n==5)
                a[1][1]="X";
            if(n==6)
                a[1][2]="X";
            if(n==7)
                a[0][0]="X";
            if(n==8)
                a[0][1]="X";
            if(n==9)
                a[0][2]="X";
        
            System.out.print("\033[H\033[2J");
            System.out.flush();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    //a[i][j]=".";
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
                System.out.println();
                System.out.println();
            }
           
            if((a[0][0]=="X")&&(a[2][2]=="X")&&(a[1][1]=="X")){
                
                System.out.println("Player 1 won");
                
                b=1;
                break;
            }
            if((a[0][2]=="X")&&(a[1][1]=="X")&&(a[2][0]=="X")){
                
                System.out.println("Player 1 won");
                
                b=1;
                break;
            }
            if((a[0][1]=="X")&&(a[0][0]=="X")&&(a[0][2]=="X")){
                
                System.out.println("Player 1 won");
                
                b=1;
                break;
            }
            if((a[1][0]=="X")&&(a[1][1]=="X")&&(a[1][2]=="X")){
                
                System.out.println("Player 1 won");
                
                b=1;
                break;
            }
            if((a[2][0]=="X")&&(a[2][2]=="X")&&(a[2][1]=="X")){
                
                System.out.println("Player 1 won");
                
                b=1;
                break;
            }
            if((a[0][0]=="X")&&(a[2][0]=="X")&&(a[1][0]=="X")){
                
                System.out.println("Player 1 won");
                
                b=1;
                break;
            }
            if((a[0][1]=="X")&&(a[2][1]=="X")&&(a[1][1]=="X")){
                
                System.out.println("Player 1 won");
                
                b=1;
                break;
            }
            if((a[0][2]=="X")&&(a[1][2]=="X")&&(a[2][2]=="X")){
                
                System.out.println("Player 1 won");
                
                b=1;
                break;
            }
// -------------------"0"------------------

            System.out.print("Entry for player 2 (O): ");
            int m=sc.nextInt();
            System.out.println();
            if(m==1)
                a[2][0]="O";
            if(m==2)
                a[2][1]="O";
            if(m==3)
                a[2][2]="O";
            if(m==4)
                a[1][0]="O";
            if(m==5)
                a[1][1]="O";
            if(m==6)
                a[1][2]="O";
            if(m==7)
                a[0][0]="O";
            if(m==8)
                a[0][1]="O";
            if(m==9)
                a[0][2]="O";
            

            System.out.print("\033[H\033[2J");
            System.out.flush();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    //a[i][j]=".";
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
                System.out.println();
                System.out.println();
            }
            if((a[0][0]=="O")&&(a[2][2]=="O")&&(a[1][1]=="O")){
                
                System.out.println("Player 2 won");
                
                b=1;
                break;
            }
            if((a[0][2]=="O")&&(a[1][1]=="O")&&(a[2][0]=="O")){
                
                System.out.println("Player 2 won");
                
                b=1;
                break;
            }
            if((a[0][1]=="O")&&(a[0][0]=="O")&&(a[0][2]=="O")){
                
                System.out.println("Player 2 won");
                
                b=1;
                break;
            }
            if((a[1][0]=="O")&&(a[1][1]=="O")&&(a[1][2]=="O")){
                
                System.out.println("Player 2 won");
                
                b=1;
                break;
            }
            if((a[2][0]=="O")&&(a[2][2]=="O")&&(a[2][1]=="O")){
                
                System.out.println("Player 2 won");
                
                b=1;
                break;
            }
            if((a[0][0]=="O")&&(a[2][0]=="O")&&(a[1][0]=="O")){
                
                System.out.println("Player 2 won");
                
                b=1;
                break;
            }
            if((a[0][1]=="O")&&(a[2][1]=="O")&&(a[1][1]=="O")){
                
                System.out.println("Player 2 won");
                
                b=1;
                break;
            }
            if((a[0][2]=="O")&&(a[1][2]=="O")&&(a[2][2]=="O")){
                
                System.out.println("Player 2 won");
                b=1;
                break;
            }
            
            // b=1;
        }
    }
}