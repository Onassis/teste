package br.com.fenix;

import java.util.function.Predicate;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OLA GIT");
		System.out.println("branch DEV");

		Predicate<String> startsWithA = (text) -> text.startsWith("A");
		Predicate<String> endsWithX   = (text) -> text.endsWith("x");

		Predicate<String> startsWithAAndEndsWithX =
        (text) -> startsWithA.test(text) && endsWithX.test(text);

        String  input  = "A hardworking person must relaa";
        boolean result = startsWithAAndEndsWithX.test(input);
        System.out.println(result);
        
        System.out.println("--------- composed And -----------------------"); 
        Predicate<String> composed = startsWithA.and(endsWithX);
        result = composed.test(input);
        System.out.println(result);

        System.out.println("--------- composed Or  -----------------------"); 
        
        Predicate<String> composedOr = startsWithA.or(endsWithX);
        result = composedOr.test(input);
        System.out.println(result);

	}

}
