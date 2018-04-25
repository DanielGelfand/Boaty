//Driver from Square

public class DequeTester2 {
    public static void main(String[] args) {
	QQKachoo<Integer> bot = new QQKachoo<Integer>();
	System.out.println("Adding 4");
	System.out.println("before: "+bot);
	System.out.println(bot.offerFirst(4));
       	System.out.println("after: "+bot);
	System.out.println("Adding 6");
	System.out.println("before: "+bot);
	System.out.println(bot.offerFirst(6));
       	System.out.println("after: "+bot); //6,4
	bot.offerLast(7);
	System.out.println(bot); //6,4,7
	System.out.println("peekFirst: "+bot.peekFirst());//6
	System.out.println("peekLast: "+bot.peekLast());//7
	System.out.println("isEmpty: "+bot.isEmpty());
	System.out.println("pollFirst: "+bot.pollFirst());//6
	System.out.println(bot);
	System.out.println("pollLast: "+bot.pollLast());//7
	System.out.println(bot);
	bot.pollFirst();
	System.out.println(bot);//empty
	System.out.println(bot.isEmpty());//true
	
    }	
}
