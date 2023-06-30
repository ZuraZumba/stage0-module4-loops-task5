package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        if (sideLength<=0){
            System.out.print("");
        }
        else {
            //first row
            for (int i=0; i<sideLength; i++){
                System.out.print("8");
            }
            System.out.print("\n");
            //second row
            for(int i=0; i<sideLength-2; i++){
                for (int j = 0; j < sideLength; j++){
                    if (j == 0 || j == sideLength-1){
                        System.out.print("8");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
            //last row
            for (int i=0; i<sideLength; i++){
                System.out.print("8");
            }
            System.out.print("\n");

        }
    }
    public static void main (String [] args){
        Square square = new Square();
        int sideLength = 9;
        square.printSquareFrom8s(sideLength);
    }
}
