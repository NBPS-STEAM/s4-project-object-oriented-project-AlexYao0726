import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a well developed personality guess machine:D");
        System.out.println("Please answer the following questions using (true) or (false)");
        System.out.println("1. Are you a boy?");
        boolean boy = input.nextBoolean();
        if(boy == true)
        {
          System.out.println("2. Do you like to eat hot dog?");
          boolean hotdog = input.nextBoolean();
          if(hotdog == true)
          {
            System.out.println("Result: You are a boy who likes to eat hot dog.");
            Hotdog h1 = new Hotdog();
            System.out.print("Here is a ");
            System.out.print(h1.length);
            System.out.print(" inches Hotdog made with ");
            System.out.print(h1.bread);
            System.out.print(" & ");
            System.out.print(h1.meat);
            System.out.print(". Enjoy! :D");
          }
          else
          {
            System.out.println("Result: You are a boy who doesn't like to eat hot dog. :c");
          }
        }
        if(boy == false)
        {
          System.out.println("2. Do you like to eat pizza?");
          boolean pizza = input.nextBoolean();
          if(pizza == true)
          {
            System.out.println("Result: You are a girl who likes to eat pizza.");
            Pizza p1 = new Pizza();
            System.out.print("Here is a ");
            System.out.print(p1.length);
            System.out.print(" inches Pizza made with ");
            System.out.print(p1.bread);
            System.out.print(" & ");
            System.out.print(p1.meat);
            System.out.print(". Enjoy! :D");
          }
          else
          {
            System.out.println("Result: You are a girl who doesn't like to eat pizza. :c");
          }
        }
    }
}
