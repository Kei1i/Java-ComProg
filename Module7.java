public class Module7 {
    public static void main(String args[]) {
        int month = 4; //April

        String season;

        //Logic: if any of the conditions is true inside if() or else if() then the statement is true
        if(month == 12 || month == 1 || month == 2)
        season = "Winter";
        else if(month == 3 || month == 4 || month == 5)
        season = "Spring";
        else if(month == 6 || month == 7 || month == 8)
        season = "Summer";
        else if(month == 9 || month == 10 || month == 11)
        season = "Autumn";
        else
        season = "Bogus Month";
        System.out.println("April is in the " + season + ".");

        //Nested ifs
        int Grade=99;
        boolean ChedScholar=true;
        
        //Logic: The Grade is evaluated through ff. conditions 
        //Logic: A separate variable, "ChedScholar," is evaluated within each Grade condition
        if(Grade==100) {
        System.out.println("Ceiling Grade");
            if(ChedScholar==true)
            System.out.println("Scholar Student");
            else 
            System.out.println("Not a Scholar Student");
        }
        else if(Grade>=85) {
        System.out.println("Dean's Lister");
            if(ChedScholar==true)
            System.out.println("Scholar Student");
            else
            System.out.println("Not a Scholar Student");
        }
        else if(Grade>=75) {
            System.out.println("Passing Grade");
                if(ChedScholar==true)
                System.out.println("Scholar Student");
                else
                System.out.println("Not a Scholar Student");
        }
        else {
        System.out.println("Failing Grade");
            if(ChedScholar==true)
            System.out.println("Scholar Student");
            else
            System.out.println("Not a Scholar Student");


            
        }
    }   
}