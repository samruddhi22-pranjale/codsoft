class NumberGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int chances=7;
        int finals=0;
        boolean playAgain=true;
        System.out.println("welcome buddy");
        System.out.println("hi buddy you hava about"+chances+"to win the game");
        while(true){
            int rand=getrand(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("chances"+(i+1)+"Enter your guess");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("you won it");
                    break;
                }
                else if(user>rand){
                    System.out.println("too high");
                }
                else{
                    System.out.println("too low");
                }
            }
            if(guess==false){
                System.out.println("sorry buddy you lost the chances the number is"+ rand);
            }
            System.out.println("Do you want to play again(y/n)");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("y";
        }
        System.out.println("that's it buddy ,hope you enjoyed it");
        System.out.println("Here is your score"+finals);
    }
    public static int getrand(int min,int max){
        return(int)(Math.random()*(max-min+1))+min);
    }