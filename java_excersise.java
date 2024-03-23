import java.util.*;
class java_excersise
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        //factorial program
        
        // int n = scan.nextInt();
        // int sum=1;
        // for(int i=1;i<=n;i++)
        // {
        //     sum*=i;
        // }
        // System.out.println(sum);
        // scan.close();

        //display login system
        // String u_name=scan.nextLine();
        // String u_pass=scan.nextLine();
       
        // System.out.println(u_pass);
        // System.out.println(u_name);
        // if(u_name.equals("admin") && u_pass.equals("password123")){
        //     System.out.println("Welcome User ! \n");
        // }
        // else{
        //     System.out.println("Sorry you are not a valid user!");
        // }
        // scan.close();

        System.out.println("Welcome to Guessing game");
        Random random= new Random();
        int guess_value=random.nextInt(100);
        System.out.println("User please enter the number that what i have choose\n");
        int u_value=scan.nextInt();
        if(u_value>=guess_value){
            System.out.println("Asai padalam Aaanal over aasai padakudathu");
        }
        else if(u_value==guess_value){
            System.out.println("Parruda thalaivanuku robot mind tha pola");
        }
        else if(u_value<=guess_value)
        {
            System.out.println("Naa unta romba ethirpathee");

        }
        else{
            System.out.println("Nee ithuku sarii pattu varamatee");
        }
        scan.close();
    






        
    }
}