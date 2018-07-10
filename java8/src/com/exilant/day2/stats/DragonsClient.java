package com.exilant.day2.stats;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient {
	public static void main(String[] args) {
		List<Dragons> dragons=Stream.of(
				new Dragons("Errol","USA",15),
				new Dragons("Errol","USA",33),
				new Dragons("Firnan","USA",5),
				new Dragons("Hasai","France",12),
				new Dragons("IceFire","France",13)	
				).collect(Collectors.toList());
		//to find number of dragons
		
	}

}
