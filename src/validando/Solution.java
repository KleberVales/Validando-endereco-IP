package validando;

public class Solution {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    while(sc.hasNext())
    {
        String IP = sc.next();
        System.out.println(IP.matches(new MyRegex().pattern));
    }

}
}
