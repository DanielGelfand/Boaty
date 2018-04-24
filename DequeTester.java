public class DequeTester {

	public static void main(String[] args) {
		Deque<String> gummo = new QQKachoo<String>();

		//testing offerFirst and addLast
		gummo.offerFirst("Yeet");
		gummo.offerFirst("Yote");
		gummo.offerLast("Yate");
		gummo.offerLast("Yute");
		gummo.offerFirst("Yite");

		System.out.println("gummo: " + gummo + "\n");//expecting Yite, Yote, Yeet, Yate, Yute
			
		System.out.println("TESTING pollFirst()");
		//testing pollFirst()
		while(!gummo.isEmpty()){
			System.out.println(gummo.pollFirst());
		}

		gummo.offerFirst("Yeet");
		gummo.offerFirst("Yote");
		gummo.offerLast("Yate");
		gummo.offerLast("Yute");
		gummo.offerFirst("Yite");

		System.out.println("gummo: " + gummo + "\n");

		System.out.println("TESTING pollLast()");
		//testing pollLast()
		while(!gummo.isEmpty()){
			System.out.println(gummo.pollLast());
		}
	}
}
