/******************************
 * Date: 06/09/2021
 * Name: Arian Khan
 * Filename: Final major
 * Function: Create year
 ******************************/


import java.util.Scanner;
class Main {//Start class
  public static void main(String[] args) {//Start main
    //Get scanner class
        Scanner In = new Scanner (System.in);
        //Declare variables
        int option;
        String replay;
        //Declare the methods 
        welcome();//Displays the welcome message
              
    do{//This will contain the code if the user wants to retry  
        option = menu();//Displays the menu 
        choice(option);//Gives choices on what you want to do
        
        //Ask user to replay 
        
        System.out.println("Do you want to replay(don't use caps)");//Asks user if they want to play again
        replay = In.nextLine();
        
        //If user wants to play again
        if(replay.equals("yes")){
             System.out.println("Restarting...........................");
        }//end if
        
        //If user doesn't want to replay  
            else{//start else
             goodbye(); 
        }//end if        
    }while(replay.equals("yes"));//If user wants to play again 
  }//end main

  //Displays welcome message
    public static void welcome(){//Start welcome method
        //Write a welcome message
        System.out.println("***************************************************");
        System.out.println("****      Welcome to the java Calender       ******");
        System.out.println("***************************************************");
        System.out.println();
    }//end welcome method
    
    //Displays the menu to tell you what each option does
    public static int menu(){//Start menu method
        //Get scanner class
        Scanner In = new Scanner (System.in);
        //Declare variables
        int choice;
        System.out.println("                        There are 4 calenders methods you can chose ");
        System.out.println("1. The first choice is a month calender. This method will display a month calender from any month from the year 1900 of your choice");
        System.out.println("2. The 2nd choice is a year calender. This method will display a calender of a year of your choice");
        System.out.println("3. The third choice is finding the weekdayname. This method will find the week name of a date that you input");
        System.out.println("4. The fourth choice is a future date finder. This method will find the day after a n number of days");
        System.out.println("Which choice do you want to run");
        choice = In.nextInt();
        
        //if user inputs invalid value
        while(choice<1|| choice>4){//Start while
            System.out.println("You have an error please renter");   
            System.out.println("Which choice do you want to run");
            choice = In.nextInt();
        }//end while
        return choice;
    }//end menu method
    
    //Asks user what they want to run
    public static void choice(int option){//Start choice
        //Get scanner class
        Scanner In = new Scanner (System.in);
          
        //If user wants a month calender
        if (option == 1){//start if
            option1();  
        }//end if
        
        //If user wants a year calender
        else if (option == 2){//start if
            option2();
               
        }//end if
        
        //If user wants to find the weekdayname
        else if(option ==3){//start if
            option3();
        }//end if
        else if (option ==4){//start if
            option4();
            
        } //end if
       
    }//end option method
    
     public static void option1(){//end option 1 method
        //Get scanner class
        Scanner In = new Scanner (System.in);
        //Declare variables
        int yearofMonth,newmonth;
        String month;
        
        System.out.println("What year would you like");//Asks user for what year of the month they want to display
        yearofMonth = In.nextInt();
        System.out.println("");
        In.nextLine();
        System.out.println("What month would you like");//Asks user for what month they want to display
        month = In.nextLine();
        newmonth = monthName(month);
        //If user inputs invalid value
        while (checkYear(yearofMonth)|| checkMonth(newmonth)){//Start while
            System.out.println("You have an error, please retry");
            System.out.println("What year would you like");//Asks user for what year of the month they want to display
            yearofMonth = In.nextInt();
            System.out.println("");
            In.nextLine();
            System.out.println("What month would you like");//Asks user for what month they want to display
            month = In.nextLine();
        }//end while
        monthCalendar(month,yearofMonth);  
}//end option1 method
     
    public static void option2(){//start option2 method
        //Get scanner class
        Scanner In = new Scanner (System.in);
        //declare variables
        int year;
        
        System.out.println("What year would you like"); //Asks user for what year they want to display
        year = In.nextInt();
      
        //if user inputs invalid value
        while(checkYear(year)){//Start while
            System.out.println("You have an error, please retry"); 
            System.out.println("What year would you like"); //Asks user for what year they want to display
            year = In.nextInt();   
        }//end while
      yearCalender(year);
}//end option 2 mehod
        
