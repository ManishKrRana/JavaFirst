import java.util.*;
class Table
{
    void table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}
public class Example
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter any Number:-");
        int n=S.nextInt();
        Table t=new Table();
        t.table(n);
    }
}