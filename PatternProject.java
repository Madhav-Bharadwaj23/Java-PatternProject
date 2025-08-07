import javax.swing.*;
class PatternProject
{
    void SquarePattern()
    {
        System.out.println("---------- Square Pattern ---------\n");
        int i, j;
        for ( i = 1 ; i <= 5 ; i++){
            for ( j = 1 ; j <= 5 ; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    /**
     * 
     */
    void digitsquare(){
        for(int k=1 ; k <=5 ; k++){
            if(k%2!=0)
            {
                for(int j = 1 ;j<=5;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            else{
                for(int j= 5;j>=1;j--){
                    System.out.print(j);
                }
                System.out.println();
            }
        }


    }
   void sandclock() {
        System.out.println("---------- Square Clock ---------\n");

        int N = 6, i, j, X = N + 1, S = 0, M = 1;
        int tot = ((N * (N + 1)) / 2) * 2, Z = 9;

        for (i = 1; i <= N + N - 1; i++) {
            X = (i <= N) ? --X : ++X;
            S = (i <= N) ? ++S : --S;

            // Print spaces manually (since " ".repeat() may not work in older Java)
            for (int s = 0; s < S; s++) {
                System.out.print(" ");
            }

            // Print numbers
            for (j = 1; j <= X; j++, M++) {
                if (M <= 9) {
                    System.out.print(M + " ");
                } else if (M > (tot - 9)) {
                    System.out.print((--Z) + " ");
                } else {
                    System.out.print((M % 2 == 0 ? "0 " : "9 "));
                }
            }

            System.out.println();
        }
    }

    
    void triangle()
    {
           System.out.println("---------- Right Triangle ---------\n");
        int rows = 5; // You can change this value

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
    void butterfly()
    {
       
        int N = 5;
        int total = N + N - 1;

        for (int i = 1; i <= total; i++) {
            for (int j = 1; j <= total; j++) {
                if (i <= N) {
                    if (j <= i || j >= total - i + 1) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j <= total - i + 1 || j >= i) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    void diamond()
    {
        int n = 5; 
        
        for (int i = 1; i <= n; i++) {
        
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       
        for (int i = n - 1; i >= 1; i--) {
         
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
           
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void hollowpyramid(){
        int n = 5; 

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

         
            for (int j = 1; j <= (2 * i - 1); j++) {
              
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); 
        }
    }
    void zeroone(){
         int i, j;
         int n=6;
        
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                 if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
    void rhombus(){
        int i,j;
        int num=6;
        for(i=1;i<=num;i++){
            for (j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for(j=1;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
    void kpattern(){
        int i, j;
        int n=6;

        // outer loop to handle rows
        for (i = n; i >= 1; i--) {

            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }

        // outer loop to handle rows
        for (i = 2; i <= n; i++) {

            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }}
    void m(){
      int n = 5; // height of the 'M'

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                // Print star at the borders and diagonals
                if (j == 0 || j == (n * 2 - 2) || j == i || j == (n * 2 - 2 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }}
        void r(){
             int n = 7; // Height of 'R'

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || // Left vertical line
                    (i == 0 && j < 4) || // Top horizontal line
                    (i == n / 2 && j < 4) || // Middle horizontal line
                    (j == 4 && i > 0 && i < n / 2) || // Top right vertical line
                    (i - j == 2)) // Diagonal leg
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void a(){
        int rows = 8;   
        int cols = 10;  

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
               
                if (i == 1 || i == 4 || j == 1 || j == cols) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
    void h(){
        int rows=7;
        int column=10;
         for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= column; j++) {
               
                if (i == 4 || j == 1 || j == column) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }

    }
    
void i(){
        int r=7;
        int c=10;
        for(int i = 1;i<=r;i++){
            for(int j = 1; j <=c;j++){
                if(i==1 || i==7 || j==5){
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
void reverse(){
    for(int k =1; k<=5; k++)
    {
        if(k%2==0){
            for(int j = 5; j>=1;j--){
                System.out.print(j+" ");
            }
            
            
            System.out.println();
        }
        else {
            for(int i =1 ; i<=5;i++){
                System.out.print(i+" ");
            }
            System.out.println();
           
        }
        
    }
}
        

    

   

        

    
    
    
    static void MainModule()
    {
        System.out.println("Pattern Generator");
        System.out.println("1. Square Pattern\t2. L Shape Pattern\t3. Triangle\t4. SandClock\n5. Numeric Square1\t6. ButterFly\t7. Diamond Pattern\n8. HollowPyramid\t9.Zero - One Triangle\t10. Rhombus pattern\n11. K Pattern\tm. M pattern\tr. R Pattern \ta. A Pattern\nh. H Pattern\ti. I Pattern");
        String c;
        System.out.println("Choose any one of them....");
        c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        PatternProject p = new PatternProject();
        if (c.equals("1")){
            p.SquarePattern();
        }
        else if (c.equals("2")){
            p.SquarePattern();
        }
        else if (c.equals("3")){
            p.triangle();
        }
        else if (c.equals("4")){
            p.sandclock();
        }
        else if (c.equals("5")){
            p.digitsquare();
        }
        else if (c.equals("6")){
            p.butterfly();
        }
        else if (c.equals("7")){
            p.diamond();
        }
        else if (c.equals("8")){
            p.hollowpyramid();
        }
        else if (c.equals("9")){
            p.zeroone();
        }
        else if (c.equals("10")){
            p.rhombus();
        }
        else if (c.equals("11")){
            p.kpattern();
        }
        else if (c.equals("m")){
            p.m();
        }
        else if (c.equals("r")){
            p.r();
        }
        else if (c.equals("a")){
            p.a();
        }
         else if (c.equals("h")){
            p.h();
        }
         else if (c.equals("i")){
            p.i();
        }
        else if (c.equals("i")){
            p.i();

        }
        else if (c.equals("12")){
            p.reverse();
        }
        System.out.println("\nDo you want to continue.. Press 1 else any key");
        c = JOptionPane.showInputDialog("Press 1 to continue --- ");
        if (c.equals("1")){
            MainModule();
        }
    }
    public static void main(String args[]){
        MainModule();
    }
}