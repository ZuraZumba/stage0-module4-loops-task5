package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int median = (sideLength-1)/2;
//        System.out.print(median);
        if (sideLength<=0 || sideLength%2 != 1) {
            System.out.print("");
        }
        else {
            for(int i=0; i < sideLength; i++){
                for (int j = 0; j < sideLength; j++){
                    if (i==median || j==median){
                        System.out.print("8");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                System.out.print("\n");
            }
        }
    }
    public static void main (String [] args) {
        Cross cross = new Cross();
        int sideLength = 5;
        cross.printCross(sideLength);
    }
}