   public static void option3(){//Start option3 method
        //Get scanner class
        Scanner In = new Scanner (System.in);
        //declare variables
        int weekdayyear, day,newmonth;
        String weekdaymonth;
        
        System.out.println("What is the month date of this weekday (For example, January or March or May)");//Asks user for what month of this event they want to display 
        weekdaymonth = In.nextLine();
        System.out.println("What is the number date of this weekday(For example, 1 or 2 or 7)");//Asks user for what day they want to display
        day = In.nextInt();
        System.out.println("What year");//Asks user for what year of the event they want to display
        weekdayyear = In.nextInt();
        newmonth= monthName(weekdaymonth);
        while(checkDate(newmonth,day,weekdayyear )){//Start while
            System.out.println("You have an error, please retry"); 
            System.out.println("What is the month date of this weekday (For example, January or March or May)");//Asks user for what month of this event they want to display 
            weekdaymonth = In.nextLine();
            System.out.println("What is the number date of this weekday(For example, 1 or 2 or 7)");//Asks user for what day they want to display
            day = In.nextInt();
            System.out.println("What year");//Asks user for what year of the event they want to display
            weekdayyear = In.nextInt();
        }//end while
        
        weekDayNameFind(weekdaymonth, day, weekdayyear); 
}//end option3 method
    public static void option4 (){//start option 4 method
        //Get scanner class
         Scanner In = new Scanner (System.in);
        //declare variables
        int n;
    
        System.out.println("How many days after July 1st is your date");//Displays the date after a given amount of days that user inputs
        n = In.nextInt();
         //if user inputs invalid value
        while (n<0){//Start while
          System.out.println("You have an error, please retry"); 
          System.out.println("How many days after July 1st is your date");//Displays the date after a given amount of days that user inputs
          n = In.nextInt();
        }//end while
        futureDateFind (n);     
}//end option4 method   
    
//leap year check
    public static boolean ifLeapYear(int year){//start leapyear method
        if ( (year % 400 ==0) || (year % 4 == 0 && year %100 != 0) )
            return true;
        else
            return false; 
    }//end ifLeapYear
    
        public static int monthName (String month){//Start monthname method
         if (month.equals("January"))
             return 1;
         else if (month.equals("February"))
             return 2;
         else if (month.equals("March"))
             return 3;
         else if (month.equals("April"))
             return 4;
         else if (month.equals("May"))
             return 5;
         else if (month.equals("June"))
             return 6;
         else if (month.equals("July"))
             return 7;
         else if (month.equals("August"))
             return 8;
         else if (month.equals("September"))
             return 9;
         else if (month.equals("October"))
             return 10;
         else if (month.equals("November"))
             return 11;
          else if (month.equals("December"))
             return 12;
         else
              return 0;
     }//end monthname method

    
    public static int totalDays(int year,String month){//Start totaldays method
        //declare variables
       int totaldays = 0, monthname;
       //Declare monthname method
       monthname = monthName(month);
       
       for (int i =1900; i<= year; i++){//Start loop
           if (ifLeapYear(i)){//start if
               totaldays += 366;//Add 366 if its leapyear
           }//end if
           else 
               totaldays +=365;//Add only 365 if it'snot leapyear
       }//end loop
     //This for loop will calculate totaldays  
    for (int y = 1;y<monthname; y++){//start loop
        if ( y == 2 && ifLeapYear(year))//If its leapyear
            totaldays+= 29;//add 29 to totaldays
        else if (y == 2)//if its febraury and not leapyear
            totaldays+=28;//add 28 to totaldays
        else if (y == 6 || y==9 || y==11 || y == 4)//if it's july, september, november or april
            totaldays+=30;//add 30 to totaldays
        else//if it's any other month
            totaldays +=31; //add 31 to totaldays                         
    }//end loop 
    //Made an error to determines the day number, you must get yesterdays value so minus 1 if it's a non-leapyear minus to if its leapyear
        if (ifLeapYear(year)){//start if
            totaldays-=2;
        }//end if
        else{//start else
            totaldays -=1;
        }//end else
        
       return totaldays;   
    }//end totaldays method

