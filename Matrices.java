public class Matrices {
    private static int r() {
        int x = (int) (Math.random()*7);
        return x;
    }
    public static void main(String[] args) {
        //String black="\033[30m"; 
        String red="\033[31m"; 
        String green="\033[32m"; 
        String yellow="\033[33m"; 
        String blue="\033[34m"; 
        String purple="\033[35m"; 
        String cyan="\033[36m"; 
        String white="\033[37m";
        String color[] = new String[]{/*black,*/ red, green, yellow, blue, purple, cyan, white};
        String reset="\u001B[0m";
        int r = r();
        int matriz[][] = new int[20][20];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    if (i < 10 && j < 10) {
                        System.out.print(color[r]+"0"+i+ ",0" + j + " "+reset);
                        //r=r();
                    }
                    else if (j < 10) {
                        System.out.print(color[r]+i+ ",0" + j + " "+reset);
                        //r=r();
                    }
                    else {
                        System.out.print(color[r]+i+ "," + j + " "+reset);
                        //r=r();
                    }
                    //r = r();
                }
                if (i + j == matriz.length-1) {
                    if (i < 10 && j < 10) {
                        System.out.print(color[r]+"0"+i+ ",0" + j + " " +reset);
                        //r=r();
                    }
                    else if (i < 10) {
                        System.out.print(color[r]+"0"+i+ "," + j + " "+reset);
                        //r=r();
                    }
                    else if (j < 10) {
                        System.out.print(color[r]+i+ ",0" + j + " "+reset);
                        //r=r();
                    }
                    else {
                        System.out.print(color[r]+i+ "," + j + " "+reset);
                        //r=r();
                    }
                }
                if (i < 10 && j < 10 && !(i + j == matriz.length-1) && i != j) {
                    System.out.print("0"+i+ ",0" + j + " ");
                }
                else if (i < 10 && !(i + j == matriz.length-1) && i != j) {
                    System.out.print("0"+i+ "," + j + " ");
                }
                else if (j < 10 && !(i + j == matriz.length-1) && i != j) {
                    System.out.print(i+ ",0" + j + " ");
                }
                else if (!(i + j == matriz.length-1) && i != j) {
                    System.out.print(i+ "," + j + " ");
                }
            }
            System.out.println();
        }
        /*for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i + j == matriz.length-1) {
                    if (i < 10 && j < 10) {
                        System.out.print("0"+i+ ",0" + j + " ");
                    }
                    else if (i < 10) {
                        System.out.print("0"+i+ "," + j + " ");
                    }
                    else if (j < 10) {
                        System.out.print(i+ ",0" + j + " ");
                    }
                    else {
                        System.out.print(i+ "," + j + " ");
                    }
                }
                System.out.print("      ");
            }
            System.out.println();
        }*/
    }
}
