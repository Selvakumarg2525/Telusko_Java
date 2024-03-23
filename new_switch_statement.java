class new_switch_statement
{
    public static void main(String args[])
    {
        String day = "Monday";
        // switch(day)
        // {
        //     case "Saturday","Sunday"->System.out.println("6am");
        //     case "Monday"-> System.out.println("8 am");
                
        //     default->System.out.println("7 am");
        // }
        // String result= switch(day)
        // {
        //     case "Saturday","Sunday"->"6am";
        //     case "Monday"-> "8 am";
                
        //     default->"7 am";
        // };
        // System.out.println(result);
        String result= switch(day)
        {
            case "Saturday","Sunday":yield"6am";
            case "Monday":yield "8 am";
                
            default:yield "7 am";
        };
        
        System.out.println(result);
    }
}