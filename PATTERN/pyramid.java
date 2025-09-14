// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n-1;k>i;k--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
            
        
    }
}