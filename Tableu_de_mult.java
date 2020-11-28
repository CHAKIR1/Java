public class Tableu_de_mult {
    
    public static void main(String[] args) {
        //int comp=0;
        for(int i=20;i>=0;i--){
            if((i/10==0)&&(i>=0))
            System.out.print("  " +i+"  ");
            else if((i/10==0)&&(i<=0))
            System.out.print(" "+i+"  ");
            else if((i/10!=0)&&(i<=0))
            System.out.print(i+"  ");
            else
            System.out.print(" "+i+"  ");
            if(i%3==0){
                System.out.println();
            }
        }
        
    }
    
}