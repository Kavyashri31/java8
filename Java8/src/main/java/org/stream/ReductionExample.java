package org.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

	public static void main(String[] args) {

		
		List<Integer> list = Arrays.asList();
		
		Optional<Integer> red =
				list.stream().reduce(Integer::max);

		int result = red.orElse(0);
		System.out.println("Result:" + result);
	}

}
