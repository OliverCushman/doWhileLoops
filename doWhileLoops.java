public class doWhileLoops
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    int i = 0;
    int k = 20;
    
    public void run() {
        do {
            System.out.println("i is " + i + " but is less than 15");
            i++;
        } while (i < 15);
        do {
            System.out.println("k is " + k + " but is greater than 5");
            k--;
        } while (k > 5);
        do {
            System.out.println("a is " + a + " but is less than 10 and b is "
            + b + " but is less than or equal to 20");
            a++;
            b++;
        } while (a < 10 && b <= 20);
    }
    
    public static void main(String[] args)
    {        
        doWhileLoops dwl = new doWhileLoops();
        dwl.run();
    }
}