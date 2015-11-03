
package hernandez_3_strings;

    import java.util.Random;
    import java.util.Scanner;
    
    
public class Hernandez_3_Strings {
    static int magicnumber;
    static int userguess;
    static String username;
    static Random ro = new Random();
    static boolean playagain;
    static int tiesleft;
    
   
    public static void main(String[] args) {
        playagain= true;
        tiesleft=6;
        magicnumber = ro.nextInt(100);
        System.out.println("What is your name, nerd?");
        
        Scanner userinputname = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        username =userinputname.nextLine();
        System.out.println("Welcome to the Salty Spatoon," + username + " Let's play a little game, shall we?");
        
        while(playagain){
            playthegame();
           
        }}
    
          static void playthegame(){
              Scanner userinputnumbers = new Scanner(System.in);
              System.out.println("Pick a number, if you dare dare to dare..");
              userguess = userinputnumbers.nextInt();
              if(magicnumber == userguess) {
                  System.out.println("You win! Now get out.");
                  playagain=false;
              }
              else if(magicnumber > userguess){
                  tiesleft=tiesleft-1;
                  System.out.println("Too Low! You now have " +tiesleft+" tries left.");
                  playagain=true;
              }
              else if(magicnumber < userguess){
                  tiesleft=tiesleft-1;
                  System.out.println("Too High! You now have " + tiesleft +" tries left.");
                  playagain=true;
              }
        
          }
    }
    

