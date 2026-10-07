package com;

public class AccountOperations {
	public static void main(String[] args) {
//		String input="getCurrency";
		//String input="getAccountName";
		String input="getLongAccountName";
		String outputString=userFriendlyName(input);
		System.out.println("Output:"+outputString);
	}

	private static String userFriendlyName(String input) {
		String outputString="";
		if(input!=null) {
			String nmaeString=input.substring(3, input.length());
			System.out.println("nmaeString:"+nmaeString);
			char[] array=nmaeString.toCharArray();
			int index=0;
			for (int i=0;i<array.length;i++) {
				
				
				if(index!=0 && Character.isUpperCase(array[i])) {
					
					getSubString(index,nmaeString);
					outputString=outputString+"_"+array[i];
				}else {
					outputString=outputString+array[i];
				}
				index++;
			}
			
		}
		return outputString;
	}

	private static void getSubString(int index, String nmaeString) {
		System.out.println(); nmaeString.substring(index, nmaeString.length());
	}

}
