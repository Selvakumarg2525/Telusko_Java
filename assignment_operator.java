public class assignment_operator {
    public static void main(String args[])
    {
        int num1=7;
        int num2=10;

        int result = num1+num2;
        System.out.println(result);
        int result1 = num1-num2;
        System.out.println(result1);
        int result2 = num1*num2;
        System.out.println(result2);
        int result3 = num1/num2;
        System.out.println(result3);
        int result4 = num1%num2;
        System.out.println(result4);
        num2+=10;//-= , *= , /= , %= 
        System.out.println(num2);

        //System.out.println(num2++);
        //System.out.println(++num2);
    }
}
