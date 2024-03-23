class type_conversion{
    public static void main(String args[])
        {
            byte b=127;
            int a = 257;
            b=(byte)a;
            System.out.println(b);
            a=b;
            float fl = 5.6f;
            int x = (int)fl;
            System.out.println(x);
            //type promotion
            byte aa=10;
            byte bb=30;

            int result=aa*bb;
            System.out.println(result);

    

        }
}