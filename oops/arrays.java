public class arrays{
    public static void main(String args[]){
       /*  int num[] = {5,6,7};
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        } */
        int num[][] = new int[3][4];

        for(int i = 0;i<3;i++){
            for(int j = 0; j <4;j++){
                num[i][j] = (int)(Math.random()*100);
            }
        }

        // for(int i = 0;i<3;i++){
        //     for(int j = 0; j <4;j++){
        //         System.out.print(num[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for(int n[]: num){ //Enhanced for loop
        //     for(int m:n){
        //         System.out.print(m+" ");
        //     }
        //     System.out.println();
        // }

        //Jagged array

         int nums[][] = new int[3][];
         
         nums[0] = new int[3];
         nums[1] = new int[4];
         nums[2] = new int[2];

         for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random()*100);
            }
         }

         for(int n[]:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
             System.out.println();
         }
    }
}