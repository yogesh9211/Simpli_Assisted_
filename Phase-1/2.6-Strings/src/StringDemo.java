
public class StringDemo {
	public static void main(String[] args) {
		String s = "Simplilearn";
		//uppercase
		System.out.println(s.toUpperCase());
		//lower case
		System.out.println(s.toLowerCase());
		//substring
		System.out.println(s.substring(2));
		System.out.println(s.substring(5, 9));
		
		//replace
		String replace=s.replace('e', 'l');
		System.out.println(replace);

		//equals
				String x="Welcome to Java";
				String y="WeLcOmE tO JaVa";
				System.out.println(x.equals(y));
		 
				//StringBuilder
				System.out.println("\n");
				System.out.println("Creating StringBuilder");
				StringBuilder sb1=new StringBuilder("started");
				sb1.append("Learning");
				System.out.println(sb1);

				System.out.println(sb1.delete(0, 1));

				System.out.println(sb1.insert(1, "Welcome"));

				System.out.println(sb1.reverse());

}
}