    //Display year calender
    
    public static void yearCalender(int year){//start yearcalender method
       //Declare variables
        int totaldays, monthnum = 13,space =0,days=0;
        totaldays = totalDays(year, "a");
        System.out.println("                             Calender for the year " + year);
       for (int i =1; i<monthnum; i++){//Start loop
            //If user inupts January
        if (i== 1){//Start if
            monthCalendar(("January"),year);
            totaldays+=31;   
        }//end if
        //If user inupts febraury
        else if (i ==2){//Start if 
           if(ifLeapYear(year)){//If it is a leapyear
                totaldays+=29;
                monthCalendar(("February"),year);

            }//end if
            else {//Start else
                totaldays+=28;
                monthCalendar(("February"),year);
            }//end if
        } //end if   
        //If user inupts March
        else if  (i== 3){//Start if 
            totaldays+=31;
            monthCalendar(("March"),year);
        }//end if   
        //If user inupts April
        else if (i==4){//Start if
            totaldays+=30;
            monthCalendar(("April"),year);
        }  //end if 
        //If user inupts May
        else if (i == 5){//Start if
            totaldays+=31;
            monthCalendar(("May"),year);
        }//end if
         //If user inupts June   
        else if (i== 6){//Start if
            totaldays+=30;
            monthCalendar(("June"),year);  
        }//end if
         //If user inupts July   
        else if (i== 7){//Start if 
            totaldays+=31;
            monthCalendar(("July"),year);  
        }//end if
        //If user inupts August    
        else if (i == 8){//Start if 
            totaldays+=31;
            monthCalendar(("August"),year);
        }//end if
        //If user inupts September  
        else if (i == 9){//Start if 
            totaldays+=30;
            monthCalendar(("September"),year);
        }//end if
        //If user inupts October     
        else if (i== 10){//Start if 
            totaldays+=31;
            monthCalendar(("October"),year);
        }//end if
         //If user inupts November   
        else if (i == 11){//Start if 
            totaldays+=30;
            monthCalendar(("November"),year);
        } //end if 
        //If user inupts December
        else if (i == 12){//Start if 
            totaldays+=31;
            monthCalendar(("December"),year);
        }//end if   
            
     }//end loop
  }//end yearcalender method
    
