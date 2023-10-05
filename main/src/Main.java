import java.util.Scanner;


public class Main
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("It's your first day working as a chef in a pizzeria. \nYou lied on your resume, and you have no idea how to make pizzas. Try to earn a bit of money before you get fired.");
        Thread.sleep(1000);
        int resultOne = dayOne();

        if(resultOne >= 0)
        {
            String endDayOneChoice = endDayOne();
            if(endDayOneChoice.equals("stay"))
            {

                int nightResult = night();
                if(nightResult==0)
                {
                    System.out.println("You died. GG!");
                    return;
                }
                if(nightResult==1)
                {
                    dayTwo();
                    return;
                }
                if(resultOne == 0)
                {
                   dayTwoF();
                }
                if(resultOne > 0)
                {
                    dayTwoR(resultOne);
                }
            }
            if(endDayOneChoice.equals("rest"))
            {
                dayTwo();
            }
        }


    }

    public static void dayTwoF() throws InterruptedException {
        System.out.println("Last night, you dreamt of a plan to defeat the manager's son.");
        Thread.sleep(3000);
        System.out.println("You know he loves pineapples, so you'll arrive early at the pizzeria, and use the leftover pineapple slices as bait while you sneak up on him.");
        Thread.sleep(3000);
        System.out.println("You head to work once again, hoping everything goes as planned.");
        Thread.sleep(3000);
        System.out.println("Unfortunately, you've used up all of your pineapple slices on your pizza yesterday!");
        Thread.sleep(3000);
        System.out.println("You panic. You try to unlock the front door, but it is locked.");
        Thread.sleep(3000);
        System.out.println("When you turn around,");
        Thread.sleep(2000);
        System.out.println("He was already behind you.");
        Thread.sleep(2000);
        System.out.println("You died. GG!");

    }
    public static void dayTwoR(int slices) throws InterruptedException {

        System.out.println("Last night, you dreamt of a plan to defeat the manager's son.");
        Thread.sleep(2000);
        System.out.println("You know he loves pineapples, so you'll arrive early at the pizzeria, and use the leftover pineapple slices as bait while you sneak up on him.");
        Thread.sleep(3000);
        System.out.println("You head to work once again, hoping everything goes as planned.");
        Thread.sleep(3000);
        System.out.println("There are " + slices + " slices of pineapples left in the pizzeria. You carefully take them out and lay them near the pizza oven. ");
        Thread.sleep(3000);
        System.out.println("It's time to wait.");
        Thread.sleep(1000);
        System.out.println("Where will you hide?");
        System.out.println("1. In the fridge\n2. The storage room\n(Enter 1 or 2)");
        Scanner end = new Scanner(System.in);
        int input = end.nextInt();
        if(input == 1)
        {
            Thread.sleep(1000);
            System.out.println("You hide in the fridge. It's cold and there is some rotting ingredients.");
            Thread.sleep(2000);
            System.out.println("Soon, you hear footsteps approaching. You peek out of the crack in the fridge door and confirm that it is the manager's son.");
            Thread.sleep(2000);
            System.out.println("Seeing the pineapples, he approaches them with his mouth watering");
            Thread.sleep(2000);
            System.out.println("When he got close enough, you channel all of your main character energy, jumped out and pushed him inside the pizza oven!");
            Thread.sleep(2000);
            System.out.println(".");
            Thread.sleep(2000);
            System.out.println(".");
            Thread.sleep(2000);
            System.out.println(".");
            Thread.sleep(2000);
            System.out.println("He has been turned into a pineapple pizza. You've successfully saved yourself and your co-workers' lives! GG!");
        }
        if(input == 2)
        {
            Thread.sleep(1000);
            System.out.println("You hide in the storage room. It's dark. You can't see a thing.");
            Thread.sleep(2000);
            System.out.println("You were just going to take a sigh of relief,");
            Thread.sleep(2000);
            System.out.println("When you spot him in the corner of the storage room. The sliver of light from the door crack reflects upon the kitchen knife in his hand.");
            Thread.sleep(2000);
            System.out.println(".");
            Thread.sleep(2000);
            System.out.println(".");
            Thread.sleep(2000);
            System.out.println(".");
            Thread.sleep(2000);
            System.out.println("Manager's son: \"You thought you had me.\"");
            Thread.sleep(2000);
            System.out.println("You have been killed! GG!");
        }

    }
    public static void dayTwo() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Its day two of you working as a fake chef. You arrive at the pizzeria early, hoping to receive the manager's approval. But he cannot be found anywhere.");
        Thread.sleep(3000);
        System.out.println("You are confused. It's a bit quiet. Too quiet. Your co-workers are slacking off, playing genshin impact.");
        Thread.sleep(3000);
        System.out.println("You decide to go home, but you realise the only exit is locked.");
        Thread.sleep(3000);
        System.out.println("The silence is suddenly interrupted by the fatal screams of your co-workers.");
        Thread.sleep(3000);
        System.out.println("The manager's son approaches you next with a kitchen knife in his hand. You are terrified and confused.");
        Thread.sleep(3000);
        System.out.println("In the blink of an eye, your vision starts blurring and you fall to the floor. You died. GG!");
    }
    public static int dayOne() throws InterruptedException {
        if (!dough())
        {
            System.out.println("You've been seen with your mess of ingredients. You've been kicked out! GG.");
            return -1;
        }
        if (!rise())
        {
            System.out.println("The manager is disappointed in you. You've been fired! GG.");
            return -1;
        }
        if (!shape())
        {
            System.out.println("The manager's face turned red in fury. You've been thrown out! GG.");
            return -1;
        }
        if (!toppings())
        {
            System.out.println("You've been fired! GG.");
            return -1;
        }
        if (!bake())
        {
            System.out.println("Terrible job! You got kicked out. GG.");
            return -1;
        }
        int slicesLeft = howMany();
        System.out.println("Incredible job on your first day!");
        return slicesLeft;
    }
    public static String endDayOne() throws InterruptedException {
        String choice = "";

        Thread.sleep(1000);
        System.out.println("You're very upset that the manager only paid you 2$ for your hard work. Should you get some rest at home or stay to explore the pizzeria?");
        System.out.println("1. Go home and rest\n2. Stay in the pizzeria\n(Enter 1 or 2)");
        Scanner end = new Scanner(System.in);
        String input = end.nextLine();

        if(input.equals("1"))
        {
            System.out.println("You went home and got a nice night of sleep.");
            choice = "rest";
        }
        if(input.equals("2"))
        {
            System.out.println("You stayed in the pizzeria.");
            choice = "stay";
        }
        return choice;
    }

    public static int night() throws InterruptedException {
        int ld = 0;
        Thread.sleep(1000);
        System.out.println("You found a suspicious little door in the back of the kitchen. Should you investigate?");
        System.out.println("1. Investigate\n2. The eerie door terrifies you. You head back home instead.\n(Enter 1 or 2)");
        Scanner door = new Scanner(System.in);
        String input = door.nextLine();

        if(input.equals("1"))
        {
            System.out.println("You open the door. There is a very dark tunnel. You cannot see the end of it.");
            System.out.println("1. Your curiosity gets the best of you. Keep going.\n2. You head back instead.\n(Enter 1 or 2)");

            String go = door.nextLine();
            if (go.equals("1"))
            {
                System.out.println("You went deeper into the tunnel. After 10 minutes of darkness and silence except for your own heartbeat, you reach a dimly lit room.\nThe manager is tied to a chair in the center.");
                Thread.sleep(2000);
                System.out.println("You: \"What are you doing here?\"");
                Thread.sleep(2000);
                System.out.println("Manager: \"No, what are YOU doing here?? Run, before he catches you as well...\"");
                Thread.sleep(2000);
                System.out.println("What should you do?\n1. Keep questioning the manager\n2. Leave before it's too late.");
                Scanner question = new Scanner(System.in);
                int inputTwo = question.nextInt();
                if(inputTwo == 1)
                {
                    System.out.println("You keep asking your questions.");
                    Thread.sleep(2000);
                    System.out.println("You: \"What happened to you?\"");
                    Thread.sleep(2000);
                    System.out.println("Manager: \"My son...he turned out to be an evil child...he plans to murder me, and all of you tomorrow, then take all my wealth, along with this pizzeria.\"");
                    Thread.sleep(2000);
                    System.out.println("Manager: \"I advise you to turn back before he finds out you're here...\"");
                    Thread.sleep(2000);
                    System.out.println("Suddenly, you feel a sharp metal object piercing through your back. You have been stabbed by the manager's son.");
                    ld = 0;
                }
                if(inputTwo == 2)
                {
                    System.out.println("You run away as fast as you can. Your heart races with panic. You worry about your manager, but at least you're \"safe\" for now...");
                    Thread.sleep(2000);
                    System.out.println("You struggle to fall asleep. You think about how you should save the manager and keep yourself alive tomorrow.");
                    ld = 2;
                }

            }
            if (go.equals("2"))
            {
                System.out.println("You went home.");
                ld = 1;
            }
        }
        if(input.equals("2"))
        {
            System.out.println("You head back.");
            ld = 1;
        }
        return ld;
    }

    public static boolean dough() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nFirst, you need to make the dough. The recipe calls for a 1:3 ratio of cups of water to cups of flour.");
        System.out.println("How many cups of water should we use?");
        Scanner dough = new Scanner(System.in);
        int water = dough.nextInt();
        System.out.println("How many cups of flour should we use?");
        int flour = dough.nextInt();

        boolean fs = true;
        if((water*3 == flour)||(flour/3 == water))
        {
            System.out.println("You whisk the ingredients together. Great job! The dough is looking okay.");
            fs = true;
        }
        else
        {
            System.out.println("You whisk the ingredients together. You've failed!");
            fs = false;
        }

        return fs;
        /*System.out.println("A few sets of ingredients are presented before you. Which ones should we whisk together?");
        System.out.println("1. Yeast, Flour, Water\n2. Flour, Water, Olive oil\n3. Flour, Yeast, Olive oil\n(Enter 1, 2, or 3)");
        Scanner dough = new Scanner(System.in);
        String input = dough.nextLine();

        boolean fs = true;
        if(input.equals("1"))
        {
            System.out.println("You whisk the ingredients together. The dough is looking delicious!");
            fs = true;
        }
        if(input.equals("2"))
        {
            System.out.println("You whisk the ingredients together. You forgot to add yeast!");
            fs = false;
        }
        if(input.equals("3"))
        {
            System.out.println("You whisk the ingredients together. You end up with a dry clump of flour.");
            fs = false;
        }

        return fs;

         */
    }
    public static boolean rise() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nYour dough is looking great. How long should we let it rise for?");
        System.out.println("1. 1 minute\n2. 1 hour\n3. 5 hours\n(Enter 1, 2, or 3)");
        Scanner rise = new Scanner(System.in);
        String input = rise.nextLine();

        boolean fs = true;
        if(input.equals("1"))
        {
            System.out.println("Have some patience! Your dough is looking sad.");
            fs = false;
        }
        if(input.equals("2"))
        {
            System.out.println("The dough has doubled in size. It looks nice and fluffy!");
            fs = true;
        }
        if(input.equals("3"))
        {
            System.out.println("You forgot about your rising dough, and it's been eaten raw by the manager's 3 year old son.");
            fs = false;
        }

        return fs;
    }
    public static boolean shape() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nIt's time to shape your dough. The recipe says we should punch AND knead the dough for 4 minutes in total.");
        System.out.println("How long will you punch the dough for? (minutes)");
        Scanner dough = new Scanner(System.in);
        int punch = dough.nextInt();
        System.out.println("How long will you knead the dough for?(minutes)");
        int knead = dough.nextInt();

        boolean fs = true;
        if(((punch + knead) == 4)||(4-(knead + punch)==0))
        {
            System.out.println("Nice job!");
            fs = true;
        }
        else
        {
            System.out.println("Your dough isn't looking very pretty...");
            fs = false;
        }
        return fs;
    }
    public static boolean toppings() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nToppings time! What would you add?");
        System.out.println("1. Tomato sauce, Cheese, ham, pineapples\n2. Ketchup, ketchup, ketchup.\n3. Gummy bears\n(Enter 1, 2, or 3)");
        Scanner toppings = new Scanner(System.in);
        String input = toppings.nextLine();

        boolean fs = true;
        if(input.equals("1"))
        {
            System.out.println("Great job! You add pineapples to please the manager. His son LOVES pineapple pizza!");
            fs = true;
        }
        if(input.equals("2"))
        {
            System.out.println("Absolutely disgusting.");
            fs = false;
        }
        if(input.equals("3"))
        {
            System.out.println("Maybe you should work at a candy store instead...");
            fs = false;
        }

        return fs;
    }
    public static boolean bake() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nNow to bake the pizza. How long should we bake it for?");
        System.out.println("1. 5 hours\n2. Put it in the freezer instead.\n3. 15 minutes\n(Enter 1, 2, or 3)");
        Scanner bake = new Scanner(System.in);
        String input = bake.nextLine();

        boolean fs = true;
        if(input.equals("1"))
        {
            System.out.println("It burnt to a crisp! This isn't even well done steak...This is congratulations...");
            fs = false;
        }
        if(input.equals("2"))
        {
            System.out.println("Maybe you should buy microwavable pizza instead.");
            fs = false;
        }
        if(input.equals("3"))
        {
            System.out.println("Nice! The pizza smells really good and the crust is golden.");
            fs = true;
        }

        return fs;
    }
    public static int howMany() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nYou have some ingredients left. You can choose to make more pineapple pizzas.");
        Thread.sleep(1000);
        System.out.println("One pineapple pizza needs 3 slices of pineapples. There are 18 slices left.");
        Thread.sleep(1000);
        System.out.println("How many more do you want to make?");

        System.out.println("1. Use up all the remaining slices\n2. 5 more pizzas\n3. None\n(Enter 1, 2, or 3)");
        Scanner bake = new Scanner(System.in);
        int input = bake.nextInt();
        int slicesLeft = 18;
        if(input == 1)
        {
            return slicesLeft%3;
        }
        if(input == 2)
        {
            return slicesLeft - 3*5;
        }

        return slicesLeft;
    }


}










