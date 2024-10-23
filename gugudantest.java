public class gugudantest {
    // Ilham Nurrohma
    public static void main(String[] args) {
         int i = 2; 
         int j = 1;

         do {
            System.out.println(i + " * " + j + "=" + i*j);
            if (j < 9){
                System.out.print(",");
                j++;
            }
            else{
                j = 1;
                System.err.println("");
                i++;
         }
         } while (i <= 9);
        
    }
}