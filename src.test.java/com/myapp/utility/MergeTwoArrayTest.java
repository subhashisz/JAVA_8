package com.myapp.utility;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeTwoArrayTest {
	
	String [] strArray1= {"a"};
	String [] strArray2= {"b"};
	String [] expectedStringArray= {"a","b"};

	@Test
	public void givenTwoStringArrays_whenConcatWithList_thenGetExpectedResult() {
	    String[] result = MergeTwoArray.concatWithCollection(strArray1, strArray2);
	    
	}

}