    //Display month calender
    public static void monthCalendar(String month, int year ){//start monthCalender method
        //declare variables
        int space = 0,days = 0, totaldays= 0,monthname; 

         //Get totaldays method
        totaldays = totalDays(year,month);
        monthname = monthName(month);
           
        //Determines which calender to display
        //If user inupts January
        if (monthname == 1){//Start if 
            days = 31;
        }//end if
        //If user inupts febraury
        else if (monthname ==2){//Start if 
            if(ifLeapYear(year)){//If it is a leapyear
                days =29;
            }//end if
            else {//Start else
                days = 28;
            }//end if
        } //end if   
        //If user inupts March
        else if (monthname == 3){//Start if 
            days = 31;
        }//end if   
        //If user inupts April
        else if (monthname ==4){//Start if 
            days = 30;
        }  //end if 
        //If user inupts May
        else if (monthname == 5){//Start if 
            days = 31;
        }//end if
         //If user inupts June   
        else if (monthname == 6){//Start if 
            days = 30;
        }//end if
         //If user inupts July   
        else if (monthname == 7){//Start if 
            days = 31;
        }//end if
        //If user inupts August    
        else if (monthname == 8){//Start if 
            days = 31;
        }//end if
        //If user inupts September  
        else if (monthname == 9){//Start if 
            days = 30;
        }//end if
        //If user inupts October     
        else if (monthname == 10){//Start if 
            days = 31;
        }//end if
         //If user inupts November   
        else if (monthname == 11){//Start if 
            days = 30;
        } //end if 
        //If user inupts December
        else if (monthname == 12){//Start if 
            days = 31; 
        }//end if   
        
        //Create the calender
        System.out.println("                                   "+ month);
        System.out.println("      Monday   Tuesday   Wednesday   Thursday   Friday   Saturday   Sunday");
        if (totaldays % 7 == 0){//start if
            space = 0; //An interger that counts the amount of spaces, this will be used later to only display a max amount of days
        }//end else
        //If day starts on Tuesday
        else if(totaldays% 7 ==1){//start if
            System.out.printf("%10s", " ");//Displays the blank spaces to start the month on any day
            space = 1; //An interger that counts the amount of spaces, this will be used later to only display a max amount of days
        }//end else
        //If day starts on wednesday
        else if(totaldays% 7 ==2){//start if
            System.out.printf("%20s", " "); //Displays the blank spaces to start the month on any day
            space =2; //An interger that counts the amount of spaces, this will be used later to only display a max amount of days
        }//end else
        //if day starts thursday
        else if(totaldays% 7 ==3){//start if
            System.out.printf("%30s", " "); //Displays the blank spaces to start the month on any day
            space =3; //An interger that counts the amount of spaces, this will be used later to only display a max amount of days
        }//end else
        //If day starts friday
        else if(totaldays% 7 ==4){//start if
            System.out.printf("%40s", " "); //Displays the blank spaces to start the month on any day
            space =4; //An interger that counts the amount of spaces, this will be used later to only display a max amount of days
        }//end else
        //If day starts on saturday
         else if(totaldays% 7 ==5){//start if
            System.out.printf("%50s", " "); //Displays the blank spaces to start the month on any day
            space =5; //An interger that counts the amount of spaces, this will be used later to only display a max amount of days
        }//end else
        //If the month starts sunday
        else if(totaldays % 7 ==6){//start if
            System.out.printf("%60s", " "); //Displays the blank spaces to start the month on any day
            space =6; //An interger that counts the amount of spaces, this will be used later to only display a max amount of days
        }//end else
         
        //Use for loop to get days
        for (int i=1; i<= days; i++)         
            {//Start for loop 
               System.out.printf("%10d", i);//Displays spacs inbetween the days of the month
               if ((i+space)%7 == 0 )//Once you get to every 7 days, print a new line, only sgets a certain amount of spaces depending on the day
                    System.out.println();
            } //end loop
        System.out.println();
           
    }//end monthCalender method 
    
    
    //Find what day of the week the month starts on
   public static void weekDayNameFind( String month, int  day,  int year){//Start weekdayname method
        //Declare variables
        int totaldays;
        
        //Must subtract one from days value to get the right day becuase we are only going up to yesterdays value
        day-=1;
        //Call totaldays method 
        totaldays = totalDays(year,month);
        totaldays +=day;//Add days to totaldays
     
        //Determines what day of the week it is
        //If day is monday
        if (totaldays % 7 ==0){//Start if
            System.out.println("Your day is Monday");
        }//end if
        //If day is tuesday
        else if (totaldays % 7 == 1){//Start else
            System.out.println("Your day is Tuesday");
        }//end else
            
        //If day is wednesday
        else if (totaldays % 7 == 2){//Start else
            System.out.println("Your day is Wednessday");
        }//end else
            
        //If day is Thursday
        else if (totaldays % 7 == 3){//Start else
            System.out.println("Your day is Thursday");
        }//end else
        //If day is Friday
        else if (totaldays % 7 == 4){//Start else
            System.out.println("Your day is Friday");
        }//end else
        //If day is Saturday
        else if (totaldays % 7 == 5){//Start else
            System.out.println("Your day is Saturday");
        }//end else
        //If day is Sunday
        else if (totaldays % 7 == 6){//Start else
            System.out.println("Your day is Sunday");
        }//end else
    }//end weekdayname
    
