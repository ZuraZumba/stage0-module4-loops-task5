package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        if (length==0 && height==0){
            System.out.print("");
        }
        else {

//first row
            for (int i=0; i < length; i++){
                System.out.print("8");
            }
            System.out.print("\n");
            // middle rows
            for (int i=0; i < height-2; i++){
                for (int j=0; j<length; j++){
                    if(j==0 || j==length-1){

                        System.out.print("8");
                    }
                    else {
                        System.out.print(" ");

                    }
                }
                System.out.print("\n");
            }
            for (int i=0; i < length; i++){
                System.out.print("8");
            }
            System.out.print("\n");

        }
    }
    public static void main (String [] args){
        Rectangle rectangle = new Rectangle();
        int length = 5;
        int height = 6;
        rectangle.printRectangleFrom8s(length, height);
    }
}
