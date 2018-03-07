public class asterisco {
    private static int r() {
        int x = (int) (Math.random()*8);
        return x;
    }
    public static void main(String[] args) throws InterruptedException {
	String black="\033[30m"; 
        String red="\033[31m"; 
        String green="\033[32m"; 
        String yellow="\033[33m"; 
        String blue="\033[34m"; 
        String purple="\033[35m"; 
        String cyan="\033[36m"; 
        String white="\033[37m";
        String color[] = new String[]{black, red, green, yellow, blue, purple, cyan, white};
        String reset="\u001B[0m";
        int r = r();
	for (int Z = 0; Z < 9; Z++) {
	for (int I = 0; I < 61; I++) {
            System.out.print("  ");
            System.out.print(color[r]+"*"+reset);
		r = r();
            Thread.sleep(3);
	    System.out.print(color[r]+" *"+reset);
		r = r();
	    Thread.sleep(3);
	    System.out.print("\b\b");
	    Thread.sleep(3);
            System.out.print("\b");
            Thread.sleep(3);
        }    
	Thread.sleep(3);
	System.out.print(color[r]+"*    "+reset);
		r = r();
	System.out.print("\b\b\b\b\b\b");
	for (int X = 0; X < 126; X++) {
	    System.out.print("  \b\b\b");
	    System.out.print(color[r]+"*"+reset);
		r = r();
	    Thread.sleep(3);
	    System.out.print("  \b\b\b");
	    Thread.sleep(3);
	}
	}
    }
}
