package com.qa.main;

public class Fibonaci {
	int max;
	
	public Fibonaci(int max) {
		this.max = max;
	}
	
	public int firstByDigits() {
		String a = "1";
		String b = "1";
		int index = 2;
		boolean onA = true;
		
		while (a.length() < max && b.length() < max) {
			if(onA) {
				a = addString(a,b);
				onA = false;
			}
			else {
				b = addString(a,b);
				onA = true;
			}
			index++;
		}
		
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		return index;
	}
	
	private String addString(String a, String b) {
		while (a.length() != b.length()) {
			if (a.length() > b.length()) {
				b = "0" + b;
			} else {
				a = "0" + a;
			}
		}
		StringBuilder result = new StringBuilder();
		int carry = 0;
		
		for (int i = a.length()-1; i >= 0; i--) {
			int addNums = addStringNums(a.substring(i,i+1), b.substring(i, i+1), carry);
			carry = addNums / 10;
			result.insert(0, Integer.toString(addNums % 10));
		}
		
		if (carry == 1) result.insert(0, 1);
		
		return result.toString();
	}
	
	private int addStringNums(String a, String b, int carry) {
		return Integer.valueOf(a) + Integer.valueOf(b) + carry;
	}
}