    //Find future dates
    public static void futureDateFind (int  n) {//start future date
      //Declare variables
        int month = 7, day = 1, year = 2021;
      //If month is febrary and leap year
      while (n>30){//Start nested while loop
          if (month ==2 && ifLeapYear(year)){//Start if
              n-=29;//Subtract 29 days from future days
              month++;//Add a month because the date inputed was more than a month
          }//end if
          //If month is feburary and not leap year
         else if (month ==2) {//Start if
             n-=28;//Subtract 28 days from future days
             month++;//Add a month because the date inputed was more than a month
         }//end if
         //If month is April, June, September or November
         else if (month == 4 || month == 6 || month == 9 || month ==11){//start if
             n-=30;//Subtract 30 days from future days
             month++;//Add a month because the date inputed was more than a month
         }//end if
         //If month is January, March, July, August,October, December
         else{//Start else
             n-=31;//Subtract 31 days from future days
             month++;//Add a month because the date inputed was more than a month
         }//end else
          
      //There aren't more tha 13 months, so this while loop will keep going until month is less than 12
        while (month >= 13){//start while
            month -=12;
            year++;
      }//end while
    }//end nested while loop
      
      day += n;
      if (month == 1){//Start if 
          if (day % 10==1 && day!= 11)//Month date end with one
              System.out.println("Your future date is January "+ day+ "st " + year);
          else if (day% 10==2 && day!=12)//if monthdate ends in 2
              System.out.println("Your future date is January "+ day+ "nd " + year);
          else if (day% 10==3 && day!=13)//If monthdate ends in 3
              System.out.println("Your future date is January "+ day+ "rd " + year);
          else//if monthdate ends in anything else
              System.out.println("Your future date is January "+ day+ "th " + year);
        }//end if
        //If user inupts febraury
        else if (month ==2){//Start if 
            if (day % 10==1 && day!= 11)//if monthdate ends in 1
                System.out.println("Your future date is Febraury "+ day +"st "+ year);
            else if (day% 10==2 && day!=12)//if monthdate ends in 2
                System.out.println("Your future date is Febraury "+ day +"nd "+ year);
            else if (day% 10==3 && day!=13)//if monthdate ends in 3
                System.out.println("Your future date is Febraury "+ day +"rd "+ year);
            else//if monthdate ends in anything else
                System.out.println("Your future date is Febraury "+ day +"th "+ year);
        } //end if   
        //If user inupts March
        else if (month == 3){//Start if 
            if (day % 10==1 && day!= 11)//Month date end with one
              System.out.println("Your future date is March "+ day+ "st " + year);
            else if (day% 10==2 && day!=12)//if monthdate ends in 2
              System.out.println("Your future date is March "+ day+ "nd " + year);
            else if (day% 10==3 && day!=13)//If monthdate ends in 3
              System.out.println("Your future date is March "+ day+ "rd " + year);
            else//if monthdate ends in anything else
              System.out.println("Your future date is March "+ day+ "th " + year);
        }//end if   
        //If user inupts April
        else if (month ==4){//Start if 
            if (day % 10==1 && day!= 11)//Month date end with one
              System.out.println("Your future date is April "+ day+ "st " + year);
            else if (day% 10==2 && day!=12)//if monthdate ends in 2
              System.out.println("Your future date is April "+ day+ "nd " + year);
            else if (day% 10==3 && day!=13)//If monthdate ends in 3
              System.out.println("Your future date is April "+ day+ "rd " + year);
            else//if monthdate ends in anything else
              System.out.println("Your future date is April "+ day+ "th " + year);
        }  //end if 
        //If user inupts May
        else if (month == 5){//Start if 
            if (day % 10==1 && day!= 11)//Month date end with one
              System.out.println("Your future date is May "+ day+ "st " + year);
            else if (day% 10==2 && day!=12)//if monthdate ends in 2
              System.out.println("Your future date is May "+ day+ "nd " + year);
            else if (day% 10==3 && day!=13)//If monthdate ends in 3
              System.out.println("Your future date is May "+ day+ "rd " + year);
            else//if monthdate ends in anything else
              System.out.println("Your future date is May "+ day+ "th " + year);
        }//end if
         //If user inupts June   
        else if (month== 6){//Start if 
            if (day % 10==1 && day!= 11)//Month date end with one
              System.out.println("Your future date is June "+ day+ "st " + year);
            else if (day% 10==2 && day!=12)//if monthdate ends in 2
              System.out.println("Your future date is June "+ day+ "nd " + year);
            else if (day% 10==3 && day!=13)//If monthdate ends in 3
              System.out.println("Your future date is June "+ day+ "rd " + year);
            else//if monthdate ends in anything else
              System.out.println("Your future date is June "+ day+ "th " + year);
        }//end if
         //If user inupts July   
        else if (month == 7){//Start if 
            if (day % 10==1 && day!= 11)//Month date end with one
              System.out.println("Your future date is July "+ day+ "st " + year);
            else if (day% 10==2 && day!=12)//if monthdate ends in 2
              System.out.println("Your future date is July "+ day+ "nd " + year);
            else if (day% 10==3 && day!=13)//If monthdate ends in 3
              System.out.println("Your future date is July "+ day+ "rd " + year);
            else//if monthdate ends in anything else
              System.out.println("Your future date is July "+ day+ "th " + year);
        }//end if
        //If user inupts August    
        else if (month == 8){//Start if 
            if (day % 10==1 && day!= 11)//Month date end with one
              System.out.println("Your future date is August "+ day+ "st " + year);
            else if (day% 10==2 && day!=12)//if monthdate ends in 2
              System.out.println("Your future date is August "+ day+ "nd " + year);
            else if (day% 10==3 && day!=13)//If monthdate ends in 3
              System.out.println("Your future date is August "+ day+ "rd " + year);
            else//if monthdate ends in anything else
              System.out.println("Your future date is August "+ day+ "th " + year);
        }//end if
        //If user inupts September  
        else if (month == 9){//Start if 
            if (day % 10==1 && day!= 11)//Month date end with one
              System.out.println("Your future date is September "+ day+ "st " + year);
            else if (day% 10==2 && day!=12)//if monthdate ends in 2
              System.out.println("Your future date is September "+ day+ "nd " + year);
            else if (day% 10==3 && day!=13)//If monthdate ends in 3
              System.out.println("Your future date is September "+ day+ "rd " + year);
            else//if monthdate ends in anything else
              System.out.println("Your future date is September "+ day+ "th " + year);
        }//end if
        //If user inupts October     
        else if (month == 10){//Start if 
            if (day % 10==1 && day!= 11)//Month date end with one
              System.out.println("Your future date is October "+ day+ "st " + year);
            else if (day% 10==2 && day!=12)//if monthdate ends in 2
              System.out.println("Your future date is October "+ day+ "nd " + year);
            else if (day% 10==3 && day!=13)//If monthdate ends in 3
              System.out.println("Your future date is October "+ day+ "rd " + year);
            else//if monthdate ends in anything else
              System.out.println("Your future date is October "+ day+ "th " + year);
        }//end if
         //If user inupts November   
        else if (month== 11){//Start if 
            if (day % 10==1 && day!= 11)//Month date end with one
              System.out.println("Your future date is November "+ day+ "st " + year);
            else if (day% 10==2 && day!=12)//if monthdate ends in 2
              System.out.println("Your future date is November "+ day+ "nd " + year);
            else if (day% 10==3 && day!=13)//If monthdate ends in 3
              System.out.println("Your future date is November "+ day+ "rd " + year);
            else//if monthdate ends in anything else
              System.out.println("Your future date is November "+ day+ "th " + year);
        } //end if 
        //If user inupts December
        else if (month == 12){//Start if 
            if (day % 10==1 && day!= 11)//Month date end with one
              System.out.println("Your future date is December "+ day+ "st " + year);
            else if (day% 10==2 && day!=12)//if monthdate ends in 2
              System.out.println("Your future date is December "+ day+ "nd " + year);
            else if (day% 10==3 && day!=13)//If monthdate ends in 3
              System.out.println("Your future date is December "+ day+ "rd " + year);
            else//if monthdate ends in anything else
              System.out.println("Your future date is December "+ day+ "th " + year);
        }//end if   
 }//end FutureDatefind method
  
    public static boolean checkYear (int year){//Start checkyear method
        if (year <=1899)
           return true;
        else
           return false;           
    }//end checkyear
    public static boolean checkMonth (int month){//Start checkMonth method
        if (month == 0)
            return true;
        else 
            return false;
    }//end checkdate
   public static boolean checkDate (int month, int day, int year){//Start checkdate method
        if (month ==0 ||day<=0||day>31||year<=1899)
            return true;
        else
            return false;
    }//end checkdate method

  public static void goodbye(){//Start goodbye method
      System.out.println("***************************************");
      System.out.println("****            Thanks            *****");
      System.out.println("****          For Playing         *****");
      System.out.println("***************************************");
  }//End goodbye method
}//end calss