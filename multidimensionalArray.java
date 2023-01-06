public class multidimensionalArray {
    public static void main(String args[]) {
        int arr2d[][] = {{5,6,7,8},{4,3,2,1},{15,16,17,18},{14,13,12,11} };
        //5,6,7,8
        //4,3,2,1
        //15,16,17,18
        //14,13,12,11

        //System.out.println(arr2d[2][2]);


        for(int row=0; row < arr2d.length; row++){
            for(int col=0; col < arr2d[row].length; col++){
                int rowcol = row + col ;
                int arrlen = arr2d.length - 1;

                if (arr2d[row] == arr2d[col] || arrlen == rowcol){
                    System.out.print(arr2d[row][col] + "\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
