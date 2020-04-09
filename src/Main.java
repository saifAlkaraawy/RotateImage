public class Main {

    public static void main(String[] args) {



        int [][] image={{1,2,3}, {4,5,6},{7,8,9}};
        rotateImage(image);

    }//main function
    static int[][] rotateImage(int[][] image) {
        int imageRotated[][]=new int[image.length][image.length];
        int x=0;// نصاعدي
        int y=image.length-1;
        for (int []D1: image) {
            for (int D:D1) {
              imageRotated[x][y]=D;
              x++;
            }
            x=0;
           y--;
        }
        for (int i=0;i<=imageRotated.length-1;i++){

            for (int j=0;j<=image.length-1;j++){
                System.out.print(imageRotated[i][j]);

            }
            System.out.println("");

        }

        return  imageRotated;

    }

}//class